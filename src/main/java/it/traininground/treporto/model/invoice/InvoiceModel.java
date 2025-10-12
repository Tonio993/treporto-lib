package it.traininground.treporto.model.invoice;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class InvoiceModel {

    private Long id;

    private String number;

    private LocalDate date;

    private Long idShip;

    private Long idClient;

    private Long idCompany;

    private List<InvoiceSectionModel> sectionList;

    private Long idPort;

    private Long idQuay;

}
