package it.traininground.treporto.model.invoice;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class InvoiceModel extends BaseModel {

    private String number;

    private LocalDate date;

    private Long idShip;

    private Long idClient;

    private Long idCompany;

    private List<InvoiceSectionModel> sectionList;

    private Long idPort;

    private Long idQuay;

}
