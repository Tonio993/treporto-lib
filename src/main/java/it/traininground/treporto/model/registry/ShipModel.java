package it.traininground.treporto.model.registry;

import it.traininground.treporto.enums.ShipType;
import lombok.Data;

@Data
public class ShipModel {

    private Long id;

    private String name;

    private String nationality;

    private Integer size;

    private ShipType type;
}


