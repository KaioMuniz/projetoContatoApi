package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Contato;
@Repository
public interface ContatosRepository extends JpaRepository<Contato, Integer> {

    
}
