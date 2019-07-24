package com.ppp.entity;

import java.util.Date;

public class Notice {
   private int noticeid;
   private int postid;
   private int getid;
   private String context;
   private Date createtime;

    public int getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(int noticeid) {
        this.noticeid = noticeid;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public int getGetid() {
        return getid;
    }

    public void setGetid(int getid) {
        this.getid = getid;
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
        return "Notice{" +
                "noticeid=" + noticeid +
                ", postid=" + postid +
                ", getid=" + getid +
                ", context='" + context + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
