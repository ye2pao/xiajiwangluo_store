app.controller("SublistController",function ($scope,SublistService) {

    $scope.shopSublist1={id:"",username:"",password:"",da:"0",enquiry:"0",statistics:"0",count:"1"};
    $scope.shopSublist2={id:"",username:"",password:"",da:"0",enquiry:"0",statistics:"0",count:"2"};
    $scope.shopSublist3={id:"",username:"",password:"",da:"0",enquiry:"0",statistics:"0",count:"3"};

    //查询子账号信息
    $scope.findAll1=function () {
        SublistService.findAll1(1).success(
            function (response) {
                $scope.shopSublist1=response;
            }
        )
    };
    //查询子账号信息
    $scope.findAll2=function () {
        SublistService.findAll2(2).success(
            function (response) {
                $scope.shopSublist2=response;
            }
        )
    };
    //查询子账号信息
    $scope.findAll3=function () {
        SublistService.findAll3(3).success(
            function (response) {
                $scope.shopSublist3=response;
            }
        )
    };

    //修改子账号信息
    $scope.update1=function () {
        SublistService.update($scope.shopSublist1).success(
            function (response) {
                alert(response.message);
            }
        )
    };
    //修改子账号信息
    $scope.update2=function () {
        SublistService.update($scope.shopSublist2).success(
            function (response) {
                alert(response.message);
            }
        )
    };
    //修改子账号信息
    $scope.update3=function () {
        SublistService.update($scope.shopSublist3).success(
            function (response) {
                alert(response.message);
            }
        )
    };

});