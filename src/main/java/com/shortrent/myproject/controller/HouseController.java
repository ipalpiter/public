package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.Comment;
import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.service.CommentService;
import com.shortrent.myproject.service.HouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class HouseController {
    @Resource(name="houseServiceImpl")
    HouseService houseService;

    @PostMapping("/house")
    public @ResponseBody
    AjaxResponse saveHouse(@RequestBody House house){

        log.info("saveHouse:{}",house);
        houseService.saveHouse(house);
        return AjaxResponse.success(house);
    }

    @GetMapping("/house/{id}")
    public @ResponseBody AjaxResponse getHouse(@RequestBody Integer hId){
        log.info("getHouse:{}",houseService.getHouse(hId));
        return AjaxResponse.success();
    }

    @GetMapping("/house")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(houseService.getAll());
    }

    @DeleteMapping("/house/{id}")
    public @ResponseBody AjaxResponse deleteHouse(@RequestBody Integer hId){
        houseService.deleteHouse(hId);
        return AjaxResponse.success();
    }
}
