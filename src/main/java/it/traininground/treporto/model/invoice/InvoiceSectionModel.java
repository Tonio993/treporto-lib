package it.traininground.treporto.model.invoice;

import it.traininground.treporto.enums.SectionType;
import it.traininground.treporto.model.BaseModel;
import it.traininground.treporto.model.invoice.goods.GoodsTransportModel;
import it.traininground.treporto.model.invoice.performance.PerformanceModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class InvoiceSectionModel extends BaseModel {

    private SectionType type;

    private LocalDate date;

    private BigDecimal discount;

    private List<PerformanceModel> performanceList;

    private List<GoodsTransportModel> goodsTransportList;
}
