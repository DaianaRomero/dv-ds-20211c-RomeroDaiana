package ar.edu.davinci.dvds20211cRomeroDaiana.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20211cRomeroDaiana.domain.Prenda;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long> {

}

