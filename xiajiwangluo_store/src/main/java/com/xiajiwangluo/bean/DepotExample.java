package com.xiajiwangluo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DepotExample {
    protected String orderByClause;

    protected boolean distinct;//去除重复

    protected List<Criteria> oredCriteria;

    public DepotExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
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

        public Criteria andXiaoqiIsNull() {
            addCriterion("xiaoqi is null");
            return (Criteria) this;
        }

        public Criteria andXiaoqiIsNotNull() {
            addCriterion("xiaoqi is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoqiEqualTo(Date value) {
            addCriterionForJDBCDate("xiaoqi =", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("xiaoqi <>", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiGreaterThan(Date value) {
            addCriterionForJDBCDate("xiaoqi >", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xiaoqi >=", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiLessThan(Date value) {
            addCriterionForJDBCDate("xiaoqi <", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xiaoqi <=", value, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiIn(List<Date> values) {
            addCriterionForJDBCDate("xiaoqi in", values, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("xiaoqi not in", values, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xiaoqi between", value1, value2, "xiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiaoqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xiaoqi not between", value1, value2, "xiaoqi");
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

        public Criteria andPurchaseIsNull() {
            addCriterion("purchase is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNotNull() {
            addCriterion("purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseEqualTo(Double value) {
            addCriterion("purchase =", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotEqualTo(Double value) {
            addCriterion("purchase <>", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThan(Double value) {
            addCriterion("purchase >", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase >=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThan(Double value) {
            addCriterion("purchase <", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThanOrEqualTo(Double value) {
            addCriterion("purchase <=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIn(List<Double> values) {
            addCriterion("purchase in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotIn(List<Double> values) {
            addCriterion("purchase not in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseBetween(Double value1, Double value2) {
            addCriterion("purchase between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotBetween(Double value1, Double value2) {
            addCriterion("purchase not between", value1, value2, "purchase");
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Double value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Double value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Double value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Double value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Double value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Double value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Double> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Double> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Double value1, Double value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Double value1, Double value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTejiaIsNull() {
            addCriterion("tejia is null");
            return (Criteria) this;
        }

        public Criteria andTejiaIsNotNull() {
            addCriterion("tejia is not null");
            return (Criteria) this;
        }

        public Criteria andTejiaEqualTo(Double value) {
            addCriterion("tejia =", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaNotEqualTo(Double value) {
            addCriterion("tejia <>", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaGreaterThan(Double value) {
            addCriterion("tejia >", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaGreaterThanOrEqualTo(Double value) {
            addCriterion("tejia >=", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaLessThan(Double value) {
            addCriterion("tejia <", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaLessThanOrEqualTo(Double value) {
            addCriterion("tejia <=", value, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaIn(List<Double> values) {
            addCriterion("tejia in", values, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaNotIn(List<Double> values) {
            addCriterion("tejia not in", values, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaBetween(Double value1, Double value2) {
            addCriterion("tejia between", value1, value2, "tejia");
            return (Criteria) this;
        }

        public Criteria andTejiaNotBetween(Double value1, Double value2) {
            addCriterion("tejia not between", value1, value2, "tejia");
            return (Criteria) this;
        }

        public Criteria andHdbeginIsNull() {
            addCriterion("hdbegin is null");
            return (Criteria) this;
        }

        public Criteria andHdbeginIsNotNull() {
            addCriterion("hdbegin is not null");
            return (Criteria) this;
        }

        public Criteria andHdbeginEqualTo(Date value) {
            addCriterionForJDBCDate("hdbegin =", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("hdbegin <>", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("hdbegin >", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdbegin >=", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginLessThan(Date value) {
            addCriterionForJDBCDate("hdbegin <", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdbegin <=", value, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginIn(List<Date> values) {
            addCriterionForJDBCDate("hdbegin in", values, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("hdbegin not in", values, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdbegin between", value1, value2, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdbegin not between", value1, value2, "hdbegin");
            return (Criteria) this;
        }

        public Criteria andHdendIsNull() {
            addCriterion("hdend is null");
            return (Criteria) this;
        }

        public Criteria andHdendIsNotNull() {
            addCriterion("hdend is not null");
            return (Criteria) this;
        }

        public Criteria andHdendEqualTo(Date value) {
            addCriterionForJDBCDate("hdend =", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendNotEqualTo(Date value) {
            addCriterionForJDBCDate("hdend <>", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendGreaterThan(Date value) {
            addCriterionForJDBCDate("hdend >", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdend >=", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendLessThan(Date value) {
            addCriterionForJDBCDate("hdend <", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdend <=", value, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendIn(List<Date> values) {
            addCriterionForJDBCDate("hdend in", values, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendNotIn(List<Date> values) {
            addCriterionForJDBCDate("hdend not in", values, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdend between", value1, value2, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdend not between", value1, value2, "hdend");
            return (Criteria) this;
        }

        public Criteria andHdnamesIsNull() {
            addCriterion("hdnames is null");
            return (Criteria) this;
        }

        public Criteria andHdnamesIsNotNull() {
            addCriterion("hdnames is not null");
            return (Criteria) this;
        }

        public Criteria andHdnamesEqualTo(String value) {
            addCriterion("hdnames =", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesNotEqualTo(String value) {
            addCriterion("hdnames <>", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesGreaterThan(String value) {
            addCriterion("hdnames >", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesGreaterThanOrEqualTo(String value) {
            addCriterion("hdnames >=", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesLessThan(String value) {
            addCriterion("hdnames <", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesLessThanOrEqualTo(String value) {
            addCriterion("hdnames <=", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesLike(String value) {
            addCriterion("hdnames like", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesNotLike(String value) {
            addCriterion("hdnames not like", value, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesIn(List<String> values) {
            addCriterion("hdnames in", values, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesNotIn(List<String> values) {
            addCriterion("hdnames not in", values, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesBetween(String value1, String value2) {
            addCriterion("hdnames between", value1, value2, "hdnames");
            return (Criteria) this;
        }

        public Criteria andHdnamesNotBetween(String value1, String value2) {
            addCriterion("hdnames not between", value1, value2, "hdnames");
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

        public Criteria andClsEqualTo(String value) {
            addCriterion("cls =", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotEqualTo(String value) {
            addCriterion("cls <>", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsGreaterThan(String value) {
            addCriterion("cls >", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsGreaterThanOrEqualTo(String value) {
            addCriterion("cls >=", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsLessThan(String value) {
            addCriterion("cls <", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsLessThanOrEqualTo(String value) {
            addCriterion("cls <=", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsLike(String value) {
            addCriterion("cls like", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotLike(String value) {
            addCriterion("cls not like", value, "cls");
            return (Criteria) this;
        }

        public Criteria andClsIn(List<String> values) {
            addCriterion("cls in", values, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotIn(List<String> values) {
            addCriterion("cls not in", values, "cls");
            return (Criteria) this;
        }

        public Criteria andClsBetween(String value1, String value2) {
            addCriterion("cls between", value1, value2, "cls");
            return (Criteria) this;
        }

        public Criteria andClsNotBetween(String value1, String value2) {
            addCriterion("cls not between", value1, value2, "cls");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andRukuIsNull() {
            addCriterion("ruku is null");
            return (Criteria) this;
        }

        public Criteria andRukuIsNotNull() {
            addCriterion("ruku is not null");
            return (Criteria) this;
        }

        public Criteria andRukuEqualTo(Date value) {
            addCriterion("ruku =", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuNotEqualTo(Date value) {
            addCriterion("ruku <>", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuGreaterThan(Date value) {
            addCriterion("ruku >", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuGreaterThanOrEqualTo(Date value) {
            addCriterion("ruku >=", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuLessThan(Date value) {
            addCriterion("ruku <", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuLessThanOrEqualTo(Date value) {
            addCriterion("ruku <=", value, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuIn(List<Date> values) {
            addCriterion("ruku in", values, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuNotIn(List<Date> values) {
            addCriterion("ruku not in", values, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuBetween(Date value1, Date value2) {
            addCriterion("ruku between", value1, value2, "ruku");
            return (Criteria) this;
        }

        public Criteria andRukuNotBetween(Date value1, Date value2) {
            addCriterion("ruku not between", value1, value2, "ruku");
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