package cl.adasoft.departamento.gerencia.models.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.adasoft.departamento.gerencia.models.dao.ProductoDao;
import cl.adasoft.departamento.gerencia.models.entity.Producto;

@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	private ProductoDao participantsDao;

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAll(Pageable pageable) {

		return participantsDao.findAll(pageable);
	}

	@Override
	@Transactional
	public Producto save(Producto participant) {

		return participantsDao.save(participant);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		participantsDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id) {

		return participantsDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findByNombre(String nombre, Pageable pageRequest) {

		return participantsDao.findByNombre(nombre, pageRequest);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findByCodigo(String codigo, Pageable pageRequest) {

		return participantsDao.findByCodigo(codigo, pageRequest);
	}

	@Override
	public Page<Producto> findByDescripcion(String descripcion, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return participantsDao.findByDescripcion(descripcion, pageRequest);
	}

	@Override
	public Page<Producto> findByPrecio(Double precio, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return participantsDao.findByPrecio(precio, pageRequest);
	}

	@Override
	public Page<Producto> findByStock(Integer cantidad, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return participantsDao.findByStock(cantidad, pageRequest);
	}

	@Override
	public Page<Producto> findByCategoria(String categoria, Pageable pageRequest) {
		// TODO Auto-generated method stub
		return participantsDao.findByCategoria(categoria, pageRequest);
	}

}