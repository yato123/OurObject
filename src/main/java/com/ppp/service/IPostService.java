package com.ppp.service;

import com.ppp.entity.Post;

public interface IPostService {
    int add(Post post);
    int del(int postid);
}
