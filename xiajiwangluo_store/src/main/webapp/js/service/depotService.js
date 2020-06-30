//服务层
app.service('depotService',function($http){

    //库存查询
    this.findPage=function (pageNum,pageSize,da_list){
        return $http.post('../depot/findPage.do?pageNum='+pageNum+'&pageSize='+pageSize,da_list);
    }

});
