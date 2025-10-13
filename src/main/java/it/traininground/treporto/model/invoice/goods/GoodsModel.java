package it.traininground.treporto.model.invoice.goods;

import it.traininground.treporto.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsModel extends BaseModel {

    private String name;

}
