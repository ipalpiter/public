package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.CommentDao;
import com.shortrent.myproject.generator.model.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
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
