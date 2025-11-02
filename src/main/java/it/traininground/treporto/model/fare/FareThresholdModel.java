package it.traininground.treporto.model.fare;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper = true)
@Data
public class FareThresholdModel extends BaseModel {

    private Integer threshold;

    private BigDecimal price;

}
