app.controller("totalController",function ($scope,totalService) {


    //获取当前日期的字符串格式
    $scope.day=function () {
        var now=new Date();
        if(parseInt(now.getMonth())>9){
            if(now.getDate()>9){
                return now.getFullYear()+"-"+ (parseInt(now.getMonth())+1)+"-"+now.getDate();
            }else {
                return now.getFullYear()+"-"+ (parseInt(now.getMonth())+1)+"-"+0+now.getDate();
            }
        }else {
            return now.getFullYear()+"-"+ 0+(parseInt(now.getMonth())+1)+"-"+0+now.getDate();
        }
    };

    //查询统计
    $scope.findAll=function () {
        totalService.findAll($scope.day).success(
            function (response) {
                $scope.list=response;
            }
        )
    };

    //查询退货
    $scope.findDrawback=function () {
        totalService.findDrawback($scope.day).success(
            function (response) {
                $scope.list=response;
            }
        )
    };


    //导出统计锁
    $scope.exportTotalAll=function () {
        totalService.exportTotalAll($scope.list).success(
            function (response) {
                alert(response);
            }
        )
    };

    //导出退货
    $scope.exportDrawback=function () {
        totalService.exportDrawback($scope.list).success(
            function (response) {
                alert(response);
            }
        )
    }
});