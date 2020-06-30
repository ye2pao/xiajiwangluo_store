app.controller("inoutController",function ($scope, $controller,inoutService) {

    $controller("baseController",{$scope:$scope});

    //查询入库明细
    $scope.findAllIn=function () {
        inoutService.findAll(0).success(
            function (response) {
                $scope.list=response;
            }
        )
    };
    //查询退货明细
    $scope.findAllOut=function () {
        inoutService.findAll(1).success(
            function (response) {
                $scope.list=response;
            }
        )
    };

    var now=new Date();
    nowDate=function () {
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

    $scope.da_list = {"data":nowDate(),"type":""};
    //分页查询
    $scope.findPage=function (page,size) {
        inoutService.findPage(page,size,$scope.da_list).success(
            function (response) {
                $scope.list=response.rows;//显示当前页的数据
                $scope.paginationConf.totalItems=response.total;
            }
        )
    }

});