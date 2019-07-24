package com.ppp.service;

import com.ppp.entity.Friend;
import com.ppp.entity.UserAndFriend;
import com.ppp.entity.Users;

import java.util.List;

public interface FriendService {
    int addFriend(Friend firend);
    List<UserAndFriend> getUserAndFriend(UserAndFriend userAndFriend);
}
