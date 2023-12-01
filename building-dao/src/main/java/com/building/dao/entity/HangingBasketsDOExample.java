/*
* HangingBasketsDOExample.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HangingBasketsDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HangingBasketsDOExample() {
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

        public Criteria andBasketsCodeIsNull() {
            addCriterion("baskets_code is null");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeIsNotNull() {
            addCriterion("baskets_code is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeEqualTo(String value) {
            addCriterion("baskets_code =", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeNotEqualTo(String value) {
            addCriterion("baskets_code <>", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeGreaterThan(String value) {
            addCriterion("baskets_code >", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_code >=", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeLessThan(String value) {
            addCriterion("baskets_code <", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeLessThanOrEqualTo(String value) {
            addCriterion("baskets_code <=", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeLike(String value) {
            addCriterion("baskets_code like", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeNotLike(String value) {
            addCriterion("baskets_code not like", value, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeIn(List<String> values) {
            addCriterion("baskets_code in", values, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeNotIn(List<String> values) {
            addCriterion("baskets_code not in", values, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeBetween(String value1, String value2) {
            addCriterion("baskets_code between", value1, value2, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsCodeNotBetween(String value1, String value2) {
            addCriterion("baskets_code not between", value1, value2, "basketsCode");
            return (Criteria) this;
        }

        public Criteria andBasketsNameIsNull() {
            addCriterion("baskets_name is null");
            return (Criteria) this;
        }

        public Criteria andBasketsNameIsNotNull() {
            addCriterion("baskets_name is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsNameEqualTo(String value) {
            addCriterion("baskets_name =", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameNotEqualTo(String value) {
            addCriterion("baskets_name <>", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameGreaterThan(String value) {
            addCriterion("baskets_name >", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_name >=", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameLessThan(String value) {
            addCriterion("baskets_name <", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameLessThanOrEqualTo(String value) {
            addCriterion("baskets_name <=", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameLike(String value) {
            addCriterion("baskets_name like", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameNotLike(String value) {
            addCriterion("baskets_name not like", value, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameIn(List<String> values) {
            addCriterion("baskets_name in", values, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameNotIn(List<String> values) {
            addCriterion("baskets_name not in", values, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameBetween(String value1, String value2) {
            addCriterion("baskets_name between", value1, value2, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsNameNotBetween(String value1, String value2) {
            addCriterion("baskets_name not between", value1, value2, "basketsName");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusIsNull() {
            addCriterion("baskets_status is null");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusIsNotNull() {
            addCriterion("baskets_status is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusEqualTo(String value) {
            addCriterion("baskets_status =", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusNotEqualTo(String value) {
            addCriterion("baskets_status <>", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusGreaterThan(String value) {
            addCriterion("baskets_status >", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_status >=", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusLessThan(String value) {
            addCriterion("baskets_status <", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusLessThanOrEqualTo(String value) {
            addCriterion("baskets_status <=", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusLike(String value) {
            addCriterion("baskets_status like", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusNotLike(String value) {
            addCriterion("baskets_status not like", value, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusIn(List<String> values) {
            addCriterion("baskets_status in", values, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusNotIn(List<String> values) {
            addCriterion("baskets_status not in", values, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusBetween(String value1, String value2) {
            addCriterion("baskets_status between", value1, value2, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsStatusNotBetween(String value1, String value2) {
            addCriterion("baskets_status not between", value1, value2, "basketsStatus");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressIsNull() {
            addCriterion("baskets_address is null");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressIsNotNull() {
            addCriterion("baskets_address is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressEqualTo(String value) {
            addCriterion("baskets_address =", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressNotEqualTo(String value) {
            addCriterion("baskets_address <>", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressGreaterThan(String value) {
            addCriterion("baskets_address >", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_address >=", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressLessThan(String value) {
            addCriterion("baskets_address <", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressLessThanOrEqualTo(String value) {
            addCriterion("baskets_address <=", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressLike(String value) {
            addCriterion("baskets_address like", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressNotLike(String value) {
            addCriterion("baskets_address not like", value, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressIn(List<String> values) {
            addCriterion("baskets_address in", values, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressNotIn(List<String> values) {
            addCriterion("baskets_address not in", values, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressBetween(String value1, String value2) {
            addCriterion("baskets_address between", value1, value2, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andBasketsAddressNotBetween(String value1, String value2) {
            addCriterion("baskets_address not between", value1, value2, "basketsAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andBasketsModelIsNull() {
            addCriterion("baskets_model is null");
            return (Criteria) this;
        }

        public Criteria andBasketsModelIsNotNull() {
            addCriterion("baskets_model is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsModelEqualTo(String value) {
            addCriterion("baskets_model =", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelNotEqualTo(String value) {
            addCriterion("baskets_model <>", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelGreaterThan(String value) {
            addCriterion("baskets_model >", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_model >=", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelLessThan(String value) {
            addCriterion("baskets_model <", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelLessThanOrEqualTo(String value) {
            addCriterion("baskets_model <=", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelLike(String value) {
            addCriterion("baskets_model like", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelNotLike(String value) {
            addCriterion("baskets_model not like", value, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelIn(List<String> values) {
            addCriterion("baskets_model in", values, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelNotIn(List<String> values) {
            addCriterion("baskets_model not in", values, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelBetween(String value1, String value2) {
            addCriterion("baskets_model between", value1, value2, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsModelNotBetween(String value1, String value2) {
            addCriterion("baskets_model not between", value1, value2, "basketsModel");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeIsNull() {
            addCriterion("baskets_manager_code is null");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeIsNotNull() {
            addCriterion("baskets_manager_code is not null");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeEqualTo(String value) {
            addCriterion("baskets_manager_code =", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeNotEqualTo(String value) {
            addCriterion("baskets_manager_code <>", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeGreaterThan(String value) {
            addCriterion("baskets_manager_code >", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("baskets_manager_code >=", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeLessThan(String value) {
            addCriterion("baskets_manager_code <", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeLessThanOrEqualTo(String value) {
            addCriterion("baskets_manager_code <=", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeLike(String value) {
            addCriterion("baskets_manager_code like", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeNotLike(String value) {
            addCriterion("baskets_manager_code not like", value, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeIn(List<String> values) {
            addCriterion("baskets_manager_code in", values, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeNotIn(List<String> values) {
            addCriterion("baskets_manager_code not in", values, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeBetween(String value1, String value2) {
            addCriterion("baskets_manager_code between", value1, value2, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andBasketsManagerCodeNotBetween(String value1, String value2) {
            addCriterion("baskets_manager_code not between", value1, value2, "basketsManagerCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
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