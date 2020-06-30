package com.xiajiwangluo.bean;

import java.util.List;

public class Depots {
    List<Depot> depotList;
    Integer level;

    public List<Depot> getDepotList() {
        return depotList;
    }

    public void setDepotList(List<Depot> depotList) {
        this.depotList = depotList;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

	@Override
	public String toString() {
		return "Depots [depotList=" + depotList + ", level=" + level + "]";
	}
    
    
}
