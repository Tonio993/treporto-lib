package it.traininground.treporto.model.invoice;

import it.traininground.treporto.enums.SectionType;
import it.traininground.treporto.model.invoice.goods.GoodsTransportModel;
import it.traininground.treporto.model.invoice.performance.PerformanceModel;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class InvoiceSectionModel {

    private Long id;

    private SectionType type;

    private LocalDate date;

    private BigDecimal discount;

    private List<PerformanceModel> performanceList;

    private List<GoodsTransportModel> goodsTransportList;
}
