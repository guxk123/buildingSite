/*
* ZoneDOExample.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZoneDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZoneDOExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIsNull() {
            addCriterion("zone_code is null");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIsNotNull() {
            addCriterion("zone_code is not null");
            return (Criteria) this;
        }

        public Criteria andZoneCodeEqualTo(String value) {
            addCriterion("zone_code =", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotEqualTo(String value) {
            addCriterion("zone_code <>", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeGreaterThan(String value) {
            addCriterion("zone_code >", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zone_code >=", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLessThan(String value) {
            addCriterion("zone_code <", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLessThanOrEqualTo(String value) {
            addCriterion("zone_code <=", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeLike(String value) {
            addCriterion("zone_code like", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotLike(String value) {
            addCriterion("zone_code not like", value, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeIn(List<String> values) {
            addCriterion("zone_code in", values, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotIn(List<String> values) {
            addCriterion("zone_code not in", values, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeBetween(String value1, String value2) {
            addCriterion("zone_code between", value1, value2, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneCodeNotBetween(String value1, String value2) {
            addCriterion("zone_code not between", value1, value2, "zoneCode");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNull() {
            addCriterion("order_index is null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNotNull() {
            addCriterion("order_index is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexEqualTo(Integer value) {
            addCriterion("order_index =", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotEqualTo(Integer value) {
            addCriterion("order_index <>", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThan(Integer value) {
            addCriterion("order_index >", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_index >=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThan(Integer value) {
            addCriterion("order_index <", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("order_index <=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIn(List<Integer> values) {
            addCriterion("order_index in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotIn(List<Integer> values) {
            addCriterion("order_index not in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexBetween(Integer value1, Integer value2) {
            addCriterion("order_index between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("order_index not between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andZoneLevelIsNull() {
            addCriterion("zone_level is null");
            return (Criteria) this;
        }

        public Criteria andZoneLevelIsNotNull() {
            addCriterion("zone_level is not null");
            return (Criteria) this;
        }

        public Criteria andZoneLevelEqualTo(Integer value) {
            addCriterion("zone_level =", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelNotEqualTo(Integer value) {
            addCriterion("zone_level <>", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelGreaterThan(Integer value) {
            addCriterion("zone_level >", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("zone_level >=", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelLessThan(Integer value) {
            addCriterion("zone_level <", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelLessThanOrEqualTo(Integer value) {
            addCriterion("zone_level <=", value, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelIn(List<Integer> values) {
            addCriterion("zone_level in", values, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelNotIn(List<Integer> values) {
            addCriterion("zone_level not in", values, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelBetween(Integer value1, Integer value2) {
            addCriterion("zone_level between", value1, value2, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andZoneLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("zone_level not between", value1, value2, "zoneLevel");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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