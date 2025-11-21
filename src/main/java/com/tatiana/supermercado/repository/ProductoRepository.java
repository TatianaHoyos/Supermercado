package com.tatiana.supermercado.repository;

import com.tatiana.supermercado.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
}
