package com.ppp.service.Impl;

import com.ppp.dao.IUsersDao;
import com.ppp.entity.Users;
import com.ppp.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private IUsersDao usersDao;
    @Override
    @ResponseBody
    public Integer perfectInformation(Users users){

        return usersDao.perfectInformation(users);
    }


}
