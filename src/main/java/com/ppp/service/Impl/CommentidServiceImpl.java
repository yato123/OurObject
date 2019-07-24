package com.ppp.service.Impl;

import com.ppp.dao.ICommentidDao;
import com.ppp.entity.Commentid;
import com.ppp.service.ICommentidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentidServiceImpl implements ICommentidService {
    @Autowired
    private ICommentidDao commentidDao;
    @Override
    public int addComment(Commentid commentid) {
        if (commentid.getContext() != null){
        return commentidDao.addComment(commentid);}
        return -1;
    }

    @Override
    public int delComment(int commentid) {
        return commentidDao.delComment(commentid);
    }
}
