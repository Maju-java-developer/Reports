package org.example.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/**
 * Utility class for generating reports.
 */
public class ReportUtils {

    /**
     * Encodes an image located in the classpath to a Base64 string.
     *
     * This method searches for the image file "mrwlogo.gif" in the
     * "static" directory within the resources. If found, it reads
     * the image data and encodes it into a Base64 string, which can
     * be used in HTML image tags.
     *
     * @return A Base64 encoded string representation of the image.
     * @throws RuntimeException if the image file is not found or if there is an error reading the file.
     * @author Majid.Hussain
     * @since 26-09-2024
     */
    public static String encodeImageToBase64() {
        try (InputStream inputStream = ReportUtils.class.getClassLoader().getResourceAsStream("static/mrwlogo.gif")) {
            if (inputStream == null) {
                throw new RuntimeException("Image not found");
            }
            byte[] fileContent = inputStream.readAllBytes();
            return Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            throw new RuntimeException("Error reading image file", e);
        }
    }

    /**
     * Retrieves the content of the CSS file as a string.
     *
     * This method searches for the "style.css" file in the "static"
     * directory within the resources. If found, it reads the CSS
     * content and wraps it in a style tag for use in HTML documents.
     *
     * @return A string containing the CSS without wrapped in a <style> tag.
     * @throws RuntimeException if the style file is not found.
     * @author Majid.Hussain
     * @since 26-09-2024
     */
    public static String getStyle() {
        try {
            // Load the CSS file as a resource from the classpath
            InputStream inputStream = ReportUtils.class.getClassLoader().getResourceAsStream("static/style.css");
            if (inputStream == null) {
                throw new RuntimeException("Style file not found");
            }
            // Read the content of the CSS file
            return new String(inputStream.readAllBytes());
//            String styleClasses = new String(inputStream.readAllBytes());
//            return "<style type=\"text/css\">" + styleClasses + "</style>";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Generates the footer content for a daily cash summary report.
     *
     * <p>This method returns a formatted HTML string containing a summary message
     * and a table for signatures. The summary is printed in a <code>&lt;pre&gt;</code>
     * tag for preformatted text, ensuring that whitespace is preserved. The
     * signature table contains three positions: Deputy Director (Computer),
     * Head Cashier, and Deputy Director (ADMIN).</p>
     *
     * @return A string containing the HTML markup for the footer content.
     */
    public static String getFooterContent() {
        return """
                    <pre style="font-family: sans-serif;">
                    This daily cash summary is processed
                    and printed by Computer Section of
                    M.R Wing Karachi on the basis of
                    daily transactions through counters
                    </pre>
                    <table style="font-family: sans-serif; width: 100%; text-align: center;">
                        <tr style="height: 40px;">
                            <td>_______________________________</td>
                            <td>_______________________________</td>
                            <td>_______________________________</td>
                        </tr>
                        <tr>
                            <td>Deputy Director (Computer)</td>
                            <td>Head Cashier</td>
                            <td>Deputy Director (ADMIN)</td>
                        </tr>
                    </table>
                """;
    }
}
