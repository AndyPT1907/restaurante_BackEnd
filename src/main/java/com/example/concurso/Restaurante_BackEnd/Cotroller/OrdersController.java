package com.example.concurso.Restaurante_BackEnd.Cotroller;

import com.example.concurso.Restaurante_BackEnd.Entities.Orders;
import com.example.concurso.Restaurante_BackEnd.Repository.OrdersRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrdersController {
    @Autowired
    OrdersRepository ordersRepository;

    /////////////Creación de servicios////////////////////

    /////Get
    @GetMapping("/orders")
    public List<Orders> orders(){
        return ordersRepository.findAll();
    }
    ///////Get ID
    @GetMapping("/orders/{id}")
    public Optional<Orders> getOrdersById(@PathVariable int id){

        return ordersRepository.findById(id);
    }
    ///////Post
    @PostMapping("/orders")
    public Orders addOrders(@RequestBody Orders orders){
        return ordersRepository.save(orders);
    }
    //////
    @DeleteMapping("/orders/{id}")
    public ResponseEntity<Boolean> deleteOrders(@PathVariable int id){
        Optional <Orders> orders = ordersRepository.findById(id);
        ordersRepository.delete(orders.get());
        return ResponseEntity.ok(true);
    }

    ////Put

    @PutMapping("/orders/{id}")
    public  ResponseEntity <Orders> actualizarProductos(@PathVariable int id, @RequestBody Orders ordersData){
        Optional <Orders> opcionalOrders = ordersRepository.findById(id);

        Orders orders = opcionalOrders.get();
        //actualizar
        orders.setNOrder(ordersData.getNOrder());
        orders.setNameClient(ordersData.getNameClient());




        Orders productosGuardado = ordersRepository.save(orders);
        return ResponseEntity.ok(productosGuardado);

    }

}
