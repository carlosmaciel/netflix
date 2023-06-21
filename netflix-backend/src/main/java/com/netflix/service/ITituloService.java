package com.netflix.service;

import java.util.List;

import com.netflix.exception.BusinessException;
import com.netflix.model.Titulo;

public interface ITituloService {

	List<Titulo> findAll() throws BusinessException;
	
}
