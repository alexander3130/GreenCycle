package com.greenCycle.GreenCycle.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CertificateResp {
    private long id;
    private LocalDate dateTime;
    private RequestResp request;
}
