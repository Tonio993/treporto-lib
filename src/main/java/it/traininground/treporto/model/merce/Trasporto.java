package it.traininground.treporto.model.merce;

import it.traininground.treporto.enums.TipoTrasporto;
import it.traininground.treporto.model.BaseEntity;
import it.traininground.treporto.model.fattura.Sezione;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Trasporto extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "sezione_id")
    private Sezione sezione;

    @Column
    private TipoTrasporto tipo;

    @ManyToOne
    @JoinColumn(name = "merce_id")
    private Merce merce;

    @Column
    private BigDecimal quantita;

}
