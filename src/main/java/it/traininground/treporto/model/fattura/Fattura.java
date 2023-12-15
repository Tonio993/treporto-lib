package it.traininground.treporto.model.fattura;

import it.traininground.treporto.model.BaseEntity;
import it.traininground.treporto.model.anagrafica.Agenzia;
import it.traininground.treporto.model.anagrafica.Cliente;
import it.traininground.treporto.model.anagrafica.Nave;
import it.traininground.treporto.model.porto.Banchina;
import it.traininground.treporto.model.porto.Porto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Fattura extends BaseEntity {

    @Column
    private String numero;

    @Column
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "nave_id")
    private Nave nave;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "agenzia_id")
    private Agenzia agenzia;

    @OneToMany(mappedBy = "fattura")
    private List<Sezione> sezioni;

    @ManyToOne
    @JoinColumn(name = "porto_id")
    private Porto porto;

    @ManyToOne
    @JoinColumn(name = "banchina_id")
    private Banchina banchina;

}
