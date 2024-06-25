package com.example.concurso.Restaurante_BackEnd.Repository;

import com.example.concurso.Restaurante_BackEnd.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
