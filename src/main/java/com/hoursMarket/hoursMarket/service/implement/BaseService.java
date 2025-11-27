package com.hoursMarket.hoursMarket.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hoursMarket.hoursMarket.repository.IBaseRepository;
import com.hoursMarket.hoursMarket.service.interfaces.IBaseService;

public abstract class BaseService<T, DRequest, DResponse, ID> implements IBaseService<T, DRequest, DResponse, ID>{

	@Autowired
	private IBaseRepository<T, ID> repo;
	
	@Override
	public List<DResponse> findAll(){
		return this.repo.findAll().stream().map(this::modelToDto).toList();
	};
	
	@Override
	public DResponse findById(ID id) {
		return repo.findById(id).map(this::modelToDto).orElse(null);
	};
	
	@Override
	public DResponse save(DRequest dRequest) {
		T entity = dtoToModel(dRequest);
		repo.save(entity);
		return modelToDto(entity);
		
	};
	
	@Override
	public String deleteById(ID id) {
		repo.deleteById(id);
		return "Eliminado";
	};
}
