package com.xiajiwangluo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andFarenIsNull() {
            addCriterion("faren is null");
            return (Criteria) this;
        }

        public Criteria andFarenIsNotNull() {
            addCriterion("faren is not null");
            return (Criteria) this;
        }

        public Criteria andFarenEqualTo(String value) {
            addCriterion("faren =", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotEqualTo(String value) {
            addCriterion("faren <>", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenGreaterThan(String value) {
            addCriterion("faren >", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenGreaterThanOrEqualTo(String value) {
            addCriterion("faren >=", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLessThan(String value) {
            addCriterion("faren <", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLessThanOrEqualTo(String value) {
            addCriterion("faren <=", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenLike(String value) {
            addCriterion("faren like", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotLike(String value) {
            addCriterion("faren not like", value, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenIn(List<String> values) {
            addCriterion("faren in", values, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotIn(List<String> values) {
            addCriterion("faren not in", values, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenBetween(String value1, String value2) {
            addCriterion("faren between", value1, value2, "faren");
            return (Criteria) this;
        }

        public Criteria andFarenNotBetween(String value1, String value2) {
            addCriterion("faren not between", value1, value2, "faren");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
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

        public Criteria andManIsNull() {
            addCriterion("man is null");
            return (Criteria) this;
        }

        public Criteria andManIsNotNull() {
            addCriterion("man is not null");
            return (Criteria) this;
        }

        public Criteria andManEqualTo(Double value) {
            addCriterion("man =", value, "man");
            return (Criteria) this;
        }

        public Criteria andManNotEqualTo(Double value) {
            addCriterion("man <>", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThan(Double value) {
            addCriterion("man >", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThanOrEqualTo(Double value) {
            addCriterion("man >=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThan(Double value) {
            addCriterion("man <", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThanOrEqualTo(Double value) {
            addCriterion("man <=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManIn(List<Double> values) {
            addCriterion("man in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManNotIn(List<Double> values) {
            addCriterion("man not in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManBetween(Double value1, Double value2) {
            addCriterion("man between", value1, value2, "man");
            return (Criteria) this;
        }

        public Criteria andManNotBetween(Double value1, Double value2) {
            addCriterion("man not between", value1, value2, "man");
            return (Criteria) this;
        }

        public Criteria andJianIsNull() {
            addCriterion("jian is null");
            return (Criteria) this;
        }

        public Criteria andJianIsNotNull() {
            addCriterion("jian is not null");
            return (Criteria) this;
        }

        public Criteria andJianEqualTo(Double value) {
            addCriterion("jian =", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotEqualTo(Double value) {
            addCriterion("jian <>", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianGreaterThan(Double value) {
            addCriterion("jian >", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianGreaterThanOrEqualTo(Double value) {
            addCriterion("jian >=", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianLessThan(Double value) {
            addCriterion("jian <", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianLessThanOrEqualTo(Double value) {
            addCriterion("jian <=", value, "jian");
            return (Criteria) this;
        }

        public Criteria andJianIn(List<Double> values) {
            addCriterion("jian in", values, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotIn(List<Double> values) {
            addCriterion("jian not in", values, "jian");
            return (Criteria) this;
        }

        public Criteria andJianBetween(Double value1, Double value2) {
            addCriterion("jian between", value1, value2, "jian");
            return (Criteria) this;
        }

        public Criteria andJianNotBetween(Double value1, Double value2) {
            addCriterion("jian not between", value1, value2, "jian");
            return (Criteria) this;
        }

        public Criteria andZkIsNull() {
            addCriterion("zk is null");
            return (Criteria) this;
        }

        public Criteria andZkIsNotNull() {
            addCriterion("zk is not null");
            return (Criteria) this;
        }

        public Criteria andZkEqualTo(Double value) {
            addCriterion("zk =", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotEqualTo(Double value) {
            addCriterion("zk <>", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkGreaterThan(Double value) {
            addCriterion("zk >", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkGreaterThanOrEqualTo(Double value) {
            addCriterion("zk >=", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkLessThan(Double value) {
            addCriterion("zk <", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkLessThanOrEqualTo(Double value) {
            addCriterion("zk <=", value, "zk");
            return (Criteria) this;
        }

        public Criteria andZkIn(List<Double> values) {
            addCriterion("zk in", values, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotIn(List<Double> values) {
            addCriterion("zk not in", values, "zk");
            return (Criteria) this;
        }

        public Criteria andZkBetween(Double value1, Double value2) {
            addCriterion("zk between", value1, value2, "zk");
            return (Criteria) this;
        }

        public Criteria andZkNotBetween(Double value1, Double value2) {
            addCriterion("zk not between", value1, value2, "zk");
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

        public Criteria andCodesIsNull() {
            addCriterion("codes is null");
            return (Criteria) this;
        }

        public Criteria andCodesIsNotNull() {
            addCriterion("codes is not null");
            return (Criteria) this;
        }

        public Criteria andCodesEqualTo(String value) {
            addCriterion("codes =", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesNotEqualTo(String value) {
            addCriterion("codes <>", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesGreaterThan(String value) {
            addCriterion("codes >", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesGreaterThanOrEqualTo(String value) {
            addCriterion("codes >=", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesLessThan(String value) {
            addCriterion("codes <", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesLessThanOrEqualTo(String value) {
            addCriterion("codes <=", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesLike(String value) {
            addCriterion("codes like", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesNotLike(String value) {
            addCriterion("codes not like", value, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesIn(List<String> values) {
            addCriterion("codes in", values, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesNotIn(List<String> values) {
            addCriterion("codes not in", values, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesBetween(String value1, String value2) {
            addCriterion("codes between", value1, value2, "codes");
            return (Criteria) this;
        }

        public Criteria andCodesNotBetween(String value1, String value2) {
            addCriterion("codes not between", value1, value2, "codes");
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

        public Criteria andRangeIsNull() {
            addCriterion("range is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("range is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("range =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("range <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("range >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("range >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("range <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("range <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("range like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("range not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("range in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("range not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("range between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("range not between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openID not between", value1, value2, "openid");
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

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
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