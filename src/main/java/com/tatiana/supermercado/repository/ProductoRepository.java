package com.tatiana.supermercado.repository;

import com.tatiana.supermercado.model.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{
}
