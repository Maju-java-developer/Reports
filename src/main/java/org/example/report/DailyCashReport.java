package org.example.report;

import org.example.enums.ReportColumns;
import org.example.util.ReportUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DailyCashReport implements ReportGenerator {
    private ReportParameters reportParameters;

    Map<String, Object> sideBarData;

    public DailyCashReport(Map<String, Object> sideBarData) {
        this.sideBarData = sideBarData;
    }

    @Override
    public String getReportTitle() {
        return "Daily Cash Summary";
    }

    @Override
    public Map<String, Object> getSideBarData() {
       return sideBarData;
    }

    @Override
    public List<String> tableHeading() {
        return List.of(ReportColumns.TERMINAL.getDisplayName(),
                ReportColumns.BRANCH.getDisplayName(),
                ReportColumns.USERNAME.getDisplayName(),
                ReportColumns.CHARGE_NAME.getDisplayName(),
                ReportColumns.CONTACT_NUMBER.getDisplayName());
    }

    @Override
    public List<Map<String, Object>> tableData() {
        List<Map<String, Object>> dataList = new ArrayList<>();

        dataList.add(new LinkedHashMap<>() {{
            put("Terminal", "MajidTerminal");
            put("Branch", "Civic Center");
            put("UserName", "Majid Hussain");
            put("Charge Name", "New Registration");
            put("Contact Number", "03313891044");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("Terminal", "ALI HASSAN");
            put("Branch", "Civic Center");
            put("UserName", "ALI HASSAN");
            put("Charge Name", "ETO APPROVAL");
            put("Contact Number", "03348909674");
        }});
        return dataList;
    }

    /**
     * Provides the footer content for the report.
     *
     * @return the HTML string representing the footer content.
     */
    @Override
    public String getFooterContent() {
        return ReportUtils.getFooterContent();
    }
}
