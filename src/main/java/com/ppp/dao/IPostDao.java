package com.ppp.dao;

import com.ppp.entity.Post;

public interface IPostDao {
    int add(Post post);
    int del(int postid);
}
