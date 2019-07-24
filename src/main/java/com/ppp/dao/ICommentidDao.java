package com.ppp.dao;

import com.ppp.entity.Commentid;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentidDao {
    int addComment(Commentid commentid);
    int delComment(int commentid);
}
