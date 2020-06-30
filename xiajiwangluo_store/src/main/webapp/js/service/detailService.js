//服务层
app.service('detailService',function($http){

    this.findPage=function (pageNum,pageSize,da_list){
        return $http.post('../detail/findPage.do?pageNum='+pageNum+'&pageSize='+pageSize,da_list);
    }
});