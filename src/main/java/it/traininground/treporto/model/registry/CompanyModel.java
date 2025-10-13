package it.traininground.treporto.model.registry;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CompanyModel extends BaseModel {

    private String name;

}
