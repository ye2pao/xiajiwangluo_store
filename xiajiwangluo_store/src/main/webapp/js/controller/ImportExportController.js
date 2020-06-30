app.controller("ImportExportController", function ($scope, ImportExportService) {

    //批量导入
    $scope.importFileExport = function () {
        var data = $('#tb_table').bootstrapTable('getData');
        console.log(data);


        for (var i = data.length-1; i >=0 ; i--) {
            if(data[i].check){

            }else {
                data.splice(i,1);
            }
        }

        var json = JSON.stringify(data);
        //获取模板type
        var type = $('#identitys input:radio:checked').val();

        if(type==0){
            ImportExportService.importSupplier(json).success(
                function (response) {
                    alert(response);
                }
            )
        }
        if(type==1){
            ImportExportService.importDepot(json).success(
                function (response) {
                    alert(response);
                }
            )
        }


    };

    //批量导出
    $scope.ExportFileExport = function () {
        ImportExportService.ExportFileExport().success(
            function (response) {
                alert(response);
            }
        )
    };


});