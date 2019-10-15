package club.doanything.trendfinder.admin.controller;

import club.doanything.trendfinder.api.entity.SysUser;
import club.doanything.trendfinder.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public SysUser get(@PathVariable int id){
        return userService.selectById(id);
    }
}
