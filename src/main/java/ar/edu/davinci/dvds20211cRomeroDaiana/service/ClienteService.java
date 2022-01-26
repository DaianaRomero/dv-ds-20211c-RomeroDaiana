package ar.edu.davinci.dvds20211cRomeroDaiana.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds20211cRomeroDaiana.domain.Cliente;
import ar.edu.davinci.dvds20211cRomeroDaiana.exception.BusinessException;

public interface ClienteService {
	
	Cliente save(Cliente cliente) throws BusinessException;
	Cliente update(Cliente cliente) throws BusinessException;
	public void delete(Cliente cliente);
	public void delete(Long id);
	
	public Cliente findById(Long id) throws BusinessException;


	public List<Cliente> listAll();
	public Page<Cliente> list(Pageable pageable);

	public long count();
}

