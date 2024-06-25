package com.example.concurso.Restaurante_BackEnd.Repository;

import com.example.concurso.Restaurante_BackEnd.Entities.Orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
