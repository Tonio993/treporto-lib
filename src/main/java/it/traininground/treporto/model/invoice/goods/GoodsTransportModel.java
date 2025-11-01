package it.traininground.treporto.model.invoice.goods;

import it.traininground.treporto.enums.TransportType;
import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsTransportModel extends BaseModel {

    private TransportType type;

    private Long idGoods;

    private BigDecimal amount;

}
