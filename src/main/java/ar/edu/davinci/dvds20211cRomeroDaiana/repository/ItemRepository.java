package ar.edu.davinci.dvds20211cRomeroDaiana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20211cRomeroDaiana.domain.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
