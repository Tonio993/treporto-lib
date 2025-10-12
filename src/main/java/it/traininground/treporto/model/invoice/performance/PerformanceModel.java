package it.traininground.treporto.model.invoice.performance;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class PerformanceModel {

    private Long id;

    private Long idInvoiceSection;

    private Long idActivity;

    private Boolean missing;

    private String title;

    private BigDecimal price;
}
