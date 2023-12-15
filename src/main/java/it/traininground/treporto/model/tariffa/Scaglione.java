package it.traininground.treporto.model.tariffa;

import it.traininground.treporto.model.BaseEntity;
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
public class Scaglione extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "tariffa_id")
    private Tariffa tariffa;

    @Column
    private Integer soglia;

    @Column
    private BigDecimal prezzo;

}
