package it.traininground.treporto.model.anagrafica;

import it.traininground.treporto.enums.TipoNave;
import it.traininground.treporto.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Nave extends BaseEntity {

    @Column
    private String nome;

    @Column
    private String nazionalita;

    @Column
    private Integer stazza;

    @Column
    private TipoNave tipo;
}


