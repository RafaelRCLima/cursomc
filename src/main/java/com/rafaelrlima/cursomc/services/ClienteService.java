//package com.rafaelrlima.cursomc.services;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.rafaelrlima.cursomc.domain.Cliente;
//import com.rafaelrlima.cursomc.repositories.ClienteRepository;
//import com.rafaelrlima.cursomc.services.exceptions.ObjectNotFoundException;
//
//@Service
//public class ClienteService {
//	
//	@Autowired
//	private ClienteRepository repo;
//	
//	public Cliente buscar(Integer id) {
//		Optional<Cliente> obj = repo.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException(
//				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
//	}
//}
