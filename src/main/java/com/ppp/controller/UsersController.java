package com.ppp.controller;

import com.ppp.entity.Users;
import com.ppp.service.Impl.UsersServiceImpl;
import com.ppp.ulits.NewNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class UsersController {
    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping(value = "/toPerfectInformation",method = RequestMethod.POST)
    @ResponseBody
    public String userPerfectInformation(Users users, MultipartFile file, HttpServletRequest request){
        String newName = NewNameUtils.perfectInformation(file, request);
        users.setPhoto(newName);
         return usersService.perfectInformation( users)+"";
    }
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }


}
