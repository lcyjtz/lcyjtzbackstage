package com.example.lcyjtz.entity;

import java.util.ArrayList;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPictureIdIsNull() {
            addCriterion("Picture_ID is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("Picture_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(Integer value) {
            addCriterion("Picture_ID =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(Integer value) {
            addCriterion("Picture_ID <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(Integer value) {
            addCriterion("Picture_ID >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Picture_ID >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(Integer value) {
            addCriterion("Picture_ID <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("Picture_ID <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<Integer> values) {
            addCriterion("Picture_ID in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<Integer> values) {
            addCriterion("Picture_ID not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("Picture_ID between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Picture_ID not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameIsNull() {
            addCriterion("Picture_FileName is null");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameIsNotNull() {
            addCriterion("Picture_FileName is not null");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameEqualTo(String value) {
            addCriterion("Picture_FileName =", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameNotEqualTo(String value) {
            addCriterion("Picture_FileName <>", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameGreaterThan(String value) {
            addCriterion("Picture_FileName >", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("Picture_FileName >=", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameLessThan(String value) {
            addCriterion("Picture_FileName <", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameLessThanOrEqualTo(String value) {
            addCriterion("Picture_FileName <=", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameLike(String value) {
            addCriterion("Picture_FileName like", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameNotLike(String value) {
            addCriterion("Picture_FileName not like", value, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameIn(List<String> values) {
            addCriterion("Picture_FileName in", values, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameNotIn(List<String> values) {
            addCriterion("Picture_FileName not in", values, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameBetween(String value1, String value2) {
            addCriterion("Picture_FileName between", value1, value2, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPictureFilenameNotBetween(String value1, String value2) {
            addCriterion("Picture_FileName not between", value1, value2, "pictureFilename");
            return (Criteria) this;
        }

        public Criteria andPicturePathIsNull() {
            addCriterion("Picture_Path is null");
            return (Criteria) this;
        }

        public Criteria andPicturePathIsNotNull() {
            addCriterion("Picture_Path is not null");
            return (Criteria) this;
        }

        public Criteria andPicturePathEqualTo(String value) {
            addCriterion("Picture_Path =", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathNotEqualTo(String value) {
            addCriterion("Picture_Path <>", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathGreaterThan(String value) {
            addCriterion("Picture_Path >", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("Picture_Path >=", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathLessThan(String value) {
            addCriterion("Picture_Path <", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathLessThanOrEqualTo(String value) {
            addCriterion("Picture_Path <=", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathLike(String value) {
            addCriterion("Picture_Path like", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathNotLike(String value) {
            addCriterion("Picture_Path not like", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathIn(List<String> values) {
            addCriterion("Picture_Path in", values, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathNotIn(List<String> values) {
            addCriterion("Picture_Path not in", values, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathBetween(String value1, String value2) {
            addCriterion("Picture_Path between", value1, value2, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPicturePathNotBetween(String value1, String value2) {
            addCriterion("Picture_Path not between", value1, value2, "picturePath");
            return (Criteria) this;
        }

        public Criteria andPictureDataIsNull() {
            addCriterion("Picture_Data is null");
            return (Criteria) this;
        }

        public Criteria andPictureDataIsNotNull() {
            addCriterion("Picture_Data is not null");
            return (Criteria) this;
        }

        public Criteria andPictureDataEqualTo(String value) {
            addCriterion("Picture_Data =", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataNotEqualTo(String value) {
            addCriterion("Picture_Data <>", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataGreaterThan(String value) {
            addCriterion("Picture_Data >", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataGreaterThanOrEqualTo(String value) {
            addCriterion("Picture_Data >=", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataLessThan(String value) {
            addCriterion("Picture_Data <", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataLessThanOrEqualTo(String value) {
            addCriterion("Picture_Data <=", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataLike(String value) {
            addCriterion("Picture_Data like", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataNotLike(String value) {
            addCriterion("Picture_Data not like", value, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataIn(List<String> values) {
            addCriterion("Picture_Data in", values, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataNotIn(List<String> values) {
            addCriterion("Picture_Data not in", values, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataBetween(String value1, String value2) {
            addCriterion("Picture_Data between", value1, value2, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureDataNotBetween(String value1, String value2) {
            addCriterion("Picture_Data not between", value1, value2, "pictureData");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIsNull() {
            addCriterion("Picture_Title is null");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIsNotNull() {
            addCriterion("Picture_Title is not null");
            return (Criteria) this;
        }

        public Criteria andPictureTitleEqualTo(String value) {
            addCriterion("Picture_Title =", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotEqualTo(String value) {
            addCriterion("Picture_Title <>", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleGreaterThan(String value) {
            addCriterion("Picture_Title >", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Picture_Title >=", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLessThan(String value) {
            addCriterion("Picture_Title <", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLessThanOrEqualTo(String value) {
            addCriterion("Picture_Title <=", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLike(String value) {
            addCriterion("Picture_Title like", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotLike(String value) {
            addCriterion("Picture_Title not like", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIn(List<String> values) {
            addCriterion("Picture_Title in", values, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotIn(List<String> values) {
            addCriterion("Picture_Title not in", values, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleBetween(String value1, String value2) {
            addCriterion("Picture_Title between", value1, value2, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotBetween(String value1, String value2) {
            addCriterion("Picture_Title not between", value1, value2, "pictureTitle");
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