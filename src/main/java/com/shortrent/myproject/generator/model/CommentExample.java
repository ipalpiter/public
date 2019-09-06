package com.shortrent.myproject.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNull() {
            addCriterion("house_photo is null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNotNull() {
            addCriterion("house_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoEqualTo(String value) {
            addCriterion("house_photo =", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotEqualTo(String value) {
            addCriterion("house_photo <>", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThan(String value) {
            addCriterion("house_photo >", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("house_photo >=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThan(String value) {
            addCriterion("house_photo <", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThanOrEqualTo(String value) {
            addCriterion("house_photo <=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLike(String value) {
            addCriterion("house_photo like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotLike(String value) {
            addCriterion("house_photo not like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIn(List<String> values) {
            addCriterion("house_photo in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotIn(List<String> values) {
            addCriterion("house_photo not in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoBetween(String value1, String value2) {
            addCriterion("house_photo between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotBetween(String value1, String value2) {
            addCriterion("house_photo not between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNull() {
            addCriterion("check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNotNull() {
            addCriterion("check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeEqualTo(Date value) {
            addCriterion("check_in_time =", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotEqualTo(Date value) {
            addCriterion("check_in_time <>", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThan(Date value) {
            addCriterion("check_in_time >", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_in_time >=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThan(Date value) {
            addCriterion("check_in_time <", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_in_time <=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIn(List<Date> values) {
            addCriterion("check_in_time in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotIn(List<Date> values) {
            addCriterion("check_in_time not in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeBetween(Date value1, Date value2) {
            addCriterion("check_in_time between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_in_time not between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andHostRangeIsNull() {
            addCriterion("host_range is null");
            return (Criteria) this;
        }

        public Criteria andHostRangeIsNotNull() {
            addCriterion("host_range is not null");
            return (Criteria) this;
        }

        public Criteria andHostRangeEqualTo(String value) {
            addCriterion("host_range =", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeNotEqualTo(String value) {
            addCriterion("host_range <>", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeGreaterThan(String value) {
            addCriterion("host_range >", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeGreaterThanOrEqualTo(String value) {
            addCriterion("host_range >=", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeLessThan(String value) {
            addCriterion("host_range <", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeLessThanOrEqualTo(String value) {
            addCriterion("host_range <=", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeLike(String value) {
            addCriterion("host_range like", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeNotLike(String value) {
            addCriterion("host_range not like", value, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeIn(List<String> values) {
            addCriterion("host_range in", values, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeNotIn(List<String> values) {
            addCriterion("host_range not in", values, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeBetween(String value1, String value2) {
            addCriterion("host_range between", value1, value2, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHostRangeNotBetween(String value1, String value2) {
            addCriterion("host_range not between", value1, value2, "hostRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeIsNull() {
            addCriterion("house_range is null");
            return (Criteria) this;
        }

        public Criteria andHouseRangeIsNotNull() {
            addCriterion("house_range is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRangeEqualTo(String value) {
            addCriterion("house_range =", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeNotEqualTo(String value) {
            addCriterion("house_range <>", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeGreaterThan(String value) {
            addCriterion("house_range >", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeGreaterThanOrEqualTo(String value) {
            addCriterion("house_range >=", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeLessThan(String value) {
            addCriterion("house_range <", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeLessThanOrEqualTo(String value) {
            addCriterion("house_range <=", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeLike(String value) {
            addCriterion("house_range like", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeNotLike(String value) {
            addCriterion("house_range not like", value, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeIn(List<String> values) {
            addCriterion("house_range in", values, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeNotIn(List<String> values) {
            addCriterion("house_range not in", values, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeBetween(String value1, String value2) {
            addCriterion("house_range between", value1, value2, "houseRange");
            return (Criteria) this;
        }

        public Criteria andHouseRangeNotBetween(String value1, String value2) {
            addCriterion("house_range not between", value1, value2, "houseRange");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}