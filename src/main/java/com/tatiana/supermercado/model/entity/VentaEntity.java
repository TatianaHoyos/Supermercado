package com.tatiana.supermercado.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String estado;
    private Double total;

    @ManyToMany
    private SucursalEntity sucursal;

    @OneToMany(mappedBy = "venta")
    private List<DetalleVentaEntity> detalle = new ArrayList<>();
}
