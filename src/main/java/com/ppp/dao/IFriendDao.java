package com.ppp.dao;

import com.ppp.entity.Friend;
import com.ppp.entity.UserAndFriend;
import com.ppp.entity.Users;

import java.util.List;

public interface IFriendDao {
    int addFriend(Friend friend);
    List<UserAndFriend> getUserAndFriend(UserAndFriend userAndFriend);

}
