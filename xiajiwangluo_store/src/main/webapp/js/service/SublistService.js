//服务层
app.service('SublistService',function($http){

    //查询子账号信息
    this.findAll1=function(count){
        return $http.get('../sublist/findAll.do?count='+count);
    };


    //修改子账号信息
    this.update=function(shopSublist){
        return $http.post('../sublist/update.do',shopSublist);
    };
});