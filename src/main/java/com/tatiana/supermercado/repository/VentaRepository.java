package com.tatiana.supermercado.repository;

import com.tatiana.supermercado.model.entity.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaEntity,Long> {
}
