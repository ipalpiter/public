package com.shortrent.myproject.service;


import com.shortrent.myproject.generator.model.Admin;
import java.util.List;


public interface AdminService {

    void saveAdmin(Admin admin);

    void deleteAdmin(Integer adminId);

    Admin getAdmin(Integer adminId);

    void updateAdmin(Admin admin);

    List<Admin> getAll();


}
