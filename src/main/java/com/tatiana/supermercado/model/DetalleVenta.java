package com.tatiana.supermercado.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //venta
    @ManyToOne
    private Venta venta;
    //producto
    @ManyToOne
    private Producto prod;
    private Integer cantProd;
    private Double precio;


}
