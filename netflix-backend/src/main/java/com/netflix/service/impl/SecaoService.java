package com.netflix.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netflix.exception.BusinessException;
import com.netflix.model.Secao;
import com.netflix.repository.SecaoRepository;
import com.netflix.service.ISecaoService;

@Service
public class SecaoService implements ISecaoService {
	
	private SecaoRepository repository;

	public SecaoService(SecaoRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Secao> findAll() throws BusinessException{
		return repository.findAll();
	}
		
}
