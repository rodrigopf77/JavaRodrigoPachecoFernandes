package com.rodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.model.Pessoa;

public interface Pessoas extends JpaRepository<Pessoa, Long> {

}
