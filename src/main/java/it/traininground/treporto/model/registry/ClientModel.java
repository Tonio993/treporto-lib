package it.traininground.treporto.model.registry;

import lombok.Data;

@Data
public class ClientModel {

    private Long id;

    private String name;

    private String address;

    private String city;

    private String vat;

    private String uniqueCode;

}
