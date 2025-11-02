package it.traininground.treporto.model.fare;

import it.traininground.treporto.enums.ShipType;
import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class FareModel extends BaseModel {

    private LocalDate date;

    private ShipType shipType;

    private List<FareThresholdModel> fareThresholdList;

    private Integer extraThreshold;

    private BigDecimal extraPrice;

}
