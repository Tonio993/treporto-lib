package it.traininground.treporto.model.porto;

import it.traininground.treporto.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Porto extends BaseEntity {

    @Column
    private String nome;

    @OneToMany(mappedBy = "porto")
    private List<Banchina> banchine;

}
