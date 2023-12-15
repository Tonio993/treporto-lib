package it.traininground.treporto.model.tariffa;

import it.traininground.treporto.enums.TipoNave;
import it.traininground.treporto.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Tariffa extends BaseEntity {

    @Column
    private LocalDate data;

    @Column
    private TipoNave tipoNave;

    @OneToMany(mappedBy = "tariffa")
    private List<Scaglione> scaglioni;

    @Column
    private Integer sogliaExtra;

    @Column
    private BigDecimal prezzoExtra;

}
