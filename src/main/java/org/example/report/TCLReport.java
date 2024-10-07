package org.example.report;

import org.example.util.ReportUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TCLReport implements ReportGenerator{
    @Override
    public String getReportTitle() {
        return "TCL Report";
    }

    @Override
    public Map<String, Object> getSideBarData() {
        return Map.of("Date:", LocalDate.now());
    }

    @Override
    public List<String> tableHeading() {
        return List.of("S.No", "Registration Date", "MDL No", "MDL Name", "No Of Set", "Set From", "Set To", "Last Lic Paid");
    }

    @Override
    public List<Map<String, Object>> tableData() {
        List<Map<String, Object>> dataList = new ArrayList<>();

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 1);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00001");
            put("MDL Name", "TOYOTA SOUTHERN MOTO");
            put("No Of Set", 10);
            put("Set From", "TCL-0001-A");
            put("Set To", "TCL-0001-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 2);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00002");
            put("MDL Name", "NASEER AUTOS");
            put("No Of Set", 10);
            put("Set From", "TCL-0002-A");
            put("Set To", "TCL-0002-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 3);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00003");
            put("MDL Name", "POLAD AND CO");
            put("No Of Set", 10);
            put("Set From", "TCL-0003-A");
            put("Set To", "TCL-0003-J");
            put("Last Lic Paid", "Jun 30, 2017");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 4);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00004");
            put("MDL Name", "SUZUKI MACCA MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0004-A");
            put("Set To", "TCL-0004-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 5);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00005");
            put("MDL Name", "MS SUZUKI THARPARKAR MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0005-A");
            put("Set To", "TCL-0005-J");
            put("Last Lic Paid", "Jun 30, 2017");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 6);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00006");
            put("MDL Name", "TOYOTA EASTERN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0006-A");
            put("Set To", "TCL-0006-J");
            put("Last Lic Paid", "Jun 30, 2023");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 7);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00007");
            put("MDL Name", "TOYOTA UNIVERSITY MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0007-A");
            put("Set To", "TCL-0007-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 8);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00008");
            put("MDL Name", "ALI BHAI MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0008-A");
            put("Set To", "TCL-0008-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 9);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00009");
            put("MDL Name", "TOYOTA CENTRAL MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0009-A");
            put("Set To", "TCL-0009-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 10);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00010");
            put("MDL Name", "MARGALLA MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0010-A");
            put("Set To", "TCL-0010-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 11);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00011");
            put("MDL Name", "RIAZ MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0011-A");
            put("Set To", "TCL-0011-J");
            put("Last Lic Paid", "Jun 30, 2021");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 12);
            put("Registration Date", "Dec 15, 2014");
            put("MDL No", "MDL-00012");
            put("MDL Name", "HINOPAK MOTORS LIMITED");
            put("No Of Set", 10);
            put("Set From", "TCL-0012-A");
            put("Set To", "TCL-0012-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 13);
            put("Registration Date", "Dec 15, 2014");
            put("MDL No", "MDL-00013");
            put("MDL Name", "TOYOTA SOCIETY MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0013-A");
            put("Set To", "TCL-0013-J");
            put("Last Lic Paid", "Jun 30, 2023");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 14);
            put("Registration Date", "Dec 17, 2014");
            put("MDL No", "MDL-00014");
            put("MDL Name", "TOYOTA WESTERN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0014-A");
            put("Set To", "TCL-0014-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 15);
            put("Registration Date", "Dec 17, 2014");
            put("MDL No", "MDL-00015");
            put("MDL Name", "CARACHI MOTOR COMPANY");
            put("No Of Set", 10);
            put("Set From", "TCL-0015-A");
            put("Set To", "TCL-0015-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 16);
            put("Registration Date", "Jan 1, 2015");
            put("MDL No", "MDL-00016");
            put("MDL Name", "JAN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0016-A");
            put("Set To", "TCL-0016-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});
        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 17);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00001");
            put("MDL Name", "TOYOTA SOUTHERN MOTO");
            put("No Of Set", 10);
            put("Set From", "TCL-0001-A");
            put("Set To", "TCL-0001-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 18);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00002");
            put("MDL Name", "NASEER AUTOS");
            put("No Of Set", 10);
            put("Set From", "TCL-0002-A");
            put("Set To", "TCL-0002-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 19);
            put("Registration Date", "Jun 13, 2014");
            put("MDL No", "MDL-00003");
            put("MDL Name", "POLAD AND CO");
            put("No Of Set", 10);
            put("Set From", "TCL-0003-A");
            put("Set To", "TCL-0003-J");
            put("Last Lic Paid", "Jun 30, 2017");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 20);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00004");
            put("MDL Name", "SUZUKI MACCA MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0004-A");
            put("Set To", "TCL-0004-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 21);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00005");
            put("MDL Name", "MS SUZUKI THARPARKAR MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0005-A");
            put("Set To", "TCL-0005-J");
            put("Last Lic Paid", "Jun 30, 2017");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 22);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00006");
            put("MDL Name", "TOYOTA EASTERN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0006-A");
            put("Set To", "TCL-0006-J");
            put("Last Lic Paid", "Jun 30, 2023");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 23);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00007");
            put("MDL Name", "TOYOTA UNIVERSITY MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0007-A");
            put("Set To", "TCL-0007-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 24);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00008");
            put("MDL Name", "ALI BHAI MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0008-A");
            put("Set To", "TCL-0008-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 25);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00009");
            put("MDL Name", "TOYOTA CENTRAL MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0009-A");
            put("Set To", "TCL-0009-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 26);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00010");
            put("MDL Name", "MARGALLA MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0010-A");
            put("Set To", "TCL-0010-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 27);
            put("Registration Date", "Jun 16, 2014");
            put("MDL No", "MDL-00011");
            put("MDL Name", "RIAZ MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0011-A");
            put("Set To", "TCL-0011-J");
            put("Last Lic Paid", "Jun 30, 2021");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 28);
            put("Registration Date", "Dec 15, 2014");
            put("MDL No", "MDL-00012");
            put("MDL Name", "HINOPAK MOTORS LIMITED");
            put("No Of Set", 10);
            put("Set From", "TCL-0012-A");
            put("Set To", "TCL-0012-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 29);
            put("Registration Date", "Dec 15, 2014");
            put("MDL No", "MDL-00013");
            put("MDL Name", "TOYOTA SOCIETY MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0013-A");
            put("Set To", "TCL-0013-J");
            put("Last Lic Paid", "Jun 30, 2023");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 30);
            put("Registration Date", "Dec 17, 2014");
            put("MDL No", "MDL-00014");
            put("MDL Name", "TOYOTA WESTERN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0014-A");
            put("Set To", "TCL-0014-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 31);
            put("Registration Date", "Dec 17, 2014");
            put("MDL No", "MDL-00015");
            put("MDL Name", "CARACHI MOTOR COMPANY");
            put("No Of Set", 10);
            put("Set From", "TCL-0015-A");
            put("Set To", "TCL-0015-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});
        // Adding records from S.No 32 to S.No 41
        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 32);
            put("Registration Date", "May 3, 2016");
            put("MDL No", "FAISAL MOTORS");
            put("MDL Name", "FAISAL MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0033-A");
            put("Set To", "TCL-0033-J");
            put("Last Lic Paid", "Jun 30, 2016");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 33);
            put("Registration Date", "May 3, 2016");
            put("MDL No", "HARIS MOTORS");
            put("MDL Name", "HARIS MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0034-A");
            put("Set To", "TCL-0034-J");
            put("Last Lic Paid", "Jun 30, 2016");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 34);
            put("Registration Date", "May 3, 2016");
            put("MDL No", "R-K MOTORS");
            put("MDL Name", "R-K MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0035-A");
            put("Set To", "TCL-0035-J");
            put("Last Lic Paid", "Jun 30, 2016");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 35);
            put("Registration Date", "May 11, 2016");
            put("MDL No", "SUZUKI MEHRAN MOTORS");
            put("MDL Name", "SUZUKI MEHRAN MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0036-A");
            put("Set To", "TCL-0036-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 36);
            put("Registration Date", "Jun 28, 2016");
            put("MDL No", "GHANI MOTORS");
            put("MDL Name", "GHANI MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0037-A");
            put("Set To", "TCL-0037-J");
            put("Last Lic Paid", "Jun 30, 2024");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 37);
            put("Registration Date", "Jul 29, 2016");
            put("MDL No", "AL HAJ FAW MOTORS PVT LTD");
            put("MDL Name", "AL HAJ FAW MOTORS PVT LTD");
            put("No Of Set", 10);
            put("Set From", "TCL-0038-A");
            put("Set To", "TCL-0038-J");
            put("Last Lic Paid", "Jun 30, 2020");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 38);
            put("Registration Date", "Aug 12, 2016");
            put("MDL No", "SALEEM MOTORS");
            put("MDL Name", "SALEEM MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0039-A");
            put("Set To", "TCL-0039-J");
            put("Last Lic Paid", "Jun 30, 2021");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 39);
            put("Registration Date", "Sep 1, 2016");
            put("MDL No", "MOTOR POINT");
            put("MDL Name", "MOTOR POINT");
            put("No Of Set", 10);
            put("Set From", "TCL-0040-A");
            put("Set To", "TCL-0040-J");
            put("Last Lic Paid", "Jun 30, 2021");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 40);
            put("Registration Date", "Dec 16, 2016");
            put("MDL No", "SOGO AUTOMOBILES");
            put("MDL Name", "SOGO AUTOMOBILES");
            put("No Of Set", 10);
            put("Set From", "TCL-0041-A");
            put("Set To", "TCL-0041-J");
            put("Last Lic Paid", "Jun 30, 2017");
        }});

        dataList.add(new LinkedHashMap<>() {{
            put("S.No", 41);
            put("Registration Date", "Jan 5, 2017");
            put("MDL No", "A1 MOTORS");
            put("MDL Name", "A1 MOTORS");
            put("No Of Set", 10);
            put("Set From", "TCL-0042-A");
            put("Set To", "TCL-0042-J");
            put("Last Lic Paid", "Jun 30, 2018");
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
