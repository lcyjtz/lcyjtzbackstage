package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class PcommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcommentExample() {
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

        public Criteria andPcommentIdIsNull() {
            addCriterion("PComment_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcommentIdIsNotNull() {
            addCriterion("PComment_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcommentIdEqualTo(Integer value) {
            addCriterion("PComment_ID =", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdNotEqualTo(Integer value) {
            addCriterion("PComment_ID <>", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdGreaterThan(Integer value) {
            addCriterion("PComment_ID >", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PComment_ID >=", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdLessThan(Integer value) {
            addCriterion("PComment_ID <", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PComment_ID <=", value, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdIn(List<Integer> values) {
            addCriterion("PComment_ID in", values, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdNotIn(List<Integer> values) {
            addCriterion("PComment_ID not in", values, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdBetween(Integer value1, Integer value2) {
            addCriterion("PComment_ID between", value1, value2, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PComment_ID not between", value1, value2, "pcommentId");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameIsNull() {
            addCriterion("PComment_UserName is null");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameIsNotNull() {
            addCriterion("PComment_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameEqualTo(String value) {
            addCriterion("PComment_UserName =", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameNotEqualTo(String value) {
            addCriterion("PComment_UserName <>", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameGreaterThan(String value) {
            addCriterion("PComment_UserName >", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("PComment_UserName >=", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameLessThan(String value) {
            addCriterion("PComment_UserName <", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("PComment_UserName <=", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameLike(String value) {
            addCriterion("PComment_UserName like", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameNotLike(String value) {
            addCriterion("PComment_UserName not like", value, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameIn(List<String> values) {
            addCriterion("PComment_UserName in", values, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameNotIn(List<String> values) {
            addCriterion("PComment_UserName not in", values, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameBetween(String value1, String value2) {
            addCriterion("PComment_UserName between", value1, value2, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentUsernameNotBetween(String value1, String value2) {
            addCriterion("PComment_UserName not between", value1, value2, "pcommentUsername");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidIsNull() {
            addCriterion("PComment_PictureID is null");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidIsNotNull() {
            addCriterion("PComment_PictureID is not null");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidEqualTo(Integer value) {
            addCriterion("PComment_PictureID =", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidNotEqualTo(Integer value) {
            addCriterion("PComment_PictureID <>", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidGreaterThan(Integer value) {
            addCriterion("PComment_PictureID >", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PComment_PictureID >=", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidLessThan(Integer value) {
            addCriterion("PComment_PictureID <", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidLessThanOrEqualTo(Integer value) {
            addCriterion("PComment_PictureID <=", value, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidIn(List<Integer> values) {
            addCriterion("PComment_PictureID in", values, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidNotIn(List<Integer> values) {
            addCriterion("PComment_PictureID not in", values, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidBetween(Integer value1, Integer value2) {
            addCriterion("PComment_PictureID between", value1, value2, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentPictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("PComment_PictureID not between", value1, value2, "pcommentPictureid");
            return (Criteria) this;
        }

        public Criteria andPcommentDataIsNull() {
            addCriterion("PComment_Data is null");
            return (Criteria) this;
        }

        public Criteria andPcommentDataIsNotNull() {
            addCriterion("PComment_Data is not null");
            return (Criteria) this;
        }

        public Criteria andPcommentDataEqualTo(String value) {
            addCriterion("PComment_Data =", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataNotEqualTo(String value) {
            addCriterion("PComment_Data <>", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataGreaterThan(String value) {
            addCriterion("PComment_Data >", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataGreaterThanOrEqualTo(String value) {
            addCriterion("PComment_Data >=", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataLessThan(String value) {
            addCriterion("PComment_Data <", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataLessThanOrEqualTo(String value) {
            addCriterion("PComment_Data <=", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataLike(String value) {
            addCriterion("PComment_Data like", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataNotLike(String value) {
            addCriterion("PComment_Data not like", value, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataIn(List<String> values) {
            addCriterion("PComment_Data in", values, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataNotIn(List<String> values) {
            addCriterion("PComment_Data not in", values, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataBetween(String value1, String value2) {
            addCriterion("PComment_Data between", value1, value2, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentDataNotBetween(String value1, String value2) {
            addCriterion("PComment_Data not between", value1, value2, "pcommentData");
            return (Criteria) this;
        }

        public Criteria andPcommentContextIsNull() {
            addCriterion("PComment_Context is null");
            return (Criteria) this;
        }

        public Criteria andPcommentContextIsNotNull() {
            addCriterion("PComment_Context is not null");
            return (Criteria) this;
        }

        public Criteria andPcommentContextEqualTo(String value) {
            addCriterion("PComment_Context =", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextNotEqualTo(String value) {
            addCriterion("PComment_Context <>", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextGreaterThan(String value) {
            addCriterion("PComment_Context >", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextGreaterThanOrEqualTo(String value) {
            addCriterion("PComment_Context >=", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextLessThan(String value) {
            addCriterion("PComment_Context <", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextLessThanOrEqualTo(String value) {
            addCriterion("PComment_Context <=", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextLike(String value) {
            addCriterion("PComment_Context like", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextNotLike(String value) {
            addCriterion("PComment_Context not like", value, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextIn(List<String> values) {
            addCriterion("PComment_Context in", values, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextNotIn(List<String> values) {
            addCriterion("PComment_Context not in", values, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextBetween(String value1, String value2) {
            addCriterion("PComment_Context between", value1, value2, "pcommentContext");
            return (Criteria) this;
        }

        public Criteria andPcommentContextNotBetween(String value1, String value2) {
            addCriterion("PComment_Context not between", value1, value2, "pcommentContext");
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