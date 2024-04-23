package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");
        return usuario;
    }
}
