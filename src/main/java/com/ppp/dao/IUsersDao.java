package com.ppp.dao;

import com.ppp.entity.Post;
import com.ppp.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersDao {
    Integer perfectInformation(Users users);

}
