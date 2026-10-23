package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Envio;

import jakarta.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvioRepository extends JpaRepository<Envio, Long> {
}
