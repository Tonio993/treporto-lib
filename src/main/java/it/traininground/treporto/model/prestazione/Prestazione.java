package it.traininground.treporto.model.prestazione;

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
public class Prestazione extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "sezione_id")
    private Sezione sezione;

    @ManyToOne
    @JoinColumn(name = "attivita_id")
    private Attivita attivita;

    @Column
    private Boolean mancata;

    @Column
    private String titolo;

    @Column
    private BigDecimal importo;
}
