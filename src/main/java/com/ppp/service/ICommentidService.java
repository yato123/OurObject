package com.ppp.service;

import com.ppp.entity.Commentid;

public interface ICommentidService {
    int addComment(Commentid commentid);
    int delComment(int commentid);
}
