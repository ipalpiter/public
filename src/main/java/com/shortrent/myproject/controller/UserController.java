package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.Order;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.service.OrderService;
import com.shortrent.myproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Slf4j
@Controller
@RequestMapping("/purerent")
public class UserController {

    @Resource(name="userServiceImpl")
    UserService userService;

    @PostMapping("/user")
    public @ResponseBody
    AjaxResponse saveUser(@RequestBody User user){

        log.info("saveUser:{}",user);
        userService.saveUser(user);
        return AjaxResponse.success(user);
    }

    @GetMapping("/user/{id}")
    public @ResponseBody AjaxResponse getUser(@RequestBody Integer userId){
        log.info("getUser:{}",userService.getUser(userId));
        return AjaxResponse.success();
    }

    @GetMapping("/user")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(userService.getAll());
    }

    @DeleteMapping("/user/{id}")
    public @ResponseBody AjaxResponse deleteUser(@RequestBody Integer userId){
        userService.deleteUser(userId);
        return AjaxResponse.success();
    }
}
