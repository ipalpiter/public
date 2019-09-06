package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.CommentDao;
import com.shortrent.myproject.generator.model.Comment;

import javax.annotation.Resource;
import java.util.List;

public class CommentServiceImpl implements CommentService{

    @Resource
    private CommentDao commentDao;

    @Override
    public void saveComment(Comment comment) {
        commentDao.insert(comment);
    }

    @Override
    public void deleteComment(Integer commentId) {
        commentDao.deleteByPrimaryKey(commentId);
    }

    @Override
    public Comment getComment(Integer commentId) {
        return commentDao.selectByPrimaryKey(commentId);
    }

    @Override
    public void updateComment(Comment comment) {
        commentDao.updateByPrimaryKeySelective(comment);
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> comments=commentDao.selectByExample(null);
        return comments;
    }
}
