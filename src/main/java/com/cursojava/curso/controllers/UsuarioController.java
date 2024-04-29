package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");
        return usuario;
    }

    @RequestMapping(value = "editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");
        return usuario;
    }

    @RequestMapping(value = "eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");
        return usuario;
    }
    @RequestMapping(value = "buscar")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");
        return usuario;
    }
}
