package com.ppp.controller;

import com.ppp.entity.Friend;
import com.ppp.entity.UserAndFriend;
import com.ppp.service.FriendService;
import com.ppp.service.Impl.FriendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    private FriendServiceImpl friendService;
    @RequestMapping("/toAddFriend")
    public String addFriend(Friend friend, HttpServletRequest request){
        
        return friendService.addFriend(friend)+"";
    }
    @RequestMapping("/toGetFriend")
    public List<UserAndFriend> getFriend(Friend friend){
        return friendService.getUserAndFriend(friend);
    }
}
