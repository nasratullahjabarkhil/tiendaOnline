package com.example.TiendaOnline.controllers;

import com.example.TiendaOnline.entities.Cliente;
import com.example.TiendaOnline.repositories.ClientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientesController {
    @Autowired
    ClientesRepo clientesRepo;

    @PostMapping("/addClient")
    @ResponseBody
    public void addClient(@RequestBody Cliente cliente){
        clientesRepo.save(cliente);
    }

    @GetMapping("/getClients")
    @ResponseBody
    public List<Cliente> getClients(){
        return clientesRepo.findAll();
    }
}
