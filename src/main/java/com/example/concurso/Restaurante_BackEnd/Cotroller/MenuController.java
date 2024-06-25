package com.example.concurso.Restaurante_BackEnd.Cotroller;

import com.example.concurso.Restaurante_BackEnd.Entities.Menu;
import com.example.concurso.Restaurante_BackEnd.Entities.Orders;
import com.example.concurso.Restaurante_BackEnd.Repository.MenuRepository;
import com.example.concurso.Restaurante_BackEnd.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MenuController {
    @Autowired
    MenuRepository menuRepository;

    /////////////Creación de servicios////////////////////

    /////Get
    @GetMapping("/menu")
    public List<Menu> orders(){
        return menuRepository.findAll();
    }
    ///////Get ID
    @GetMapping("/menu/{id}")
    public Optional<Menu> getOrdersById(@PathVariable int id){

        return menuRepository.findById(id);
    }
    ///////Post
    @PostMapping("/menu")
    public Menu addOrders(@RequestBody Menu orders){
        return menuRepository.save(orders);
    }
    //////
    @DeleteMapping("/menu/{id}")
    public ResponseEntity<Boolean> deleteOrders(@PathVariable int id){
        Optional <Menu> orders = menuRepository.findById(id);
        menuRepository.delete(orders.get());
        return ResponseEntity.ok(true);
    }

    ////Put

}
