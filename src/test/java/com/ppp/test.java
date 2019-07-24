package com.ppp;

import com.ppp.entity.Users;
import com.ppp.service.Impl.UsersServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"})
public class test {
    @Autowired
    private Users users1;
    @Autowired
    private UsersServiceImpl usersService;
//    @Test
//    public void test01(){
//        Users users = new Users();
//        users.setNickname("基佬亮");
//        users.setBirth(new Date());
//        users.setConstellation("好难座");
//        users.setHobby("唱,跳");
//        users.setSex("女");
//        users.setPhoto("213.png");
//        users.setUserid(1);
//        usersService.perfectInformation(users);
//        System.out.println(usersService.perfectInformation(users));

//    }
}
