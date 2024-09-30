package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.example.report.ReportService;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("Terminal:", "Majid Hussain");
        data.put("From Date:", "20-09-2024");
        data.put("To Date:", "25-09-2024");

        ByteArrayOutputStream dailyCashBook = new ReportService().generateReport("DailyCashBook", data);
        ByteArrayOutputStream tclReport = new ReportService().generateReport("TCLReport", null);
        ByteArrayOutputStream summaryReport = new ReportService().generateReport("SummaryReport", null);

        saveFile(dailyCashBook, "report.pdf");
        saveFile(tclReport, "tclReport.pdf");
        saveFile(summaryReport, "summaryReport.pdf");

//        // Save the byte array to a file
//        try (FileOutputStream fos = new FileOutputStream("report.pdf")) {
//            fos.write(dailyCashBook.toByteArray());
//            System.out.println("PDF saved successfully to report.pdf");
//        } catch (IOException e) {
//            System.err.println("Error saving PDF: " + e.getMessage());
//        }
//
//        // Save the byte array to a file
//        try (FileOutputStream fos = new FileOutputStream("tclReport.pdf")) {
//            fos.write(tclReport.toByteArray());
//            System.out.println("PDF saved successfully to tclReport.pdf");
//        } catch (IOException e) {
//            System.err.println("Error saving PDF: " + e.getMessage());
//        }

    }
    public static void saveFile(ByteArrayOutputStream byteArrayOutputStream, String filePath) {
        // Save the byte array to a file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(byteArrayOutputStream.toByteArray());
            System.out.println("PDF saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving PDF: " + e.getMessage());
        }
    }
}