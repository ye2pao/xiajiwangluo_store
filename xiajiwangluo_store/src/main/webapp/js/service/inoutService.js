//服务层
app.service('inoutService',function($http){

    //查询入库明细
    this.findAll=function(cls){
        return $http.get('../inout/findAll.do?cls='+cls);
    };

    //库存查询
    this.findPage=function (pageNum,pageSize,da_list){
        return $http.post('../inout/findPage.do?pageNum='+pageNum+'&pageSize='+pageSize, da_list);
    }
});