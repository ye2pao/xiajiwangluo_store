//服务层
app.service('analysisService',function($http){

    //滞销产品
    this.findUnsalable=function(num){
        return $http.get('../analysis/unsalable.do?data='+num);
    };

    //销售黑榜
    this.findWorst=function(da_list){
        return $http.post('../analysis/worst.do',da_list);
    };
    //销售黑榜
    this.findBest=function(da_list){
        return $http.post('../analysis/best.do',da_list);
    };
});