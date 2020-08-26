package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class AcommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcommentExample() {
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

        public Criteria andAcommentIdIsNull() {
            addCriterion("AComment_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcommentIdIsNotNull() {
            addCriterion("AComment_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentIdEqualTo(Integer value) {
            addCriterion("AComment_ID =", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdNotEqualTo(Integer value) {
            addCriterion("AComment_ID <>", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdGreaterThan(Integer value) {
            addCriterion("AComment_ID >", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AComment_ID >=", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdLessThan(Integer value) {
            addCriterion("AComment_ID <", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("AComment_ID <=", value, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdIn(List<Integer> values) {
            addCriterion("AComment_ID in", values, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdNotIn(List<Integer> values) {
            addCriterion("AComment_ID not in", values, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdBetween(Integer value1, Integer value2) {
            addCriterion("AComment_ID between", value1, value2, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AComment_ID not between", value1, value2, "acommentId");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidIsNull() {
            addCriterion("AComment_ArticleID is null");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidIsNotNull() {
            addCriterion("AComment_ArticleID is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidEqualTo(Integer value) {
            addCriterion("AComment_ArticleID =", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidNotEqualTo(Integer value) {
            addCriterion("AComment_ArticleID <>", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidGreaterThan(Integer value) {
            addCriterion("AComment_ArticleID >", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AComment_ArticleID >=", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidLessThan(Integer value) {
            addCriterion("AComment_ArticleID <", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("AComment_ArticleID <=", value, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidIn(List<Integer> values) {
            addCriterion("AComment_ArticleID in", values, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidNotIn(List<Integer> values) {
            addCriterion("AComment_ArticleID not in", values, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidBetween(Integer value1, Integer value2) {
            addCriterion("AComment_ArticleID between", value1, value2, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("AComment_ArticleID not between", value1, value2, "acommentArticleid");
            return (Criteria) this;
        }

        public Criteria andAcommentContentIsNull() {
            addCriterion("AComment_Content is null");
            return (Criteria) this;
        }

        public Criteria andAcommentContentIsNotNull() {
            addCriterion("AComment_Content is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentContentEqualTo(String value) {
            addCriterion("AComment_Content =", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentNotEqualTo(String value) {
            addCriterion("AComment_Content <>", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentGreaterThan(String value) {
            addCriterion("AComment_Content >", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("AComment_Content >=", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentLessThan(String value) {
            addCriterion("AComment_Content <", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentLessThanOrEqualTo(String value) {
            addCriterion("AComment_Content <=", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentLike(String value) {
            addCriterion("AComment_Content like", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentNotLike(String value) {
            addCriterion("AComment_Content not like", value, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentIn(List<String> values) {
            addCriterion("AComment_Content in", values, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentNotIn(List<String> values) {
            addCriterion("AComment_Content not in", values, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentBetween(String value1, String value2) {
            addCriterion("AComment_Content between", value1, value2, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentContentNotBetween(String value1, String value2) {
            addCriterion("AComment_Content not between", value1, value2, "acommentContent");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameIsNull() {
            addCriterion("AComment_UserName is null");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameIsNotNull() {
            addCriterion("AComment_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameEqualTo(String value) {
            addCriterion("AComment_UserName =", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameNotEqualTo(String value) {
            addCriterion("AComment_UserName <>", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameGreaterThan(String value) {
            addCriterion("AComment_UserName >", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("AComment_UserName >=", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameLessThan(String value) {
            addCriterion("AComment_UserName <", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("AComment_UserName <=", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameLike(String value) {
            addCriterion("AComment_UserName like", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameNotLike(String value) {
            addCriterion("AComment_UserName not like", value, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameIn(List<String> values) {
            addCriterion("AComment_UserName in", values, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameNotIn(List<String> values) {
            addCriterion("AComment_UserName not in", values, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameBetween(String value1, String value2) {
            addCriterion("AComment_UserName between", value1, value2, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentUsernameNotBetween(String value1, String value2) {
            addCriterion("AComment_UserName not between", value1, value2, "acommentUsername");
            return (Criteria) this;
        }

        public Criteria andAcommentDataIsNull() {
            addCriterion("AComment_Data is null");
            return (Criteria) this;
        }

        public Criteria andAcommentDataIsNotNull() {
            addCriterion("AComment_Data is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentDataEqualTo(String value) {
            addCriterion("AComment_Data =", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataNotEqualTo(String value) {
            addCriterion("AComment_Data <>", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataGreaterThan(String value) {
            addCriterion("AComment_Data >", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataGreaterThanOrEqualTo(String value) {
            addCriterion("AComment_Data >=", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataLessThan(String value) {
            addCriterion("AComment_Data <", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataLessThanOrEqualTo(String value) {
            addCriterion("AComment_Data <=", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataLike(String value) {
            addCriterion("AComment_Data like", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataNotLike(String value) {
            addCriterion("AComment_Data not like", value, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataIn(List<String> values) {
            addCriterion("AComment_Data in", values, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataNotIn(List<String> values) {
            addCriterion("AComment_Data not in", values, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataBetween(String value1, String value2) {
            addCriterion("AComment_Data between", value1, value2, "acommentData");
            return (Criteria) this;
        }

        public Criteria andAcommentDataNotBetween(String value1, String value2) {
            addCriterion("AComment_Data not between", value1, value2, "acommentData");
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