package com.example.concurso.Restaurante_BackEnd.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)

    private  Integer id;
    private  Integer nOrder;
    private String nameClient;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    private  Integer priceTotal;
}
