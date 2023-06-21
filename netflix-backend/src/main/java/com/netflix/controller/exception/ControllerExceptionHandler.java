package com.netflix.controller.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.netflix.exception.BusinessException;
import com.netflix.exception.StandardError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<StandardError> standardError(BusinessException e, HttpServletRequest request) {
		StandardError err = new StandardError();
	    err.setTimestamp(Instant.now());
	    err.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
	    err.setError("Erro interno no servidor");
	    err.setMessage(e.getMessage());
	    err.setPath(request.getRequestURI());
	    
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
	}
}
