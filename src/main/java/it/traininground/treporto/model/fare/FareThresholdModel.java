package it.traininground.treporto.model.fare;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class FareThresholdModel {

    private Long id;

    private Long idFare;

    private Integer threshold;

    private BigDecimal price;

}
