package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> getAllUsuarios(){
		return repository.findAll();
	}
	
	@PostMapping("/cliente")
	public Cliente saveUsuario(@RequestBody Cliente cliente) {
		System.out.println("\n AQUI ESTOU \n"+cliente.toString());
		return repository.save(cliente);
	}
}
