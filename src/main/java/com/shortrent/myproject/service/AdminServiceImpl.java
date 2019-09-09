package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.AdminDao;
import com.shortrent.myproject.generator.model.Admin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;
@Slf4j
@Service

public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    @Override
    public void saveAdmin(Admin admin) {
        adminDao.insert(admin);
    }

    @Override
    public void deleteAdmin(Integer adminId) {
        adminDao.deleteByPrimaryKey(adminId);
    }

    @Override
    public Admin getAdmin(Integer adminId) {
        return adminDao.selectByPrimaryKey(adminId);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminDao.updateByPrimaryKeySelective(admin);
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> admins =  adminDao.selectByExample(null);
        return admins;
    }
}
