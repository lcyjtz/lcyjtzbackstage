package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("Record_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("Record_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("Record_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("Record_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("Record_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Record_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("Record_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("Record_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("Record_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("Record_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("Record_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Record_ID not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNull() {
            addCriterion("Record_Type is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("Record_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(String value) {
            addCriterion("Record_Type =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(String value) {
            addCriterion("Record_Type <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(String value) {
            addCriterion("Record_Type >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Record_Type >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(String value) {
            addCriterion("Record_Type <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("Record_Type <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLike(String value) {
            addCriterion("Record_Type like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotLike(String value) {
            addCriterion("Record_Type not like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<String> values) {
            addCriterion("Record_Type in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<String> values) {
            addCriterion("Record_Type not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(String value1, String value2) {
            addCriterion("Record_Type between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(String value1, String value2) {
            addCriterion("Record_Type not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameIsNull() {
            addCriterion("Record_FileName is null");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameIsNotNull() {
            addCriterion("Record_FileName is not null");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameEqualTo(String value) {
            addCriterion("Record_FileName =", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameNotEqualTo(String value) {
            addCriterion("Record_FileName <>", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameGreaterThan(String value) {
            addCriterion("Record_FileName >", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("Record_FileName >=", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameLessThan(String value) {
            addCriterion("Record_FileName <", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameLessThanOrEqualTo(String value) {
            addCriterion("Record_FileName <=", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameLike(String value) {
            addCriterion("Record_FileName like", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameNotLike(String value) {
            addCriterion("Record_FileName not like", value, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameIn(List<String> values) {
            addCriterion("Record_FileName in", values, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameNotIn(List<String> values) {
            addCriterion("Record_FileName not in", values, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameBetween(String value1, String value2) {
            addCriterion("Record_FileName between", value1, value2, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordFilenameNotBetween(String value1, String value2) {
            addCriterion("Record_FileName not between", value1, value2, "recordFilename");
            return (Criteria) this;
        }

        public Criteria andRecordDataIsNull() {
            addCriterion("Record_data is null");
            return (Criteria) this;
        }

        public Criteria andRecordDataIsNotNull() {
            addCriterion("Record_data is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDataEqualTo(String value) {
            addCriterion("Record_data =", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataNotEqualTo(String value) {
            addCriterion("Record_data <>", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataGreaterThan(String value) {
            addCriterion("Record_data >", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataGreaterThanOrEqualTo(String value) {
            addCriterion("Record_data >=", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataLessThan(String value) {
            addCriterion("Record_data <", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataLessThanOrEqualTo(String value) {
            addCriterion("Record_data <=", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataLike(String value) {
            addCriterion("Record_data like", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataNotLike(String value) {
            addCriterion("Record_data not like", value, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataIn(List<String> values) {
            addCriterion("Record_data in", values, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataNotIn(List<String> values) {
            addCriterion("Record_data not in", values, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataBetween(String value1, String value2) {
            addCriterion("Record_data between", value1, value2, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordDataNotBetween(String value1, String value2) {
            addCriterion("Record_data not between", value1, value2, "recordData");
            return (Criteria) this;
        }

        public Criteria andRecordPathIsNull() {
            addCriterion("Record_Path is null");
            return (Criteria) this;
        }

        public Criteria andRecordPathIsNotNull() {
            addCriterion("Record_Path is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPathEqualTo(String value) {
            addCriterion("Record_Path =", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotEqualTo(String value) {
            addCriterion("Record_Path <>", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathGreaterThan(String value) {
            addCriterion("Record_Path >", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathGreaterThanOrEqualTo(String value) {
            addCriterion("Record_Path >=", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLessThan(String value) {
            addCriterion("Record_Path <", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLessThanOrEqualTo(String value) {
            addCriterion("Record_Path <=", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathLike(String value) {
            addCriterion("Record_Path like", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotLike(String value) {
            addCriterion("Record_Path not like", value, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathIn(List<String> values) {
            addCriterion("Record_Path in", values, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotIn(List<String> values) {
            addCriterion("Record_Path not in", values, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathBetween(String value1, String value2) {
            addCriterion("Record_Path between", value1, value2, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordPathNotBetween(String value1, String value2) {
            addCriterion("Record_Path not between", value1, value2, "recordPath");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIsNull() {
            addCriterion("Record_Title is null");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIsNotNull() {
            addCriterion("Record_Title is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTitleEqualTo(String value) {
            addCriterion("Record_Title =", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotEqualTo(String value) {
            addCriterion("Record_Title <>", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleGreaterThan(String value) {
            addCriterion("Record_Title >", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Record_Title >=", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLessThan(String value) {
            addCriterion("Record_Title <", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLessThanOrEqualTo(String value) {
            addCriterion("Record_Title <=", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLike(String value) {
            addCriterion("Record_Title like", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotLike(String value) {
            addCriterion("Record_Title not like", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIn(List<String> values) {
            addCriterion("Record_Title in", values, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotIn(List<String> values) {
            addCriterion("Record_Title not in", values, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleBetween(String value1, String value2) {
            addCriterion("Record_Title between", value1, value2, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotBetween(String value1, String value2) {
            addCriterion("Record_Title not between", value1, value2, "recordTitle");
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