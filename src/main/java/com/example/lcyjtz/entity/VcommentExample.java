package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class VcommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VcommentExample() {
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

        public Criteria andVcommentIdIsNull() {
            addCriterion("VComment_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcommentIdIsNotNull() {
            addCriterion("VComment_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcommentIdEqualTo(Integer value) {
            addCriterion("VComment_ID =", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdNotEqualTo(Integer value) {
            addCriterion("VComment_ID <>", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdGreaterThan(Integer value) {
            addCriterion("VComment_ID >", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VComment_ID >=", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdLessThan(Integer value) {
            addCriterion("VComment_ID <", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("VComment_ID <=", value, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdIn(List<Integer> values) {
            addCriterion("VComment_ID in", values, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdNotIn(List<Integer> values) {
            addCriterion("VComment_ID not in", values, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdBetween(Integer value1, Integer value2) {
            addCriterion("VComment_ID between", value1, value2, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VComment_ID not between", value1, value2, "vcommentId");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidIsNull() {
            addCriterion("VComment_VideoID is null");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidIsNotNull() {
            addCriterion("VComment_VideoID is not null");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidEqualTo(Integer value) {
            addCriterion("VComment_VideoID =", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidNotEqualTo(Integer value) {
            addCriterion("VComment_VideoID <>", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidGreaterThan(Integer value) {
            addCriterion("VComment_VideoID >", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VComment_VideoID >=", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidLessThan(Integer value) {
            addCriterion("VComment_VideoID <", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("VComment_VideoID <=", value, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidIn(List<Integer> values) {
            addCriterion("VComment_VideoID in", values, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidNotIn(List<Integer> values) {
            addCriterion("VComment_VideoID not in", values, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidBetween(Integer value1, Integer value2) {
            addCriterion("VComment_VideoID between", value1, value2, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("VComment_VideoID not between", value1, value2, "vcommentVideoid");
            return (Criteria) this;
        }

        public Criteria andVcommentContentIsNull() {
            addCriterion("VComment_Content is null");
            return (Criteria) this;
        }

        public Criteria andVcommentContentIsNotNull() {
            addCriterion("VComment_Content is not null");
            return (Criteria) this;
        }

        public Criteria andVcommentContentEqualTo(String value) {
            addCriterion("VComment_Content =", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentNotEqualTo(String value) {
            addCriterion("VComment_Content <>", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentGreaterThan(String value) {
            addCriterion("VComment_Content >", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("VComment_Content >=", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentLessThan(String value) {
            addCriterion("VComment_Content <", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentLessThanOrEqualTo(String value) {
            addCriterion("VComment_Content <=", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentLike(String value) {
            addCriterion("VComment_Content like", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentNotLike(String value) {
            addCriterion("VComment_Content not like", value, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentIn(List<String> values) {
            addCriterion("VComment_Content in", values, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentNotIn(List<String> values) {
            addCriterion("VComment_Content not in", values, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentBetween(String value1, String value2) {
            addCriterion("VComment_Content between", value1, value2, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentContentNotBetween(String value1, String value2) {
            addCriterion("VComment_Content not between", value1, value2, "vcommentContent");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameIsNull() {
            addCriterion("VComment_UserName is null");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameIsNotNull() {
            addCriterion("VComment_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameEqualTo(String value) {
            addCriterion("VComment_UserName =", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameNotEqualTo(String value) {
            addCriterion("VComment_UserName <>", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameGreaterThan(String value) {
            addCriterion("VComment_UserName >", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("VComment_UserName >=", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameLessThan(String value) {
            addCriterion("VComment_UserName <", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("VComment_UserName <=", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameLike(String value) {
            addCriterion("VComment_UserName like", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameNotLike(String value) {
            addCriterion("VComment_UserName not like", value, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameIn(List<String> values) {
            addCriterion("VComment_UserName in", values, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameNotIn(List<String> values) {
            addCriterion("VComment_UserName not in", values, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameBetween(String value1, String value2) {
            addCriterion("VComment_UserName between", value1, value2, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentUsernameNotBetween(String value1, String value2) {
            addCriterion("VComment_UserName not between", value1, value2, "vcommentUsername");
            return (Criteria) this;
        }

        public Criteria andVcommentDataIsNull() {
            addCriterion("VComment_Data is null");
            return (Criteria) this;
        }

        public Criteria andVcommentDataIsNotNull() {
            addCriterion("VComment_Data is not null");
            return (Criteria) this;
        }

        public Criteria andVcommentDataEqualTo(String value) {
            addCriterion("VComment_Data =", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataNotEqualTo(String value) {
            addCriterion("VComment_Data <>", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataGreaterThan(String value) {
            addCriterion("VComment_Data >", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataGreaterThanOrEqualTo(String value) {
            addCriterion("VComment_Data >=", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataLessThan(String value) {
            addCriterion("VComment_Data <", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataLessThanOrEqualTo(String value) {
            addCriterion("VComment_Data <=", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataLike(String value) {
            addCriterion("VComment_Data like", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataNotLike(String value) {
            addCriterion("VComment_Data not like", value, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataIn(List<String> values) {
            addCriterion("VComment_Data in", values, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataNotIn(List<String> values) {
            addCriterion("VComment_Data not in", values, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataBetween(String value1, String value2) {
            addCriterion("VComment_Data between", value1, value2, "vcommentData");
            return (Criteria) this;
        }

        public Criteria andVcommentDataNotBetween(String value1, String value2) {
            addCriterion("VComment_Data not between", value1, value2, "vcommentData");
            return (Criteria) this;
        }
    }

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