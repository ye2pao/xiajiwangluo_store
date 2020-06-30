app.controller("depotController",function ($scope,$controller,depotService) {

    $controller("baseController",{$scope:$scope});

    $scope.da_list = {};
    $scope.findPage=function (page,size) {
        depotService.findPage(page,size,$scope.da_list).success(
            function (response) {
                $scope.list=response.rows;//显示当前页的数据
                $scope.paginationConf.totalItems=response.total;
            }
        )
    }
});