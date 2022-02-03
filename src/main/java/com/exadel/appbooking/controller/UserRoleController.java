package com.exadel.appbooking.controller;

import com.exadel.appbooking.entity.UserRole;
import com.exadel.appbooking.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/userRole")
public class UserRoleController {


    @Autowired
    UserRoleRepository userRoleRepository;

    @GetMapping
    public List<UserRole> getList(){
        List<UserRole> all = userRoleRepository.findAll();
        return all;
    }

    @PostMapping
    public boolean addUserRole(){
        UserRole userRole = new UserRole();
        userRole.setRoleName("director");

        userRoleRepository.save(userRole);
        return true;
    }
}
