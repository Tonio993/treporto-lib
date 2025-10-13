package it.traininground.treporto.model.port;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class PortModel extends BaseModel {

    private String name;

}
