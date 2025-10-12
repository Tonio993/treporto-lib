package it.traininground.treporto.model.fare;

import it.traininground.treporto.enums.ShipType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class FareModel {

    private Long id;

    private LocalDate date;

    private ShipType shipType;

    private List<FareThresholdModel> fareThresholdList;

    private Integer extraFareThreshold;

    private BigDecimal extraPrice;

}
