package it.traininground.treporto.model.registry;

import it.traininground.treporto.enums.ShipType;
import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ShipModel extends BaseModel {

    private String name;

    private String nationality;

    private Integer size;

    private ShipType type;
}


