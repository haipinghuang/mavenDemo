package com.hai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatchExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNull() {
            addCriterion("VERSION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIsNotNull() {
            addCriterion("VERSION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVersionCodeEqualTo(Integer value) {
            addCriterion("VERSION_CODE =", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotEqualTo(Integer value) {
            addCriterion("VERSION_CODE <>", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThan(Integer value) {
            addCriterion("VERSION_CODE >", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_CODE >=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThan(Integer value) {
            addCriterion("VERSION_CODE <", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_CODE <=", value, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeIn(List<Integer> values) {
            addCriterion("VERSION_CODE in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotIn(List<Integer> values) {
            addCriterion("VERSION_CODE not in", values, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_CODE between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andVersionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_CODE not between", value1, value2, "versionCode");
            return (Criteria) this;
        }

        public Criteria andPatchMd5IsNull() {
            addCriterion("PATCH_MD5 is null");
            return (Criteria) this;
        }

        public Criteria andPatchMd5IsNotNull() {
            addCriterion("PATCH_MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andPatchMd5EqualTo(String value) {
            addCriterion("PATCH_MD5 =", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5NotEqualTo(String value) {
            addCriterion("PATCH_MD5 <>", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5GreaterThan(String value) {
            addCriterion("PATCH_MD5 >", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5GreaterThanOrEqualTo(String value) {
            addCriterion("PATCH_MD5 >=", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5LessThan(String value) {
            addCriterion("PATCH_MD5 <", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5LessThanOrEqualTo(String value) {
            addCriterion("PATCH_MD5 <=", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5Like(String value) {
            addCriterion("PATCH_MD5 like", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5NotLike(String value) {
            addCriterion("PATCH_MD5 not like", value, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5In(List<String> values) {
            addCriterion("PATCH_MD5 in", values, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5NotIn(List<String> values) {
            addCriterion("PATCH_MD5 not in", values, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5Between(String value1, String value2) {
            addCriterion("PATCH_MD5 between", value1, value2, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andPatchMd5NotBetween(String value1, String value2) {
            addCriterion("PATCH_MD5 not between", value1, value2, "patchMd5");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumIsNull() {
            addCriterion("DOWNLOAD_SUCCESS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumIsNotNull() {
            addCriterion("DOWNLOAD_SUCCESS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumEqualTo(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM =", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumNotEqualTo(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM <>", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumGreaterThan(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM >", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM >=", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumLessThan(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM <", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOAD_SUCCESS_NUM <=", value, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumIn(List<Integer> values) {
            addCriterion("DOWNLOAD_SUCCESS_NUM in", values, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumNotIn(List<Integer> values) {
            addCriterion("DOWNLOAD_SUCCESS_NUM not in", values, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_SUCCESS_NUM between", value1, value2, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andDownloadSuccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOAD_SUCCESS_NUM not between", value1, value2, "downloadSuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumIsNull() {
            addCriterion("\"APPLY_ SUCCESS _NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumIsNotNull() {
            addCriterion("\"APPLY_ SUCCESS _NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumEqualTo(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" =", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumNotEqualTo(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" <>", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumGreaterThan(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" >", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" >=", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumLessThan(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" <", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" <=", value, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumIn(List<Integer> values) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" in", values, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumNotIn(List<Integer> values) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" not in", values, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumBetween(Integer value1, Integer value2) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" between", value1, value2, "applySuccessNum");
            return (Criteria) this;
        }

        public Criteria andApplySuccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("\"APPLY_ SUCCESS _NUM\" not between", value1, value2, "applySuccessNum");
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