package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReportColumns {
    TERMINAL("Terminal"),
    BRANCH("Branch"),
    USERNAME("UserName"),
    CHARGE_NAME("Charge Name"),
    CONTACT_NUMBER("Contact Number");

    private final String displayName;
}
