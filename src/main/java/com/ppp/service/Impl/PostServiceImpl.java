package com.ppp.service.Impl;

import com.ppp.dao.IPostDao;
import com.ppp.entity.Post;
import com.ppp.service.IPostService;
import com.ppp.ulits.NewNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
@Service
public class PostServiceImpl implements IPostService {
    @Autowired
    private IPostDao postDao;
    @Override
    public int add(Post post) {

       return postDao.add(post);
    }

    @Override
    public int del(int postid) {
        return postDao.del(postid);
    }
}
