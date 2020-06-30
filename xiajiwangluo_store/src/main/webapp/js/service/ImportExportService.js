//服务层
app.service('ImportExportService',function($http){
        //批量导入
        this.importSupplier=function(supplierList){
            return $http.post('../import/supplier.do',supplierList);
        };
        //批量导入
        this.importDepot=function(depot){
            return $http.post('../import/depot.do',depot);
        };
        //批量导出
        this.ExportFileExport=function(){
            return $http.post('../export/excel.do');
        };
});