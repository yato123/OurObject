package com.ppp.entity;

import java.util.Date;

public class Post {
    private int postid;
    private int userid;
    private String content;
    private String photo;
    private Date createtime;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", userid=" + userid +
                ", content='" + content + '\'' +
                ", photo='" + photo + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
