package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.Order;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class OrderController {
    @Resource(name="orderServiceImpl")
    OrderService orderService;

    @PostMapping("/order")
    public @ResponseBody
    AjaxResponse saveOrder(@RequestBody Order order){

        log.info("saveOrder:{}",order);
        orderService.saveOrder(order);
        return AjaxResponse.success(order);
    }

    @GetMapping("/order/{id}")
    public @ResponseBody AjaxResponse getOrder(@RequestBody Integer oId){
        log.info("getOrder:{}",orderService.getOrder(oId));
        return AjaxResponse.success();
    }

    @GetMapping("/order")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(orderService.getAll());
    }

    @DeleteMapping("/order/{id}")
    public @ResponseBody AjaxResponse deleteOrder(@RequestBody Integer oId){
        orderService.deleteOrder(oId);
        return AjaxResponse.success();
    }
}
