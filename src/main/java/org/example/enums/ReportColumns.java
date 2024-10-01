package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReportColumns {
    S_NO("S.No"),
    TERMINAL("Terminal"),
    BRANCH("Branch"),
    USERNAME("UserName"),
    CHARGE_NAME("Charge Name"),
    CONTACT_NUMBER("Contact Number"),
    TOTAL_AMOUNT("Total Amount"),
    TOTAL_VEHICLES("Total Vehicles");

    private final String displayName;
}
