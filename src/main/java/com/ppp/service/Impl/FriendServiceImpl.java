package com.ppp.service.Impl;
import com.ppp.dao.IFriendDao;
import com.ppp.entity.Friend;
import com.ppp.entity.UserAndFriend;
import com.ppp.entity.Users;
import com.ppp.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    private IFriendDao friendDao;
    @Override
    public int addFriend(Friend friend) {
        if (friend.getUserid() >0 && friend.getFriend() >0){

            friend.setCreatetime(new Date());
        return friendDao.addFriend(friend);
        }return -1;
    }

    @Override
    public List<UserAndFriend> getUserAndFriend(UserAndFriend userAndFriend) {
        if (userAndFriend.getFriend() >0 && userAndFriend.getUserid() >0){
        return friendDao.getUserAndFriend(userAndFriend);
        }
        return null;
    }
}
