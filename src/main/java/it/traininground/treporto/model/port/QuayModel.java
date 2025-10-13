package it.traininground.treporto.model.port;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuayModel extends BaseModel {

    private Long idPort;

    private String name;
}
