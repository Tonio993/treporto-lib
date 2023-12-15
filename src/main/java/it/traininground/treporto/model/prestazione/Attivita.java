package it.traininground.treporto.model.prestazione;

import it.traininground.treporto.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Attivita extends BaseEntity {

    @Column
    private String nome;

    @Column
    private BigDecimal fattorePrestazioni;

}
