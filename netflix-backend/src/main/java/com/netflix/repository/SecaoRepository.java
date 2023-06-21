package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netflix.model.Secao;

@Repository
public interface SecaoRepository extends JpaRepository <Secao, Long>{

}
