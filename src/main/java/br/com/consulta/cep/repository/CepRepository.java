package br.com.consulta.cep.repository;

import br.com.consulta.cep.model.Cep;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends MongoRepository<Cep, String> {
    public Cep getByCep(String cep);
}
