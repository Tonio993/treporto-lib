package it.traininground.treporto.model.registry;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClientModel extends BaseModel {

    private String name;

    private String address;

    private String city;

    private String vat;

    private String uniqueCode;

}
