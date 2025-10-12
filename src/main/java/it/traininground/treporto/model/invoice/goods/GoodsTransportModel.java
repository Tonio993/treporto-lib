package it.traininground.treporto.model.invoice.goods;

import it.traininground.treporto.enums.TransportType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GoodsTransportModel {

    private Long id;

    private Long idInvoiceSection;

    private TransportType transportType;

    private GoodsModel goods;

    private BigDecimal amount;

}
