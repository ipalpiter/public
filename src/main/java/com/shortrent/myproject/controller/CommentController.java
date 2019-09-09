package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.Admin;
import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.Comment;
import com.shortrent.myproject.service.AdminService;
import com.shortrent.myproject.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Slf4j
@Controller
@RequestMapping("/purerent")
public class CommentController {
    @Resource(name="commentServiceImpl")
    CommentService commentService;

    @PostMapping("/comment")
    public @ResponseBody
    AjaxResponse saveComment(@RequestBody Comment comment){

        log.info("saveComment:{}",comment);
        commentService.saveComment(comment);
        return AjaxResponse.success(comment);
    }

    @GetMapping("/comment/{id}")
    public @ResponseBody AjaxResponse getComment(@RequestBody Integer commentId){
        log.info("getComment:{}",commentService.getComment(commentId));
        return AjaxResponse.success();
    }

    @GetMapping("/comment")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(commentService.getAll());
    }

    @DeleteMapping("/comment/{id}")
    public @ResponseBody AjaxResponse deleteComment(@RequestBody Integer commentId){
        commentService.deleteComment(commentId);
        return AjaxResponse.success();
    }
}
