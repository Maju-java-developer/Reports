package org.example.report;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.example.util.ReportUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Interface for generating reports in PDF format.
 * Implementing classes should provide report-specific data and behavior.
 *
 * @author Majid.Hussain
 * @since 27-09-2024
 */
public interface ReportGenerator {
    /**
     * Gets the title of the report.
     *
     * @return the title of the report.
     */
    String getReportTitle();

    /**
     * Retrieves the sidebar data to be displayed in the report header.
     *
     * @return a map containing the sidebar data, where the key is the label
     * and the value is the corresponding content.
     */
    Map<String, Object> getSideBarData();

    /**
     * Provides the headings for the report table.
     *
     * @return a list of strings representing the table headings.
     */
    List<String> tableHeading();

    /**
     * Supplies the data to be displayed in the report table.
     *
     * @return a list of maps, where each map represents a row of data with key-value pairs for column data.
     */
    List<Map<String, Object>> tableData();

    /**
     * Provides the footer content for the report.
     *
     * @return the HTML string representing the footer content.
     */
    default String getFooterContent() {
        return "";
    }

    /**
     * Returns custom CSS styles to be applied to the elements of the component and use the class-name.
     * This method allows you to define your own CSS styles as a string, which will
     * be applied to the component when rendered. To effectively customize the
     * appearance, you can use various CSS rules and selectors.
     * use case
     * .box {
     *     backgroundColor: green;
     * } use class name on element to apply class on element where you want to apply it will apply directly when pdf render
     * @author Majid.Hussain
     * @since 01-10-2024
     * */
    default String getCustomStyleCss() {
        return "";
    }

    /**
     * Generates the header content for the report.
     *
     * @return the HTML string representing the header content.
     */
    default String getHeaderContent() {
        StringBuilder sidebar = new StringBuilder();
        sidebar.append("<img src=\"data:image/gif;base64, ").append(ReportUtils.encodeImageToBase64()).append(" \" alt=\"Base64 Image\"/>")
                .append("<div class=\"text-block\">").append("<div style=\"margin-top: 3px;\"><span style=\"font-weight: bold;\">Report Type: </span> ").append(getReportTitle()).append(" </div>");
        getSideBarData().forEach((key, value) ->
                sidebar.append("<div style=\"margin-top: 3px;\"><span style=\"font-weight: bold;\">")
                        .append(key)
                        .append("</span>")
                        .append(value)
                        .append("</div>")
        );

        sidebar.append("</div>");
        return sidebar.toString();
    }

    /**
     * Prints the report and returns it as a ByteArrayOutputStream.
     *
     * @return a ByteArrayOutputStream containing the PDF report.
     * @throws RuntimeException if an I/O error occurs during report generation.
     * @author Majid.Hussain
     * @since 27-09-2024
     */
    default ByteArrayOutputStream printReport() {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(generateHTMLToPDFContent(), null);
            builder.toStream(outputStream);
            builder.run();
            return outputStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructs the header HTML content for the report table.
     *
     * @return the HTML string representing the header row of the table.
     * @author Majid.Hussain
     * @since 27-09-2024
     */
    default String headerHTMLContent() {
        StringBuilder html = new StringBuilder();
        html.append("<tr style=\"background-color: #D9F3E4; color: #333; font-weight: bold; text-align: center;\">");
        for (String heading : tableHeading()) {
            html.append("<th style=\"border: 1px solid #ddd; padding: 8px;\">")
                    .append("<div>").append(heading).append("</div>")
                    .append("</th>");
        }
        html.append("</tr>");
        return html.toString();
    }

    /**
     * Generates the complete HTML content for the PDF report.
     *
     * @return the HTML string representing the entire report.
     * @author Majid.Hussain
     * @since 27-09-2024
     */
    default String generateHTMLToPDFContent() {
        return new StringBuilder().append("<html lang=\"en\">")
                .append("<head>").append("<title>").append(getReportTitle()).append("</title>")
                .append("<style type=\"text/css\">")
                .append(ReportUtils.getStyle())
                .append(Objects.requireNonNullElse(getCustomStyleCss(), ""))
                .append("</style>")
                .append("</head>")
                .append("<body class=\"f-ss fs\">")
                .append(getHeaderContent())
                .append("<div style=\"margin-bottom: 100px;\"></div>")
                .append(generateHTMLBodyContent())
                .append("<div>").append(getFooterContent()).append("</div>")
                .append("</body>")
                .append("</html>").toString();
    }

    /**
     * Generates the HTML content for the body of the report, including the table of data.
     *
     * @return the HTML string representing the body of the report.
     * @author Majid.Hussain
     * @since 27-09-2024
     */
    default String generateHTMLBodyContent() {
        StringBuilder html = new StringBuilder();

        html.append("<table style=\"width: 100%; border-collapse: collapse;\" class=\"f-ss\">")
                .append("<thead>")
                .append(headerHTMLContent())
                .append("</thead>")
                .append("<tbody>");

        if (tableData() != null) {
            for (Map<String, Object> record : tableData()) {
                html.append("<tr>");
                record.forEach((key, value) -> html.append("<td style=\"border: 1px solid #ddd; padding: 8px;\">")
                        .append(value)
                        .append("</td>"));
                html.append("</tr>");
            }
        }

        html.append("</tbody></table>");
        return html.toString();
    }

}

