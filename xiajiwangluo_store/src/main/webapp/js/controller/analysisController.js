app.controller("analysisController",function ($scope,analysisService) {

    $scope.num=30;

    //查询滞销产品
    $scope.findUnsalable=function () {
        analysisService.findUnsalable($scope.num).success(
            function (response) {
                $scope.list=response;
            }
        )
    };

    //获取当前日期的字符串格式
    $scope.nowDate=function () {
        var now=new Date();
        if(parseInt(now.getMonth())>9){
            if(now.getDate()>9){
                return now.getFullYear()+"-"+now.getMonth()+"-"+now.getDate();
            }else {
                return now.getFullYear()+"-"+now.getMonth()+"-"+0+now.getDate();
            }
        }else {
            return now.getFullYear()+"-"+ 0+now.getMonth()+"-"+0+now.getDate();
        }
    };

    $scope.DA_list={"data":$scope.nowDate(),"type":"num"};

    //销售黑榜
    $scope.findWorst=function () {
        analysisService.findWorst($scope.DA_list).success(
            function (response) {
                if($scope.DA_list.type == "num"){
                    $scope.type= "数量"
                }
                if($scope.DA_list.type == "price"){
                    $scope.type= "金额"
                }
                if($scope.DA_list.type == "profit"){
                    $scope.type= "利润"
                }
                $scope.list=response;
            }
        )
    };

    //销售红榜
    $scope.findBest=function () {
        analysisService.findBest($scope.DA_list).success(
            function (response) {
                if($scope.DA_list.type == "num"){
                    $scope.type= "数量"
                }
                if($scope.DA_list.type == "price"){
                    $scope.type= "金额"
                }
                if($scope.DA_list.type == "profit"){
                    $scope.type= "利润"
                }
                $scope.list=response;
            }
        )
    };



});