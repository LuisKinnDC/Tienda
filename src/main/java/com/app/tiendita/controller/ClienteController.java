package com.app.tiendita.controller;

import com.app.tiendita.entity.Cliente;
import com.app.tiendita.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente registrar(@RequestBody Cliente cliente){
        return clienteService.registrar(cliente);
    }
    @PutMapping
    public Cliente actualizar(@RequestBody Cliente cliente){
        return clienteService.actualizar(cliente);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Cliente cliente){
        clienteService.eliminar(cliente);
    }
    @GetMapping
    public List<Cliente> actulizar(){
        return clienteService.consultar();
    }
}
