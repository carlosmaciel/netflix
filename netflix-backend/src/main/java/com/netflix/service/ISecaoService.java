package com.netflix.service;

import java.util.List;

import com.netflix.exception.BusinessException;
import com.netflix.model.Secao;

public interface ISecaoService {

	List<Secao> findAll() throws BusinessException;
	
}
