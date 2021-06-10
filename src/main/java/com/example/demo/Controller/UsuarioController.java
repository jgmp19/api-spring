package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {

	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios(){
		System.out.println("\nAqui esta o repositorio: "+repository+"\n");
		return repository.findAll();
	}
	
	@PostMapping("/usuario")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
}