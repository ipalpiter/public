package com.shortrent.myproject.generator.model;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
public class Comment implements Serializable {
    private Integer commentId;

    private String userName;

    private Integer orderId;

    private String commentContent;

    private String housePhoto;

    private Date checkInTime;

    private String hostRange;

    private String houseRange;

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getHousePhoto() {
        return housePhoto;
    }

    public void setHousePhoto(String housePhoto) {
        this.housePhoto = housePhoto;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getHostRange() {
        return hostRange;
    }

    public void setHostRange(String hostRange) {
        this.hostRange = hostRange;
    }

    public String getHouseRange() {
        return houseRange;
    }

    public void setHouseRange(String houseRange) {
        this.houseRange = houseRange;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Comment other = (Comment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getCommentContent() == null ? other.getCommentContent() == null : this.getCommentContent().equals(other.getCommentContent()))
            && (this.getHousePhoto() == null ? other.getHousePhoto() == null : this.getHousePhoto().equals(other.getHousePhoto()))
            && (this.getCheckInTime() == null ? other.getCheckInTime() == null : this.getCheckInTime().equals(other.getCheckInTime()))
            && (this.getHostRange() == null ? other.getHostRange() == null : this.getHostRange().equals(other.getHostRange()))
            && (this.getHouseRange() == null ? other.getHouseRange() == null : this.getHouseRange().equals(other.getHouseRange()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getCommentContent() == null) ? 0 : getCommentContent().hashCode());
        result = prime * result + ((getHousePhoto() == null) ? 0 : getHousePhoto().hashCode());
        result = prime * result + ((getCheckInTime() == null) ? 0 : getCheckInTime().hashCode());
        result = prime * result + ((getHostRange() == null) ? 0 : getHostRange().hashCode());
        result = prime * result + ((getHouseRange() == null) ? 0 : getHouseRange().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", userName=").append(userName);
        sb.append(", orderId=").append(orderId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", housePhoto=").append(housePhoto);
        sb.append(", checkInTime=").append(checkInTime);
        sb.append(", hostRange=").append(hostRange);
        sb.append(", houseRange=").append(houseRange);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}