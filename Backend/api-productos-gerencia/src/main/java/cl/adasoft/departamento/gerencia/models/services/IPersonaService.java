package cl.adasoft.departamento.gerencia.models.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cl.adasoft.departamento.gerencia.models.entity.Persona;

public interface IPersonaService {
	
	public Page<Persona> findAll(Pageable pageable);
	
	public Persona save(Persona persona);
	
	public void delete(Long id);	
	
	public Persona findByRut(Long codigo);
	
	public Optional<Persona> findById(Long id);

}
