package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.model.Comment;

import java.util.List;

public interface CommentService {
    void saveComment(Comment comment);

    void deleteComment(Integer commentId);

    Comment getComment(Integer commentId);

    void updateComment(Comment comment);

    List<Comment> getAll();
}
