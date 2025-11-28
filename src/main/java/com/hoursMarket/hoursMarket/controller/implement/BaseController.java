package com.hoursMarket.hoursMarket.controller.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.controller.interfaces.IBaseController;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import com.hoursMarket.hoursMarket.service.interfaces.IBaseService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

public abstract class BaseController<T, DRequest, DResponse, ID> implements IBaseController<DRequest, ID>{

	@Autowired
	private IBaseService<T,DRequest, DResponse, ID> service;
	
	
	@GetMapping("")
    @Operation(summary = "Get all entities", description = "Retrieve a list of all entities")
    @JsonView(Views.Public.class)
	@Override
	public ResponseEntity<List<DResponse>> findAll(){
		return  ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
    @JsonView(Views.Internal.class)
    @Override
    public ResponseEntity<DResponse> findById(@PathVariable ID id) {
        return ResponseEntity.ok(service.findById(id));
    }

	@PostMapping("")
    @Override
    public ResponseEntity<DResponse> save(@RequestBody @Valid DRequest dRequest) {
        return ResponseEntity.ok(service.save(dRequest));
    }

	@DeleteMapping("{id}")
    @Override
    public ResponseEntity<String> deleteById(@PathVariable ID id) {
        return ResponseEntity.ok(service.deleteById(id));
    }
}
