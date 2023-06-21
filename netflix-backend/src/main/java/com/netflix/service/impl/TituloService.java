package com.netflix.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netflix.exception.BusinessException;
import com.netflix.model.Titulo;
import com.netflix.repository.TituloRepository;
import com.netflix.service.ITituloService;

@Service
public class TituloService implements ITituloService {
	
	private TituloRepository repository;

	public TituloService(TituloRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Titulo> findAll() throws BusinessException{
		return repository.findAll();
	}
		
}
