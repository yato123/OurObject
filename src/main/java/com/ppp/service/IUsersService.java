package com.ppp.service;

import com.alibaba.fastjson.JSON;
import com.ppp.entity.Post;
import com.ppp.entity.Users;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface IUsersService {
    Integer perfectInformation(Users users);
   }
