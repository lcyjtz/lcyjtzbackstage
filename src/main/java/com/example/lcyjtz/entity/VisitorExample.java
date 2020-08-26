package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorExample() {
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

        public Criteria andVisitoridIsNull() {
            addCriterion("VisitorID is null");
            return (Criteria) this;
        }

        public Criteria andVisitoridIsNotNull() {
            addCriterion("VisitorID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitoridEqualTo(Integer value) {
            addCriterion("VisitorID =", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotEqualTo(Integer value) {
            addCriterion("VisitorID <>", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThan(Integer value) {
            addCriterion("VisitorID >", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorID >=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThan(Integer value) {
            addCriterion("VisitorID <", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorID <=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridIn(List<Integer> values) {
            addCriterion("VisitorID in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotIn(List<Integer> values) {
            addCriterion("VisitorID not in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridBetween(Integer value1, Integer value2) {
            addCriterion("VisitorID between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorID not between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNull() {
            addCriterion("VisitorName is null");
            return (Criteria) this;
        }

        public Criteria andVisitornameIsNotNull() {
            addCriterion("VisitorName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitornameEqualTo(String value) {
            addCriterion("VisitorName =", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotEqualTo(String value) {
            addCriterion("VisitorName <>", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThan(String value) {
            addCriterion("VisitorName >", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorName >=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThan(String value) {
            addCriterion("VisitorName <", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLessThanOrEqualTo(String value) {
            addCriterion("VisitorName <=", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameLike(String value) {
            addCriterion("VisitorName like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotLike(String value) {
            addCriterion("VisitorName not like", value, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameIn(List<String> values) {
            addCriterion("VisitorName in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotIn(List<String> values) {
            addCriterion("VisitorName not in", values, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameBetween(String value1, String value2) {
            addCriterion("VisitorName between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitornameNotBetween(String value1, String value2) {
            addCriterion("VisitorName not between", value1, value2, "visitorname");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIsNull() {
            addCriterion("Visitorpwd is null");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIsNotNull() {
            addCriterion("Visitorpwd is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdEqualTo(String value) {
            addCriterion("Visitorpwd =", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotEqualTo(String value) {
            addCriterion("Visitorpwd <>", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdGreaterThan(String value) {
            addCriterion("Visitorpwd >", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdGreaterThanOrEqualTo(String value) {
            addCriterion("Visitorpwd >=", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLessThan(String value) {
            addCriterion("Visitorpwd <", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLessThanOrEqualTo(String value) {
            addCriterion("Visitorpwd <=", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdLike(String value) {
            addCriterion("Visitorpwd like", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotLike(String value) {
            addCriterion("Visitorpwd not like", value, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdIn(List<String> values) {
            addCriterion("Visitorpwd in", values, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotIn(List<String> values) {
            addCriterion("Visitorpwd not in", values, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdBetween(String value1, String value2) {
            addCriterion("Visitorpwd between", value1, value2, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorpwdNotBetween(String value1, String value2) {
            addCriterion("Visitorpwd not between", value1, value2, "visitorpwd");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIsNull() {
            addCriterion("VisitorRoleID is null");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIsNotNull() {
            addCriterion("VisitorRoleID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidEqualTo(Integer value) {
            addCriterion("VisitorRoleID =", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotEqualTo(Integer value) {
            addCriterion("VisitorRoleID <>", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidGreaterThan(Integer value) {
            addCriterion("VisitorRoleID >", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorRoleID >=", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidLessThan(Integer value) {
            addCriterion("VisitorRoleID <", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorRoleID <=", value, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidIn(List<Integer> values) {
            addCriterion("VisitorRoleID in", values, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotIn(List<Integer> values) {
            addCriterion("VisitorRoleID not in", values, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidBetween(Integer value1, Integer value2) {
            addCriterion("VisitorRoleID between", value1, value2, "visitorroleid");
            return (Criteria) this;
        }

        public Criteria andVisitorroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorRoleID not between", value1, value2, "visitorroleid");
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