package com.ppp.entity;

import java.util.Date;

public class Commentid {
   private int commentid;
   private int postid;
   private int userid;
   private String context;
   private Date createtime;

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Commentid{" +
                "commentid=" + commentid +
                ", postid=" + postid +
                ", userid=" + userid +
                ", context='" + context + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
