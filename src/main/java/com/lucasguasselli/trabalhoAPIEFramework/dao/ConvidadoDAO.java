package com.lucasguasselli.trabalhoAPIEFramework.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasguasselli.trabalhoAPIEFramework.domain.Convidado;

public interface ConvidadoDAO extends JpaRepository<Convidado, Integer>{

}
