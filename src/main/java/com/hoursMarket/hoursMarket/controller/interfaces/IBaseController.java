package com.hoursMarket.hoursMarket.controller.interfaces;


import org.springframework.http.ResponseEntity;

public interface IBaseController<DRequest, ID>{

	public ResponseEntity<?> findAll();
	public ResponseEntity<?> findById(ID id);
	public ResponseEntity<?> save(DRequest dRequest);
	public ResponseEntity<?> deleteById(ID id);
}
