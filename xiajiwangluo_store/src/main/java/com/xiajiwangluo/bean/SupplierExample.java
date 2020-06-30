package com.xiajiwangluo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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
        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("Sid =", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("Sid <>", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("Sid >", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("Sid >=", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("Sid <", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("Sid <=", value, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("Sid in", values, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("Sid not in", values, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("Sid between", value1, value2, "Sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("Sid not between", value1, value2, "Sid");
            return (Criteria) this;
        }

        public Criteria andClsIsNull() {
            addCriterion("cls is null");
            return (Criteria) this;
        }

        public Criteria andClsIsNotNull() {
            addCriterion("cls is not null");
            return (Criteria) this;
        }

        public Criteria andClsEqualTo(Integer value) {
            addCriterion("cls =", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotEqualTo(Integer value) {
            addCriterion("cls <>", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsGreaterThan(Integer value) {
            addCriterion("cls >", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cls >=", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsLessThan(Integer value) {
            addCriterion("cls <", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsLessThanOrEqualTo(Integer value) {
            addCriterion("cls <=", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsIn(List<Integer> values) {
            addCriterion("cls in", values, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotIn(List<Integer> values) {
            addCriterion("cls not in", values, "cls");
            return (Criteria) this;
        }

        public Criteria andClsBetween(Integer value1, Integer value2) {
            addCriterion("cls between", value1, value2, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotBetween(Integer value1, Integer value2) {
            addCriterion("cls not between", value1, value2, "cls");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andYewutelIsNull() {
            addCriterion("yewuTel is null");
            return (Criteria) this;
        }

        public Criteria andYewutelIsNotNull() {
            addCriterion("yewuTel is not null");
            return (Criteria) this;
        }

        public Criteria andYewutelEqualTo(String value) {
            addCriterion("yewuTel =", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelNotEqualTo(String value) {
            addCriterion("yewuTel <>", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelGreaterThan(String value) {
            addCriterion("yewuTel >", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelGreaterThanOrEqualTo(String value) {
            addCriterion("yewuTel >=", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelLessThan(String value) {
            addCriterion("yewuTel <", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelLessThanOrEqualTo(String value) {
            addCriterion("yewuTel <=", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelLike(String value) {
            addCriterion("yewuTel like", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelNotLike(String value) {
            addCriterion("yewuTel not like", value, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelIn(List<String> values) {
            addCriterion("yewuTel in", values, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelNotIn(List<String> values) {
            addCriterion("yewuTel not in", values, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelBetween(String value1, String value2) {
            addCriterion("yewuTel between", value1, value2, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewutelNotBetween(String value1, String value2) {
            addCriterion("yewuTel not between", value1, value2, "yewutel");
            return (Criteria) this;
        }

        public Criteria andYewunameIsNull() {
            addCriterion("yewuName is null");
            return (Criteria) this;
        }

        public Criteria andYewunameIsNotNull() {
            addCriterion("yewuName is not null");
            return (Criteria) this;
        }

        public Criteria andYewunameEqualTo(String value) {
            addCriterion("yewuName =", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameNotEqualTo(String value) {
            addCriterion("yewuName <>", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameGreaterThan(String value) {
            addCriterion("yewuName >", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameGreaterThanOrEqualTo(String value) {
            addCriterion("yewuName >=", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameLessThan(String value) {
            addCriterion("yewuName <", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameLessThanOrEqualTo(String value) {
            addCriterion("yewuName <=", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameLike(String value) {
            addCriterion("yewuName like", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameNotLike(String value) {
            addCriterion("yewuName not like", value, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameIn(List<String> values) {
            addCriterion("yewuName in", values, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameNotIn(List<String> values) {
            addCriterion("yewuName not in", values, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameBetween(String value1, String value2) {
            addCriterion("yewuName between", value1, value2, "yewuname");
            return (Criteria) this;
        }

        public Criteria andYewunameNotBetween(String value1, String value2) {
            addCriterion("yewuName not between", value1, value2, "yewuname");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNormsIsNull() {
            addCriterion("norms is null");
            return (Criteria) this;
        }

        public Criteria andNormsIsNotNull() {
            addCriterion("norms is not null");
            return (Criteria) this;
        }

        public Criteria andNormsEqualTo(String value) {
            addCriterion("norms =", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotEqualTo(String value) {
            addCriterion("norms <>", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThan(String value) {
            addCriterion("norms >", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThanOrEqualTo(String value) {
            addCriterion("norms >=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThan(String value) {
            addCriterion("norms <", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThanOrEqualTo(String value) {
            addCriterion("norms <=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLike(String value) {
            addCriterion("norms like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotLike(String value) {
            addCriterion("norms not like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsIn(List<String> values) {
            addCriterion("norms in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotIn(List<String> values) {
            addCriterion("norms not in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsBetween(String value1, String value2) {
            addCriterion("norms between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotBetween(String value1, String value2) {
            addCriterion("norms not between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andJypriceIsNull() {
            addCriterion("jyPrice is null");
            return (Criteria) this;
        }

        public Criteria andJypriceIsNotNull() {
            addCriterion("jyPrice is not null");
            return (Criteria) this;
        }

        public Criteria andJypriceEqualTo(Double value) {
            addCriterion("jyPrice =", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceNotEqualTo(Double value) {
            addCriterion("jyPrice <>", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceGreaterThan(Double value) {
            addCriterion("jyPrice >", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceGreaterThanOrEqualTo(Double value) {
            addCriterion("jyPrice >=", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceLessThan(Double value) {
            addCriterion("jyPrice <", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceLessThanOrEqualTo(Double value) {
            addCriterion("jyPrice <=", value, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceIn(List<Double> values) {
            addCriterion("jyPrice in", values, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceNotIn(List<Double> values) {
            addCriterion("jyPrice not in", values, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceBetween(Double value1, Double value2) {
            addCriterion("jyPrice between", value1, value2, "jyprice");
            return (Criteria) this;
        }

        public Criteria andJypriceNotBetween(Double value1, Double value2) {
            addCriterion("jyPrice not between", value1, value2, "jyprice");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andQiyenameIsNull() {
            addCriterion("qiyeName is null");
            return (Criteria) this;
        }

        public Criteria andQiyenameIsNotNull() {
            addCriterion("qiyeName is not null");
            return (Criteria) this;
        }

        public Criteria andQiyenameEqualTo(String value) {
            addCriterion("qiyeName =", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameNotEqualTo(String value) {
            addCriterion("qiyeName <>", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameGreaterThan(String value) {
            addCriterion("qiyeName >", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameGreaterThanOrEqualTo(String value) {
            addCriterion("qiyeName >=", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameLessThan(String value) {
            addCriterion("qiyeName <", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameLessThanOrEqualTo(String value) {
            addCriterion("qiyeName <=", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameLike(String value) {
            addCriterion("qiyeName like", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameNotLike(String value) {
            addCriterion("qiyeName not like", value, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameIn(List<String> values) {
            addCriterion("qiyeName in", values, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameNotIn(List<String> values) {
            addCriterion("qiyeName not in", values, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameBetween(String value1, String value2) {
            addCriterion("qiyeName between", value1, value2, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyenameNotBetween(String value1, String value2) {
            addCriterion("qiyeName not between", value1, value2, "qiyename");
            return (Criteria) this;
        }

        public Criteria andQiyetelIsNull() {
            addCriterion("qiyeTel is null");
            return (Criteria) this;
        }

        public Criteria andQiyetelIsNotNull() {
            addCriterion("qiyeTel is not null");
            return (Criteria) this;
        }

        public Criteria andQiyetelEqualTo(String value) {
            addCriterion("qiyeTel =", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelNotEqualTo(String value) {
            addCriterion("qiyeTel <>", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelGreaterThan(String value) {
            addCriterion("qiyeTel >", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelGreaterThanOrEqualTo(String value) {
            addCriterion("qiyeTel >=", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelLessThan(String value) {
            addCriterion("qiyeTel <", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelLessThanOrEqualTo(String value) {
            addCriterion("qiyeTel <=", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelLike(String value) {
            addCriterion("qiyeTel like", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelNotLike(String value) {
            addCriterion("qiyeTel not like", value, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelIn(List<String> values) {
            addCriterion("qiyeTel in", values, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelNotIn(List<String> values) {
            addCriterion("qiyeTel not in", values, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelBetween(String value1, String value2) {
            addCriterion("qiyeTel between", value1, value2, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andQiyetelNotBetween(String value1, String value2) {
            addCriterion("qiyeTel not between", value1, value2, "qiyetel");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(String value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(String value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(String value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(String value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(String value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(String value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLike(String value) {
            addCriterion("x like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotLike(String value) {
            addCriterion("x not like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<String> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<String> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(String value1, String value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(String value1, String value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(String value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(String value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(String value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(String value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(String value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(String value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLike(String value) {
            addCriterion("y like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotLike(String value) {
            addCriterion("y not like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<String> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<String> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(String value1, String value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(String value1, String value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sname");
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