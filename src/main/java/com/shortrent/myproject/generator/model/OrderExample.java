package com.shortrent.myproject.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOApplicantIsNull() {
            addCriterion("o_applicant is null");
            return (Criteria) this;
        }

        public Criteria andOApplicantIsNotNull() {
            addCriterion("o_applicant is not null");
            return (Criteria) this;
        }

        public Criteria andOApplicantEqualTo(Integer value) {
            addCriterion("o_applicant =", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantNotEqualTo(Integer value) {
            addCriterion("o_applicant <>", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantGreaterThan(Integer value) {
            addCriterion("o_applicant >", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_applicant >=", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantLessThan(Integer value) {
            addCriterion("o_applicant <", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantLessThanOrEqualTo(Integer value) {
            addCriterion("o_applicant <=", value, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantIn(List<Integer> values) {
            addCriterion("o_applicant in", values, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantNotIn(List<Integer> values) {
            addCriterion("o_applicant not in", values, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantBetween(Integer value1, Integer value2) {
            addCriterion("o_applicant between", value1, value2, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOApplicantNotBetween(Integer value1, Integer value2) {
            addCriterion("o_applicant not between", value1, value2, "oApplicant");
            return (Criteria) this;
        }

        public Criteria andOAcceptorIsNull() {
            addCriterion("o_acceptor is null");
            return (Criteria) this;
        }

        public Criteria andOAcceptorIsNotNull() {
            addCriterion("o_acceptor is not null");
            return (Criteria) this;
        }

        public Criteria andOAcceptorEqualTo(Integer value) {
            addCriterion("o_acceptor =", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorNotEqualTo(Integer value) {
            addCriterion("o_acceptor <>", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorGreaterThan(Integer value) {
            addCriterion("o_acceptor >", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_acceptor >=", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorLessThan(Integer value) {
            addCriterion("o_acceptor <", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorLessThanOrEqualTo(Integer value) {
            addCriterion("o_acceptor <=", value, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorIn(List<Integer> values) {
            addCriterion("o_acceptor in", values, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorNotIn(List<Integer> values) {
            addCriterion("o_acceptor not in", values, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorBetween(Integer value1, Integer value2) {
            addCriterion("o_acceptor between", value1, value2, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOAcceptorNotBetween(Integer value1, Integer value2) {
            addCriterion("o_acceptor not between", value1, value2, "oAcceptor");
            return (Criteria) this;
        }

        public Criteria andOHouseidIsNull() {
            addCriterion("o_houseid is null");
            return (Criteria) this;
        }

        public Criteria andOHouseidIsNotNull() {
            addCriterion("o_houseid is not null");
            return (Criteria) this;
        }

        public Criteria andOHouseidEqualTo(Integer value) {
            addCriterion("o_houseid =", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidNotEqualTo(Integer value) {
            addCriterion("o_houseid <>", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidGreaterThan(Integer value) {
            addCriterion("o_houseid >", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_houseid >=", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidLessThan(Integer value) {
            addCriterion("o_houseid <", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidLessThanOrEqualTo(Integer value) {
            addCriterion("o_houseid <=", value, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidIn(List<Integer> values) {
            addCriterion("o_houseid in", values, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidNotIn(List<Integer> values) {
            addCriterion("o_houseid not in", values, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidBetween(Integer value1, Integer value2) {
            addCriterion("o_houseid between", value1, value2, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOHouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("o_houseid not between", value1, value2, "oHouseid");
            return (Criteria) this;
        }

        public Criteria andOAmountIsNull() {
            addCriterion("o_amount is null");
            return (Criteria) this;
        }

        public Criteria andOAmountIsNotNull() {
            addCriterion("o_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOAmountEqualTo(Integer value) {
            addCriterion("o_amount =", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountNotEqualTo(Integer value) {
            addCriterion("o_amount <>", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountGreaterThan(Integer value) {
            addCriterion("o_amount >", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_amount >=", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountLessThan(Integer value) {
            addCriterion("o_amount <", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountLessThanOrEqualTo(Integer value) {
            addCriterion("o_amount <=", value, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountIn(List<Integer> values) {
            addCriterion("o_amount in", values, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountNotIn(List<Integer> values) {
            addCriterion("o_amount not in", values, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountBetween(Integer value1, Integer value2) {
            addCriterion("o_amount between", value1, value2, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("o_amount not between", value1, value2, "oAmount");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(String value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(String value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(String value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(String value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(String value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(String value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLike(String value) {
            addCriterion("o_status like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotLike(String value) {
            addCriterion("o_status not like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<String> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<String> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(String value1, String value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(String value1, String value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStarttimeIsNull() {
            addCriterion("o_starttime is null");
            return (Criteria) this;
        }

        public Criteria andOStarttimeIsNotNull() {
            addCriterion("o_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andOStarttimeEqualTo(Date value) {
            addCriterion("o_starttime =", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeNotEqualTo(Date value) {
            addCriterion("o_starttime <>", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeGreaterThan(Date value) {
            addCriterion("o_starttime >", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_starttime >=", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeLessThan(Date value) {
            addCriterion("o_starttime <", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("o_starttime <=", value, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeIn(List<Date> values) {
            addCriterion("o_starttime in", values, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeNotIn(List<Date> values) {
            addCriterion("o_starttime not in", values, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeBetween(Date value1, Date value2) {
            addCriterion("o_starttime between", value1, value2, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("o_starttime not between", value1, value2, "oStarttime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeIsNull() {
            addCriterion("o_endtime is null");
            return (Criteria) this;
        }

        public Criteria andOEndtimeIsNotNull() {
            addCriterion("o_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andOEndtimeEqualTo(Date value) {
            addCriterion("o_endtime =", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeNotEqualTo(Date value) {
            addCriterion("o_endtime <>", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeGreaterThan(Date value) {
            addCriterion("o_endtime >", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_endtime >=", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeLessThan(Date value) {
            addCriterion("o_endtime <", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("o_endtime <=", value, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeIn(List<Date> values) {
            addCriterion("o_endtime in", values, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeNotIn(List<Date> values) {
            addCriterion("o_endtime not in", values, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeBetween(Date value1, Date value2) {
            addCriterion("o_endtime between", value1, value2, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("o_endtime not between", value1, value2, "oEndtime");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberIsNull() {
            addCriterion("o_capitalnumber is null");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberIsNotNull() {
            addCriterion("o_capitalnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberEqualTo(Integer value) {
            addCriterion("o_capitalnumber =", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberNotEqualTo(Integer value) {
            addCriterion("o_capitalnumber <>", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberGreaterThan(Integer value) {
            addCriterion("o_capitalnumber >", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_capitalnumber >=", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberLessThan(Integer value) {
            addCriterion("o_capitalnumber <", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberLessThanOrEqualTo(Integer value) {
            addCriterion("o_capitalnumber <=", value, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberIn(List<Integer> values) {
            addCriterion("o_capitalnumber in", values, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberNotIn(List<Integer> values) {
            addCriterion("o_capitalnumber not in", values, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberBetween(Integer value1, Integer value2) {
            addCriterion("o_capitalnumber between", value1, value2, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOCapitalnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("o_capitalnumber not between", value1, value2, "oCapitalnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberIsNull() {
            addCriterion("o_paymentnumber is null");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberIsNotNull() {
            addCriterion("o_paymentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberEqualTo(Integer value) {
            addCriterion("o_paymentnumber =", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberNotEqualTo(Integer value) {
            addCriterion("o_paymentnumber <>", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberGreaterThan(Integer value) {
            addCriterion("o_paymentnumber >", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_paymentnumber >=", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberLessThan(Integer value) {
            addCriterion("o_paymentnumber <", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberLessThanOrEqualTo(Integer value) {
            addCriterion("o_paymentnumber <=", value, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberIn(List<Integer> values) {
            addCriterion("o_paymentnumber in", values, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberNotIn(List<Integer> values) {
            addCriterion("o_paymentnumber not in", values, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberBetween(Integer value1, Integer value2) {
            addCriterion("o_paymentnumber between", value1, value2, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOPaymentnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("o_paymentnumber not between", value1, value2, "oPaymentnumber");
            return (Criteria) this;
        }

        public Criteria andOReasonIsNull() {
            addCriterion("o_reason is null");
            return (Criteria) this;
        }

        public Criteria andOReasonIsNotNull() {
            addCriterion("o_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOReasonEqualTo(String value) {
            addCriterion("o_reason =", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonNotEqualTo(String value) {
            addCriterion("o_reason <>", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonGreaterThan(String value) {
            addCriterion("o_reason >", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonGreaterThanOrEqualTo(String value) {
            addCriterion("o_reason >=", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonLessThan(String value) {
            addCriterion("o_reason <", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonLessThanOrEqualTo(String value) {
            addCriterion("o_reason <=", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonLike(String value) {
            addCriterion("o_reason like", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonNotLike(String value) {
            addCriterion("o_reason not like", value, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonIn(List<String> values) {
            addCriterion("o_reason in", values, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonNotIn(List<String> values) {
            addCriterion("o_reason not in", values, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonBetween(String value1, String value2) {
            addCriterion("o_reason between", value1, value2, "oReason");
            return (Criteria) this;
        }

        public Criteria andOReasonNotBetween(String value1, String value2) {
            addCriterion("o_reason not between", value1, value2, "oReason");
            return (Criteria) this;
        }

        public Criteria andOMessageIsNull() {
            addCriterion("o_message is null");
            return (Criteria) this;
        }

        public Criteria andOMessageIsNotNull() {
            addCriterion("o_message is not null");
            return (Criteria) this;
        }

        public Criteria andOMessageEqualTo(String value) {
            addCriterion("o_message =", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageNotEqualTo(String value) {
            addCriterion("o_message <>", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageGreaterThan(String value) {
            addCriterion("o_message >", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageGreaterThanOrEqualTo(String value) {
            addCriterion("o_message >=", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageLessThan(String value) {
            addCriterion("o_message <", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageLessThanOrEqualTo(String value) {
            addCriterion("o_message <=", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageLike(String value) {
            addCriterion("o_message like", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageNotLike(String value) {
            addCriterion("o_message not like", value, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageIn(List<String> values) {
            addCriterion("o_message in", values, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageNotIn(List<String> values) {
            addCriterion("o_message not in", values, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageBetween(String value1, String value2) {
            addCriterion("o_message between", value1, value2, "oMessage");
            return (Criteria) this;
        }

        public Criteria andOMessageNotBetween(String value1, String value2) {
            addCriterion("o_message not between", value1, value2, "oMessage");
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