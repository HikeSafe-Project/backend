package com.haven.app.haven.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MidtransCustomerDetails {
    private String first_name;
    private String email;
    private String phone;
}
