package com.shortrent.myproject.generator.model;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HouseExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHDelocationIsNull() {
            addCriterion("h_delocation is null");
            return (Criteria) this;
        }

        public Criteria andHDelocationIsNotNull() {
            addCriterion("h_delocation is not null");
            return (Criteria) this;
        }

        public Criteria andHDelocationEqualTo(String value) {
            addCriterion("h_delocation =", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationNotEqualTo(String value) {
            addCriterion("h_delocation <>", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationGreaterThan(String value) {
            addCriterion("h_delocation >", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationGreaterThanOrEqualTo(String value) {
            addCriterion("h_delocation >=", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationLessThan(String value) {
            addCriterion("h_delocation <", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationLessThanOrEqualTo(String value) {
            addCriterion("h_delocation <=", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationLike(String value) {
            addCriterion("h_delocation like", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationNotLike(String value) {
            addCriterion("h_delocation not like", value, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationIn(List<String> values) {
            addCriterion("h_delocation in", values, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationNotIn(List<String> values) {
            addCriterion("h_delocation not in", values, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationBetween(String value1, String value2) {
            addCriterion("h_delocation between", value1, value2, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHDelocationNotBetween(String value1, String value2) {
            addCriterion("h_delocation not between", value1, value2, "hDelocation");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(String value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(String value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(String value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(String value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(String value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLike(String value) {
            addCriterion("h_type like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotLike(String value) {
            addCriterion("h_type not like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<String> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<String> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(String value1, String value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(String value1, String value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHRetypeIsNull() {
            addCriterion("h_retype is null");
            return (Criteria) this;
        }

        public Criteria andHRetypeIsNotNull() {
            addCriterion("h_retype is not null");
            return (Criteria) this;
        }

        public Criteria andHRetypeEqualTo(String value) {
            addCriterion("h_retype =", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeNotEqualTo(String value) {
            addCriterion("h_retype <>", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeGreaterThan(String value) {
            addCriterion("h_retype >", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_retype >=", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeLessThan(String value) {
            addCriterion("h_retype <", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeLessThanOrEqualTo(String value) {
            addCriterion("h_retype <=", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeLike(String value) {
            addCriterion("h_retype like", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeNotLike(String value) {
            addCriterion("h_retype not like", value, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeIn(List<String> values) {
            addCriterion("h_retype in", values, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeNotIn(List<String> values) {
            addCriterion("h_retype not in", values, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeBetween(String value1, String value2) {
            addCriterion("h_retype between", value1, value2, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHRetypeNotBetween(String value1, String value2) {
            addCriterion("h_retype not between", value1, value2, "hRetype");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNull() {
            addCriterion("h_area is null");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNotNull() {
            addCriterion("h_area is not null");
            return (Criteria) this;
        }

        public Criteria andHAreaEqualTo(String value) {
            addCriterion("h_area =", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotEqualTo(String value) {
            addCriterion("h_area <>", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThan(String value) {
            addCriterion("h_area >", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThanOrEqualTo(String value) {
            addCriterion("h_area >=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThan(String value) {
            addCriterion("h_area <", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThanOrEqualTo(String value) {
            addCriterion("h_area <=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLike(String value) {
            addCriterion("h_area like", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotLike(String value) {
            addCriterion("h_area not like", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaIn(List<String> values) {
            addCriterion("h_area in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotIn(List<String> values) {
            addCriterion("h_area not in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaBetween(String value1, String value2) {
            addCriterion("h_area between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotBetween(String value1, String value2) {
            addCriterion("h_area not between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andHHutypeIsNull() {
            addCriterion("h_hutype is null");
            return (Criteria) this;
        }

        public Criteria andHHutypeIsNotNull() {
            addCriterion("h_hutype is not null");
            return (Criteria) this;
        }

        public Criteria andHHutypeEqualTo(String value) {
            addCriterion("h_hutype =", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeNotEqualTo(String value) {
            addCriterion("h_hutype <>", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeGreaterThan(String value) {
            addCriterion("h_hutype >", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_hutype >=", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeLessThan(String value) {
            addCriterion("h_hutype <", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeLessThanOrEqualTo(String value) {
            addCriterion("h_hutype <=", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeLike(String value) {
            addCriterion("h_hutype like", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeNotLike(String value) {
            addCriterion("h_hutype not like", value, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeIn(List<String> values) {
            addCriterion("h_hutype in", values, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeNotIn(List<String> values) {
            addCriterion("h_hutype not in", values, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeBetween(String value1, String value2) {
            addCriterion("h_hutype between", value1, value2, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHHutypeNotBetween(String value1, String value2) {
            addCriterion("h_hutype not between", value1, value2, "hHutype");
            return (Criteria) this;
        }

        public Criteria andHBatypeIsNull() {
            addCriterion("h_batype is null");
            return (Criteria) this;
        }

        public Criteria andHBatypeIsNotNull() {
            addCriterion("h_batype is not null");
            return (Criteria) this;
        }

        public Criteria andHBatypeEqualTo(String value) {
            addCriterion("h_batype =", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeNotEqualTo(String value) {
            addCriterion("h_batype <>", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeGreaterThan(String value) {
            addCriterion("h_batype >", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_batype >=", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeLessThan(String value) {
            addCriterion("h_batype <", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeLessThanOrEqualTo(String value) {
            addCriterion("h_batype <=", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeLike(String value) {
            addCriterion("h_batype like", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeNotLike(String value) {
            addCriterion("h_batype not like", value, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeIn(List<String> values) {
            addCriterion("h_batype in", values, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeNotIn(List<String> values) {
            addCriterion("h_batype not in", values, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeBetween(String value1, String value2) {
            addCriterion("h_batype between", value1, value2, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBatypeNotBetween(String value1, String value2) {
            addCriterion("h_batype not between", value1, value2, "hBatype");
            return (Criteria) this;
        }

        public Criteria andHBedinfoIsNull() {
            addCriterion("h_bedinfo is null");
            return (Criteria) this;
        }

        public Criteria andHBedinfoIsNotNull() {
            addCriterion("h_bedinfo is not null");
            return (Criteria) this;
        }

        public Criteria andHBedinfoEqualTo(String value) {
            addCriterion("h_bedinfo =", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoNotEqualTo(String value) {
            addCriterion("h_bedinfo <>", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoGreaterThan(String value) {
            addCriterion("h_bedinfo >", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoGreaterThanOrEqualTo(String value) {
            addCriterion("h_bedinfo >=", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoLessThan(String value) {
            addCriterion("h_bedinfo <", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoLessThanOrEqualTo(String value) {
            addCriterion("h_bedinfo <=", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoLike(String value) {
            addCriterion("h_bedinfo like", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoNotLike(String value) {
            addCriterion("h_bedinfo not like", value, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoIn(List<String> values) {
            addCriterion("h_bedinfo in", values, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoNotIn(List<String> values) {
            addCriterion("h_bedinfo not in", values, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoBetween(String value1, String value2) {
            addCriterion("h_bedinfo between", value1, value2, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHBedinfoNotBetween(String value1, String value2) {
            addCriterion("h_bedinfo not between", value1, value2, "hBedinfo");
            return (Criteria) this;
        }

        public Criteria andHSunumIsNull() {
            addCriterion("h_sunum is null");
            return (Criteria) this;
        }

        public Criteria andHSunumIsNotNull() {
            addCriterion("h_sunum is not null");
            return (Criteria) this;
        }

        public Criteria andHSunumEqualTo(Integer value) {
            addCriterion("h_sunum =", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumNotEqualTo(Integer value) {
            addCriterion("h_sunum <>", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumGreaterThan(Integer value) {
            addCriterion("h_sunum >", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_sunum >=", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumLessThan(Integer value) {
            addCriterion("h_sunum <", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumLessThanOrEqualTo(Integer value) {
            addCriterion("h_sunum <=", value, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumIn(List<Integer> values) {
            addCriterion("h_sunum in", values, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumNotIn(List<Integer> values) {
            addCriterion("h_sunum not in", values, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumBetween(Integer value1, Integer value2) {
            addCriterion("h_sunum between", value1, value2, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHSunumNotBetween(Integer value1, Integer value2) {
            addCriterion("h_sunum not between", value1, value2, "hSunum");
            return (Criteria) this;
        }

        public Criteria andHCohabitationIsNull() {
            addCriterion("h_cohabitation is null");
            return (Criteria) this;
        }

        public Criteria andHCohabitationIsNotNull() {
            addCriterion("h_cohabitation is not null");
            return (Criteria) this;
        }

        public Criteria andHCohabitationEqualTo(String value) {
            addCriterion("h_cohabitation =", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationNotEqualTo(String value) {
            addCriterion("h_cohabitation <>", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationGreaterThan(String value) {
            addCriterion("h_cohabitation >", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationGreaterThanOrEqualTo(String value) {
            addCriterion("h_cohabitation >=", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationLessThan(String value) {
            addCriterion("h_cohabitation <", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationLessThanOrEqualTo(String value) {
            addCriterion("h_cohabitation <=", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationLike(String value) {
            addCriterion("h_cohabitation like", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationNotLike(String value) {
            addCriterion("h_cohabitation not like", value, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationIn(List<String> values) {
            addCriterion("h_cohabitation in", values, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationNotIn(List<String> values) {
            addCriterion("h_cohabitation not in", values, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationBetween(String value1, String value2) {
            addCriterion("h_cohabitation between", value1, value2, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHCohabitationNotBetween(String value1, String value2) {
            addCriterion("h_cohabitation not between", value1, value2, "hCohabitation");
            return (Criteria) this;
        }

        public Criteria andHSihouseIsNull() {
            addCriterion("h_sihouse is null");
            return (Criteria) this;
        }

        public Criteria andHSihouseIsNotNull() {
            addCriterion("h_sihouse is not null");
            return (Criteria) this;
        }

        public Criteria andHSihouseEqualTo(String value) {
            addCriterion("h_sihouse =", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseNotEqualTo(String value) {
            addCriterion("h_sihouse <>", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseGreaterThan(String value) {
            addCriterion("h_sihouse >", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseGreaterThanOrEqualTo(String value) {
            addCriterion("h_sihouse >=", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseLessThan(String value) {
            addCriterion("h_sihouse <", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseLessThanOrEqualTo(String value) {
            addCriterion("h_sihouse <=", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseLike(String value) {
            addCriterion("h_sihouse like", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseNotLike(String value) {
            addCriterion("h_sihouse not like", value, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseIn(List<String> values) {
            addCriterion("h_sihouse in", values, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseNotIn(List<String> values) {
            addCriterion("h_sihouse not in", values, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseBetween(String value1, String value2) {
            addCriterion("h_sihouse between", value1, value2, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHSihouseNotBetween(String value1, String value2) {
            addCriterion("h_sihouse not between", value1, value2, "hSihouse");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionIsNull() {
            addCriterion("h_pedescription is null");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionIsNotNull() {
            addCriterion("h_pedescription is not null");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionEqualTo(String value) {
            addCriterion("h_pedescription =", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionNotEqualTo(String value) {
            addCriterion("h_pedescription <>", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionGreaterThan(String value) {
            addCriterion("h_pedescription >", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("h_pedescription >=", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionLessThan(String value) {
            addCriterion("h_pedescription <", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionLessThanOrEqualTo(String value) {
            addCriterion("h_pedescription <=", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionLike(String value) {
            addCriterion("h_pedescription like", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionNotLike(String value) {
            addCriterion("h_pedescription not like", value, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionIn(List<String> values) {
            addCriterion("h_pedescription in", values, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionNotIn(List<String> values) {
            addCriterion("h_pedescription not in", values, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionBetween(String value1, String value2) {
            addCriterion("h_pedescription between", value1, value2, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHPedescriptionNotBetween(String value1, String value2) {
            addCriterion("h_pedescription not between", value1, value2, "hPedescription");
            return (Criteria) this;
        }

        public Criteria andHInsituationIsNull() {
            addCriterion("h_insituation is null");
            return (Criteria) this;
        }

        public Criteria andHInsituationIsNotNull() {
            addCriterion("h_insituation is not null");
            return (Criteria) this;
        }

        public Criteria andHInsituationEqualTo(String value) {
            addCriterion("h_insituation =", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationNotEqualTo(String value) {
            addCriterion("h_insituation <>", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationGreaterThan(String value) {
            addCriterion("h_insituation >", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationGreaterThanOrEqualTo(String value) {
            addCriterion("h_insituation >=", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationLessThan(String value) {
            addCriterion("h_insituation <", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationLessThanOrEqualTo(String value) {
            addCriterion("h_insituation <=", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationLike(String value) {
            addCriterion("h_insituation like", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationNotLike(String value) {
            addCriterion("h_insituation not like", value, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationIn(List<String> values) {
            addCriterion("h_insituation in", values, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationNotIn(List<String> values) {
            addCriterion("h_insituation not in", values, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationBetween(String value1, String value2) {
            addCriterion("h_insituation between", value1, value2, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHInsituationNotBetween(String value1, String value2) {
            addCriterion("h_insituation not between", value1, value2, "hInsituation");
            return (Criteria) this;
        }

        public Criteria andHTrafficIsNull() {
            addCriterion("h_traffic is null");
            return (Criteria) this;
        }

        public Criteria andHTrafficIsNotNull() {
            addCriterion("h_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andHTrafficEqualTo(String value) {
            addCriterion("h_traffic =", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficNotEqualTo(String value) {
            addCriterion("h_traffic <>", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficGreaterThan(String value) {
            addCriterion("h_traffic >", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("h_traffic >=", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficLessThan(String value) {
            addCriterion("h_traffic <", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficLessThanOrEqualTo(String value) {
            addCriterion("h_traffic <=", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficLike(String value) {
            addCriterion("h_traffic like", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficNotLike(String value) {
            addCriterion("h_traffic not like", value, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficIn(List<String> values) {
            addCriterion("h_traffic in", values, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficNotIn(List<String> values) {
            addCriterion("h_traffic not in", values, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficBetween(String value1, String value2) {
            addCriterion("h_traffic between", value1, value2, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHTrafficNotBetween(String value1, String value2) {
            addCriterion("h_traffic not between", value1, value2, "hTraffic");
            return (Criteria) this;
        }

        public Criteria andHBesideIsNull() {
            addCriterion("h_beside is null");
            return (Criteria) this;
        }

        public Criteria andHBesideIsNotNull() {
            addCriterion("h_beside is not null");
            return (Criteria) this;
        }

        public Criteria andHBesideEqualTo(String value) {
            addCriterion("h_beside =", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideNotEqualTo(String value) {
            addCriterion("h_beside <>", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideGreaterThan(String value) {
            addCriterion("h_beside >", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideGreaterThanOrEqualTo(String value) {
            addCriterion("h_beside >=", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideLessThan(String value) {
            addCriterion("h_beside <", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideLessThanOrEqualTo(String value) {
            addCriterion("h_beside <=", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideLike(String value) {
            addCriterion("h_beside like", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideNotLike(String value) {
            addCriterion("h_beside not like", value, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideIn(List<String> values) {
            addCriterion("h_beside in", values, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideNotIn(List<String> values) {
            addCriterion("h_beside not in", values, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideBetween(String value1, String value2) {
            addCriterion("h_beside between", value1, value2, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBesideNotBetween(String value1, String value2) {
            addCriterion("h_beside not between", value1, value2, "hBeside");
            return (Criteria) this;
        }

        public Criteria andHBathIsNull() {
            addCriterion("h_bath is null");
            return (Criteria) this;
        }

        public Criteria andHBathIsNotNull() {
            addCriterion("h_bath is not null");
            return (Criteria) this;
        }

        public Criteria andHBathEqualTo(String value) {
            addCriterion("h_bath =", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathNotEqualTo(String value) {
            addCriterion("h_bath <>", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathGreaterThan(String value) {
            addCriterion("h_bath >", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathGreaterThanOrEqualTo(String value) {
            addCriterion("h_bath >=", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathLessThan(String value) {
            addCriterion("h_bath <", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathLessThanOrEqualTo(String value) {
            addCriterion("h_bath <=", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathLike(String value) {
            addCriterion("h_bath like", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathNotLike(String value) {
            addCriterion("h_bath not like", value, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathIn(List<String> values) {
            addCriterion("h_bath in", values, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathNotIn(List<String> values) {
            addCriterion("h_bath not in", values, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathBetween(String value1, String value2) {
            addCriterion("h_bath between", value1, value2, "hBath");
            return (Criteria) this;
        }

        public Criteria andHBathNotBetween(String value1, String value2) {
            addCriterion("h_bath not between", value1, value2, "hBath");
            return (Criteria) this;
        }

        public Criteria andHElectroIsNull() {
            addCriterion("h_electro is null");
            return (Criteria) this;
        }

        public Criteria andHElectroIsNotNull() {
            addCriterion("h_electro is not null");
            return (Criteria) this;
        }

        public Criteria andHElectroEqualTo(String value) {
            addCriterion("h_electro =", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroNotEqualTo(String value) {
            addCriterion("h_electro <>", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroGreaterThan(String value) {
            addCriterion("h_electro >", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroGreaterThanOrEqualTo(String value) {
            addCriterion("h_electro >=", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroLessThan(String value) {
            addCriterion("h_electro <", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroLessThanOrEqualTo(String value) {
            addCriterion("h_electro <=", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroLike(String value) {
            addCriterion("h_electro like", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroNotLike(String value) {
            addCriterion("h_electro not like", value, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroIn(List<String> values) {
            addCriterion("h_electro in", values, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroNotIn(List<String> values) {
            addCriterion("h_electro not in", values, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroBetween(String value1, String value2) {
            addCriterion("h_electro between", value1, value2, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHElectroNotBetween(String value1, String value2) {
            addCriterion("h_electro not between", value1, value2, "hElectro");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesIsNull() {
            addCriterion("h_facilities is null");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesIsNotNull() {
            addCriterion("h_facilities is not null");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesEqualTo(String value) {
            addCriterion("h_facilities =", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesNotEqualTo(String value) {
            addCriterion("h_facilities <>", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesGreaterThan(String value) {
            addCriterion("h_facilities >", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("h_facilities >=", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesLessThan(String value) {
            addCriterion("h_facilities <", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("h_facilities <=", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesLike(String value) {
            addCriterion("h_facilities like", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesNotLike(String value) {
            addCriterion("h_facilities not like", value, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesIn(List<String> values) {
            addCriterion("h_facilities in", values, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesNotIn(List<String> values) {
            addCriterion("h_facilities not in", values, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesBetween(String value1, String value2) {
            addCriterion("h_facilities between", value1, value2, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHFacilitiesNotBetween(String value1, String value2) {
            addCriterion("h_facilities not between", value1, value2, "hFacilities");
            return (Criteria) this;
        }

        public Criteria andHSpefacIsNull() {
            addCriterion("h_spefac is null");
            return (Criteria) this;
        }

        public Criteria andHSpefacIsNotNull() {
            addCriterion("h_spefac is not null");
            return (Criteria) this;
        }

        public Criteria andHSpefacEqualTo(String value) {
            addCriterion("h_spefac =", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacNotEqualTo(String value) {
            addCriterion("h_spefac <>", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacGreaterThan(String value) {
            addCriterion("h_spefac >", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacGreaterThanOrEqualTo(String value) {
            addCriterion("h_spefac >=", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacLessThan(String value) {
            addCriterion("h_spefac <", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacLessThanOrEqualTo(String value) {
            addCriterion("h_spefac <=", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacLike(String value) {
            addCriterion("h_spefac like", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacNotLike(String value) {
            addCriterion("h_spefac not like", value, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacIn(List<String> values) {
            addCriterion("h_spefac in", values, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacNotIn(List<String> values) {
            addCriterion("h_spefac not in", values, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacBetween(String value1, String value2) {
            addCriterion("h_spefac between", value1, value2, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHSpefacNotBetween(String value1, String value2) {
            addCriterion("h_spefac not between", value1, value2, "hSpefac");
            return (Criteria) this;
        }

        public Criteria andHRequireIsNull() {
            addCriterion("h_require is null");
            return (Criteria) this;
        }

        public Criteria andHRequireIsNotNull() {
            addCriterion("h_require is not null");
            return (Criteria) this;
        }

        public Criteria andHRequireEqualTo(String value) {
            addCriterion("h_require =", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireNotEqualTo(String value) {
            addCriterion("h_require <>", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireGreaterThan(String value) {
            addCriterion("h_require >", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireGreaterThanOrEqualTo(String value) {
            addCriterion("h_require >=", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireLessThan(String value) {
            addCriterion("h_require <", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireLessThanOrEqualTo(String value) {
            addCriterion("h_require <=", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireLike(String value) {
            addCriterion("h_require like", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireNotLike(String value) {
            addCriterion("h_require not like", value, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireIn(List<String> values) {
            addCriterion("h_require in", values, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireNotIn(List<String> values) {
            addCriterion("h_require not in", values, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireBetween(String value1, String value2) {
            addCriterion("h_require between", value1, value2, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHRequireNotBetween(String value1, String value2) {
            addCriterion("h_require not between", value1, value2, "hRequire");
            return (Criteria) this;
        }

        public Criteria andHPictureIsNull() {
            addCriterion("h_picture is null");
            return (Criteria) this;
        }

        public Criteria andHPictureIsNotNull() {
            addCriterion("h_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHPictureEqualTo(String value) {
            addCriterion("h_picture =", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotEqualTo(String value) {
            addCriterion("h_picture <>", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureGreaterThan(String value) {
            addCriterion("h_picture >", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureGreaterThanOrEqualTo(String value) {
            addCriterion("h_picture >=", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLessThan(String value) {
            addCriterion("h_picture <", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLessThanOrEqualTo(String value) {
            addCriterion("h_picture <=", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLike(String value) {
            addCriterion("h_picture like", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotLike(String value) {
            addCriterion("h_picture not like", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureIn(List<String> values) {
            addCriterion("h_picture in", values, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotIn(List<String> values) {
            addCriterion("h_picture not in", values, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureBetween(String value1, String value2) {
            addCriterion("h_picture between", value1, value2, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotBetween(String value1, String value2) {
            addCriterion("h_picture not between", value1, value2, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNull() {
            addCriterion("h_price is null");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNotNull() {
            addCriterion("h_price is not null");
            return (Criteria) this;
        }

        public Criteria andHPriceEqualTo(String value) {
            addCriterion("h_price =", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotEqualTo(String value) {
            addCriterion("h_price <>", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThan(String value) {
            addCriterion("h_price >", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThanOrEqualTo(String value) {
            addCriterion("h_price >=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThan(String value) {
            addCriterion("h_price <", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThanOrEqualTo(String value) {
            addCriterion("h_price <=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLike(String value) {
            addCriterion("h_price like", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotLike(String value) {
            addCriterion("h_price not like", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceIn(List<String> values) {
            addCriterion("h_price in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotIn(List<String> values) {
            addCriterion("h_price not in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceBetween(String value1, String value2) {
            addCriterion("h_price between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotBetween(String value1, String value2) {
            addCriterion("h_price not between", value1, value2, "hPrice");
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