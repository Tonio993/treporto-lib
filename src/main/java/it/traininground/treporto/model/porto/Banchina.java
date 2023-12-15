package it.traininground.treporto.model.porto;

import it.traininground.treporto.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Banchina extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "porto_id")
    private Porto porto;

    @Column
    private String nome;
}
