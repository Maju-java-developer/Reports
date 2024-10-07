package org.example.report;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class ReportParameters {
    private Object reportRequestDto;
    private List<Map<String, Object>> reportData;
}
