package it.traininground.treporto.model.fattura;

import it.traininground.treporto.enums.TipoSezione;
import it.traininground.treporto.model.BaseEntity;
import it.traininground.treporto.model.merce.Trasporto;
import it.traininground.treporto.model.prestazione.Prestazione;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Sezione extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "fattura_id")
    private Fattura fattura;

    @Column
    private TipoSezione tipo;

    @Column
    private LocalDate data;

    @Column
    private BigDecimal sconto;

    @OneToMany(mappedBy = "sezione")
    private List<Prestazione> prestazioni;

    @OneToMany(mappedBy = "sezione")
    private List<Trasporto> trasporti;
}
