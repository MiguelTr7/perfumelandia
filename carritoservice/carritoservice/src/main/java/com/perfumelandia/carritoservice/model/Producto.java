package com.perfumelandia.carritoservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Producto {
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
}


