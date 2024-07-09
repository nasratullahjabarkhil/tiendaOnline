package com.example.TiendaOnline.repositories;

import com.example.TiendaOnline.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepo extends JpaRepository<Cliente, Integer> {


}
