//服务层
app.service('totalService',function($http){


    //查询销售统计
    this.findAll=function(day){
        return $http.get('../total/findAll.do?day='+day);
    };

    //查询退货统计
    this.findDrawback=function(day){
        return $http.get('../total/drawback.do?day='+day);
    };

    //导出统计
    this.exportTotalAll=function(totalList){
        return $http.post('../export/total.do',totalList);
    };

    //导出退货
    this.exportDrawback=function(inoutList){
        return $http.post('../export/drawback.do',inoutList);
    };


});