package com.ppp.entity;

import java.util.Date;

public class Friend {
    private int userid;
    private int friend;
    private int  confirm;
    private Date createtime;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getFriend() {
        return friend;
    }

    public void setFriend(int friend) {
        this.friend = friend;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "userid=" + userid +
                ", friend=" + friend +
                ", confirm=" + confirm +
                ", createtime=" + createtime +
                '}';
    }
}
