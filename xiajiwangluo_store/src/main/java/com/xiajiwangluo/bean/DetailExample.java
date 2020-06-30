package com.xiajiwangluo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andShoujiaIsNull() {
            addCriterion("shoujia is null");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNotNull() {
            addCriterion("shoujia is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiaEqualTo(Double value) {
            addCriterion("shoujia =", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotEqualTo(Double value) {
            addCriterion("shoujia <>", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThan(Double value) {
            addCriterion("shoujia >", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThanOrEqualTo(Double value) {
            addCriterion("shoujia >=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThan(Double value) {
            addCriterion("shoujia <", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThanOrEqualTo(Double value) {
            addCriterion("shoujia <=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaIn(List<Double> values) {
            addCriterion("shoujia in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotIn(List<Double> values) {
            addCriterion("shoujia not in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaBetween(Double value1, Double value2) {
            addCriterion("shoujia between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotBetween(Double value1, Double value2) {
            addCriterion("shoujia not between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andJinjiaIsNull() {
            addCriterion("jinjia is null");
            return (Criteria) this;
        }

        public Criteria andJinjiaIsNotNull() {
            addCriterion("jinjia is not null");
            return (Criteria) this;
        }

        public Criteria andJinjiaEqualTo(Double value) {
            addCriterion("jinjia =", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaNotEqualTo(Double value) {
            addCriterion("jinjia <>", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaGreaterThan(Double value) {
            addCriterion("jinjia >", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("jinjia >=", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaLessThan(Double value) {
            addCriterion("jinjia <", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaLessThanOrEqualTo(Double value) {
            addCriterion("jinjia <=", value, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaIn(List<Double> values) {
            addCriterion("jinjia in", values, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaNotIn(List<Double> values) {
            addCriterion("jinjia not in", values, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaBetween(Double value1, Double value2) {
            addCriterion("jinjia between", value1, value2, "jinjia");
            return (Criteria) this;
        }

        public Criteria andJinjiaNotBetween(Double value1, Double value2) {
            addCriterion("jinjia not between", value1, value2, "jinjia");
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

        public Criteria andDanhaoIsNull() {
            addCriterion("danhao is null");
            return (Criteria) this;
        }

        public Criteria andDanhaoIsNotNull() {
            addCriterion("danhao is not null");
            return (Criteria) this;
        }

        public Criteria andDanhaoEqualTo(Date value) {
            addCriterion("danhao =", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotEqualTo(Date value) {
            addCriterion("danhao <>", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoGreaterThan(Date value) {
            addCriterion("danhao >", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoGreaterThanOrEqualTo(Date value) {
            addCriterion("danhao >=", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoLessThan(Date value) {
            addCriterion("danhao <", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoLessThanOrEqualTo(Date value) {
            addCriterion("danhao <=", value, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoIn(List<Date> values) {
            addCriterion("danhao in", values, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotIn(List<Date> values) {
            addCriterion("danhao not in", values, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoBetween(Date value1, Date value2) {
            addCriterion("danhao between", value1, value2, "danhao");
            return (Criteria) this;
        }

        public Criteria andDanhaoNotBetween(Date value1, Date value2) {
            addCriterion("danhao not between", value1, value2, "danhao");
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

        public Criteria andPaymodeIsNull() {
            addCriterion("payMode is null");
            return (Criteria) this;
        }

        public Criteria andPaymodeIsNotNull() {
            addCriterion("payMode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymodeEqualTo(Integer value) {
            addCriterion("payMode =", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotEqualTo(Integer value) {
            addCriterion("payMode <>", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThan(Integer value) {
            addCriterion("payMode >", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payMode >=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThan(Integer value) {
            addCriterion("payMode <", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeLessThanOrEqualTo(Integer value) {
            addCriterion("payMode <=", value, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeIn(List<Integer> values) {
            addCriterion("payMode in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotIn(List<Integer> values) {
            addCriterion("payMode not in", values, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeBetween(Integer value1, Integer value2) {
            addCriterion("payMode between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andPaymodeNotBetween(Integer value1, Integer value2) {
            addCriterion("payMode not between", value1, value2, "paymode");
            return (Criteria) this;
        }

        public Criteria andTuihuoIsNull() {
            addCriterion("tuihuo is null");
            return (Criteria) this;
        }

        public Criteria andTuihuoIsNotNull() {
            addCriterion("tuihuo is not null");
            return (Criteria) this;
        }

        public Criteria andTuihuoEqualTo(Integer value) {
            addCriterion("tuihuo =", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoNotEqualTo(Integer value) {
            addCriterion("tuihuo <>", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoGreaterThan(Integer value) {
            addCriterion("tuihuo >", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuihuo >=", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoLessThan(Integer value) {
            addCriterion("tuihuo <", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoLessThanOrEqualTo(Integer value) {
            addCriterion("tuihuo <=", value, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoIn(List<Integer> values) {
            addCriterion("tuihuo in", values, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoNotIn(List<Integer> values) {
            addCriterion("tuihuo not in", values, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoBetween(Integer value1, Integer value2) {
            addCriterion("tuihuo between", value1, value2, "tuihuo");
            return (Criteria) this;
        }

        public Criteria andTuihuoNotBetween(Integer value1, Integer value2) {
            addCriterion("tuihuo not between", value1, value2, "tuihuo");
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