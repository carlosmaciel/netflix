package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netflix.model.Titulo;

@Repository
public interface TituloRepository extends JpaRepository <Titulo, Long>{

}
