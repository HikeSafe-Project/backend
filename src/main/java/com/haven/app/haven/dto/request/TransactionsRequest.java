package com.haven.app.haven.dto.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class TransactionsRequest {
    private String UserId;
    private String startDate;
    private String endDate;
    private List<TicketRequest> tickets;

    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    @Builder
    public static class TicketRequest {
        private String hikerName;
        private String address;
        private String phoneNumber;
    }
}
