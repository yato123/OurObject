package com.ppp.controller;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.ppp.entity.Post;
import com.ppp.service.Impl.PostServiceImpl;
import com.ppp.ulits.NewNameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/index2")
public class PostController {
    @Autowired
    private PostServiceImpl postService;
    @RequestMapping("/addPost")
    @ResponseBody
    public String  addPost(Post post, MultipartFile file, HttpServletRequest request){
        String newName = NewNameUtils.perfectInformation(file, request);
        post.setPhoto(newName);
        post.setCreatetime(new Date());
        return postService.add(post)+"";
    }
    @ResponseBody
    @RequestMapping("/addPostFile")
    public String addPost(Post post){
        post.setCreatetime(new Date());
        return postService.add(post)+"";
    }
    @ResponseBody
    @RequestMapping("/delPost")
    public String delPost(int postid){
        return postService.del(postid)+"";
    }

    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String toIndex(){
        return "index2";
    }
}
