package it.traininground.treporto.model.invoice.performance;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper = true)
@Data
public class PerformanceModel extends BaseModel {

    private Long idActivity;

    private Boolean missing;

    private String title;

    private BigDecimal price;
}
