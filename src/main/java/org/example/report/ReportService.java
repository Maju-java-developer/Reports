package org.example.report;

import java.io.ByteArrayOutputStream;
import java.util.Map;

public class ReportService {

    public ByteArrayOutputStream generateReport(String reportType, Map<String, Object> data) {
        ReportGenerator reportGenerator = switch (reportType) {
            case "DailyCashBook" -> new DailyCashReport(data);
            case "TCLReport" -> new TCLReport();
            case "SummaryReport" -> new SummaryReport();
            // Add other report types here
            default -> throw new IllegalArgumentException("Unknown report type");
        };

        return reportGenerator.printReport();
    }

}

