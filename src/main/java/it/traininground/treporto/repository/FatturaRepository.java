package it.traininground.treporto.repository;

import it.traininground.treporto.model.fattura.Fattura;
import org.springframework.data.repository.CrudRepository;

public interface FatturaRepository extends CrudRepository<Fattura, Long> {
}
