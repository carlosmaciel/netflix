package com.netflix.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.exception.BusinessException;
import com.netflix.model.Secao;
import com.netflix.service.ISecaoService;

@RestController
@RequestMapping(value = "/api/secoes")
public class SecaoController {
	
	private final ISecaoService service;
	
	public SecaoController(ISecaoService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Secao>> findAll() {	
		
		try {
			return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
		} catch (BusinessException ex) {
			throw new BusinessException (ex.getMessage());
		}
		
	}
	
}
