package org.example.report;

import org.example.enums.ReportColumns;

import java.time.LocalDate;
import java.util.*;

public class VerificationSummaryReport implements ReportGenerator{
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
        return List.of(
                ReportColumns.S_NO.getDisplayName(),
                ReportColumns.USERNAME.getDisplayName(),
                ReportColumns.TERMINAL.getDisplayName(),
                ReportColumns.TOTAL_VEHICLES.getDisplayName(),
                ReportColumns.TOTAL_AMOUNT.getDisplayName());
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
            put("S.No", 1);
            put("UserName", "Majid Hussain");
            put("Terminal", "TERM110");
            put("Total Vehicles", 10);
            put("Total Amount", 30000);
        }});
        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 2);
            put("UserName", "ALI.HASSAN");
            put("Terminal", "TERM115");
            put("Total Vehicles", 20);
            put("Total Amount", 5000);
        }});
        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 2);
            put("UserName", "ALI.HASSAN");
            put("Terminal", "TERM115");
            put("Total Vehicles", 20);
            put("Total Amount", 5000);
        }});

        return dataList;
    }

    /**
     * Generates the HTML content for the body of the report, including the table of data.
     *
     * @return the HTML string representing the body of the report.
     * @author Majid.Hussain
     * @since 27-09-2024
     */
    @Override
    public String generateHTMLBodyContent() {
        // Calculate current total vehicles
        long totalVehicles = tableData().stream()
                .mapToInt(map -> (Integer) map.getOrDefault("Total Vehicles", 0))
                .sum();

        long totalAmount = tableData().stream()
                .mapToInt(map -> (Integer) map.getOrDefault("Total Amount", 0))
                .sum();

        return ReportGenerator.super.generateHTMLBodyContent()
                + "<div class=\"info-text-container\">"
                + "<p class=\"info-text\"><span class=\"bold\">" + ReportColumns.TOTAL_VEHICLES.getDisplayName() + ": </span> " + totalVehicles + "</p>"
                + "<p class=\"info-text\"><span class=\"bold\">" + ReportColumns.TOTAL_AMOUNT.getDisplayName() + ": </span> " + totalAmount + "</p>"
                + "</div>";
    }

    /**
     * Returns custom CSS styles to be applied to the elements of the component and use the class-name.
     * This method allows you to define your own CSS styles as a string, which will
     * be applied to the component when rendered. To effectively customize the
     * appearance, you can use various CSS rules and selectors.
     * use case
     * .box {
     * backgroundColor: green;
     * } use class name on element to apply class on element where you want to apply it will apply directly when pdf render
     *
     * @author Majid.Hussain
     * @since 01-10-2024
     */
    @Override
    public String getCustomStyleCss() {
        return """
                .info-text-container {
                    float: right;
                    margin-top: 20px;
                    margin-left: 10px;
                }                   
                .info-text {
                    padding: 5px;
                    margin: 0;
                    font-size: 16px;
                }
                .info-text .bold {
                    font-weight: bold;
                }
        """;
    }
}
