package com.xiajiwangluo.bean.beangroup;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Goods;

public class TbGoods {

    private Goods goods;

    private Depot depot;

    public TbGoods() {
    }

    public TbGoods(Goods goods, Depot depot) {
        this.goods = goods;
        this.depot = depot;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }


}
