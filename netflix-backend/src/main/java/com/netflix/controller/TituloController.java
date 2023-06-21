package com.netflix.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.exception.BusinessException;
import com.netflix.model.Titulo;
import com.netflix.service.ITituloService;

@RestController
@RequestMapping(value = "/api/titulos")
public class TituloController {
	
	private final ITituloService service;
	
	public TituloController(ITituloService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Titulo>> findAll() {	
		
		try {
			return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
		} catch (BusinessException ex) {
			throw new BusinessException (ex.getMessage());
		}
		
	}
	
}
