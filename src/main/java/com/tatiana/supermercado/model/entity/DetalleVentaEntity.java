package com.tatiana.supermercado.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetalleVentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //venta
    @ManyToOne
    private VentaEntity venta;
    //producto
    @ManyToOne
    private ProductoEntity prod;
    private Integer cantProd;
    private Double precio;


}
