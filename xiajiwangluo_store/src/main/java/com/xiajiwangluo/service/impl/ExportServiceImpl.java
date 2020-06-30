package com.xiajiwangluo.service.impl;


import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.Total;
import com.xiajiwangluo.util.DateUtils;
import com.xiajiwangluo.util.Test46;
import com.xiajiwangluo.service.ExportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExportServiceImpl implements ExportService {


    @Override
    public boolean ExportTotal(List<Total> totalList) {

        String sheetName = "统计利润明细";
        String titleName = "统计销售明细";
        String fileName = "统计明细";
        int[] columnWidth = { 10, 20, 30,10, 20, 30,10};
        String[] columnName = { "线上","线下","销售总和","成本","利润","日期","银行"};
        int columnNumber=7;
        String strings [][]= new String[totalList.size()][7];
        for (int i = 0; i < totalList.size(); i++) {
            Total total = totalList.get(i);
            strings[i][0]=total.getXianshang().toString();
            strings[i][1]=total.getXianxia().toString();
            strings[i][2]=total.getTotalsale().toString();
            strings[i][3]=total.getCost().toString();
            strings[i][4]=total.getProfit().toString();
            strings[i][5]= DateUtils.date2String(total.getDays(),"yyyy-MM-dd");
            strings[i][6]=total.getBank();
        }

        try {
            new Test46().ExportNoResponse(sheetName, titleName, fileName,columnNumber,columnWidth,columnName,strings,"利润统计表");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public boolean ExportDrawback(List<Inout> inoutList) {

        String sheetName = "统计退货信息";
        String titleName = "统计退货信息";
        String fileName = "统计退货信息";
        int[] columnWidth = {10,20,30};
        String[] columnName = { "日期","商品名","退货价格"};
        int columnNumber=7;
        String strings [][]= new String[inoutList.size()][3];
        for (int i = 0; i < inoutList.size(); i++) {
            Inout inout = inoutList.get(i);
            strings[i][0]= DateUtils.date2String(inout.getDays(),"yyyy-MM-dd");
            strings[i][1]= inout.getTitle();
            strings[i][2]= inout.getPrice().toString();

        }

        try {
            new Test46().ExportNoResponse(sheetName, titleName, fileName,columnNumber,columnWidth,columnName,strings,"统计退货信息");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
