package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Victor");
        usuario.setApellido("Reynoso");
        usuario.setEmail("Veko@hotmail.com");
        usuario.setTelefono("7584968278");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Carmelo");
        usuario2.setApellido("Aranda");
        usuario2.setEmail("Car_Aranda@hotmail.com");
        usuario2.setTelefono("2597846139");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Stefano");
        usuario3.setApellido("Tapia");
        usuario3.setEmail("Stefano_Tapia@hotmail.com");
        usuario3.setTelefono("1978462894");

        Usuario usuario4 = new Usuario();
        usuario4.setId(4L);
        usuario4.setNombre("Jero");
        usuario4.setApellido("Flores");
        usuario4.setEmail("Jero_God@hotmail.com");
        usuario4.setTelefono("7226487913");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
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
