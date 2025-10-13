package it.traininground.treporto.model.invoice.performance;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class ActivityModel extends BaseModel {

    private String name;

    private BigDecimal performanceFactor;

}
