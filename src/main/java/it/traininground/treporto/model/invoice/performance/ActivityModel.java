package it.traininground.treporto.model.invoice.performance;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActivityModel {

    private Long id;

    private String name;

    private BigDecimal performanceFactor;

}
