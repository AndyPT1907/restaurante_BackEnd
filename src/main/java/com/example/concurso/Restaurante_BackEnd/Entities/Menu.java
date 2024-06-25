package com.example.concurso.Restaurante_BackEnd.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    private String nameMenu;
    private String type;
    private String description;
    private double price;
}
