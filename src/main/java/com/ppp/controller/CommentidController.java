package com.ppp.controller;

import com.ppp.entity.Commentid;
import com.ppp.service.Impl.CommentidServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
@Controller
//@RequestMapping("/")
public class CommentidController {
    @Autowired
    private CommentidServiceImpl commentidService;
    @RequestMapping("/addCommentid")
    @ResponseBody
    public String addCommentid(Commentid commentid){
        commentid.setCreatetime(new Date());
        return commentidService.addComment(commentid)+"";

    }
    @RequestMapping("/del")
    @ResponseBody
    public String delCommentid(int commentid){
        return commentidService.delComment(commentid)+"";
    }



    @RequestMapping( value = "/",method = RequestMethod.GET)
    public String toaddCommentid(){
        return "";
    }
}
