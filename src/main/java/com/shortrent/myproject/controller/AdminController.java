package com.shortrent.myproject.controller;


import com.shortrent.myproject.generator.model.Admin;
import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.service.AdminService;
import com.shortrent.myproject.service.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class AdminController {

    @Resource(name="adminServiceImpl")
    AdminService adminService;

    @PostMapping("/admins")
    public @ResponseBody AjaxResponse saveAdmin(@RequestBody Admin admin){

        log.info("saveAdmin:{}",admin);
        adminService.saveAdmin(admin);
        return AjaxResponse.success(admin);
    }

    @GetMapping("/admins/{id}")
    public @ResponseBody AjaxResponse getAdmin(@RequestBody Integer adminId){
        log.info("getAdmin:{}",adminService.getAdmin(adminId));
        return AjaxResponse.success();
    }

    @GetMapping("/admins")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(adminService.getAll());
    }

    @DeleteMapping("/admins/{id}")
    public @ResponseBody AjaxResponse deleteAdmin(@RequestBody Integer adminId){
        adminService.deleteAdmin(adminId);
        return AjaxResponse.success();
    }

}
