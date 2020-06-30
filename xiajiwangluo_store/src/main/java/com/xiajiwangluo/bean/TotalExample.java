package com.xiajiwangluo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalExample() {
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

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Date value) {
            addCriterionForJDBCDate("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Date value) {
            addCriterionForJDBCDate("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Date value) {
            addCriterionForJDBCDate("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Date value) {
            addCriterionForJDBCDate("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Date> values) {
            addCriterionForJDBCDate("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Date> values) {
            addCriterionForJDBCDate("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andXianshangIsNull() {
            addCriterion("xianshang is null");
            return (Criteria) this;
        }

        public Criteria andXianshangIsNotNull() {
            addCriterion("xianshang is not null");
            return (Criteria) this;
        }

        public Criteria andXianshangEqualTo(Double value) {
            addCriterion("xianshang =", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangNotEqualTo(Double value) {
            addCriterion("xianshang <>", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangGreaterThan(Double value) {
            addCriterion("xianshang >", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangGreaterThanOrEqualTo(Double value) {
            addCriterion("xianshang >=", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangLessThan(Double value) {
            addCriterion("xianshang <", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangLessThanOrEqualTo(Double value) {
            addCriterion("xianshang <=", value, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangIn(List<Double> values) {
            addCriterion("xianshang in", values, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangNotIn(List<Double> values) {
            addCriterion("xianshang not in", values, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangBetween(Double value1, Double value2) {
            addCriterion("xianshang between", value1, value2, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianshangNotBetween(Double value1, Double value2) {
            addCriterion("xianshang not between", value1, value2, "xianshang");
            return (Criteria) this;
        }

        public Criteria andXianxiaIsNull() {
            addCriterion("xianxia is null");
            return (Criteria) this;
        }

        public Criteria andXianxiaIsNotNull() {
            addCriterion("xianxia is not null");
            return (Criteria) this;
        }

        public Criteria andXianxiaEqualTo(Double value) {
            addCriterion("xianxia =", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaNotEqualTo(Double value) {
            addCriterion("xianxia <>", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaGreaterThan(Double value) {
            addCriterion("xianxia >", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaGreaterThanOrEqualTo(Double value) {
            addCriterion("xianxia >=", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaLessThan(Double value) {
            addCriterion("xianxia <", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaLessThanOrEqualTo(Double value) {
            addCriterion("xianxia <=", value, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaIn(List<Double> values) {
            addCriterion("xianxia in", values, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaNotIn(List<Double> values) {
            addCriterion("xianxia not in", values, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaBetween(Double value1, Double value2) {
            addCriterion("xianxia between", value1, value2, "xianxia");
            return (Criteria) this;
        }

        public Criteria andXianxiaNotBetween(Double value1, Double value2) {
            addCriterion("xianxia not between", value1, value2, "xianxia");
            return (Criteria) this;
        }

        public Criteria andTotalsaleIsNull() {
            addCriterion("totalSale is null");
            return (Criteria) this;
        }

        public Criteria andTotalsaleIsNotNull() {
            addCriterion("totalSale is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsaleEqualTo(Double value) {
            addCriterion("totalSale =", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleNotEqualTo(Double value) {
            addCriterion("totalSale <>", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleGreaterThan(Double value) {
            addCriterion("totalSale >", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleGreaterThanOrEqualTo(Double value) {
            addCriterion("totalSale >=", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleLessThan(Double value) {
            addCriterion("totalSale <", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleLessThanOrEqualTo(Double value) {
            addCriterion("totalSale <=", value, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleIn(List<Double> values) {
            addCriterion("totalSale in", values, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleNotIn(List<Double> values) {
            addCriterion("totalSale not in", values, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleBetween(Double value1, Double value2) {
            addCriterion("totalSale between", value1, value2, "totalsale");
            return (Criteria) this;
        }

        public Criteria andTotalsaleNotBetween(Double value1, Double value2) {
            addCriterion("totalSale not between", value1, value2, "totalsale");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
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