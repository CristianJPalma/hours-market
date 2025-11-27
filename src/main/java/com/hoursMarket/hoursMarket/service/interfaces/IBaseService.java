package com.hoursMarket.hoursMarket.service.interfaces;

import java.util.List;


public interface IBaseService<T, DRequest, DResponse, ID> {

	public List<DResponse> findAll();
	public DResponse findById(ID id);
	public DResponse save(DRequest dRequest);
	public String deleteById(ID id);
	
	
	T dtoToModel(DRequest dRequest); 
	DResponse modelToDto(T t);
}
