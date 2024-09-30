package org.example.report;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SummaryReport implements ReportGenerator{
    /**
     * Gets the title of the report.
     *
     * @return the title of the report.
     */
    @Override
    public String getReportTitle() {
        return "Summary Report";
    }

    /**
     * Retrieves the sidebar data to be displayed in the report header.
     *
     * @return a map containing the sidebar data, where the key is the label
     * and the value is the corresponding content.
     */
    @Override
    public Map<String, Object> getSideBarData() {
        return Map.of("Date:", LocalDate.now());
    }

    /**
     * Provides the headings for the report table.
     *
     * @return a list of strings representing the table headings.
     */
    @Override
    public List<String> tableHeading() {
        return List.of("Terminal", "Branch", "UserName", "Charge Name", "Contact Number");
    }

    /**
     * Supplies the data to be displayed in the report table.
     *
     * @return a list of maps, where each map represents a row of data with key-value pairs for column data.
     */
    @Override
    public List<Map<String, Object>> tableData() {
        List<Map<String, Object>> dataList = new ArrayList<>();

        dataList.add(new LinkedHashMap<>() {{
            put("Terminal", "ALI HASSAN");
            put("Branch", "Civic Center");
            put("UserName", "ALI HASSAN");
            put("ChargeName", "ETO APPROVAL");
            put("ContactNumber", "03348909674");
        }});
        return dataList;
    }
}
