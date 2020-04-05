package br.com.msoft.cursomc.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.msoft.cursomc.domain.Categoria;
import br.com.msoft.cursomc.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaREST {
	
	@Autowired(required = true)
	private CategoriaRepository repo;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		Optional<Categoria> categ = repo.findById(2); 
		return ResponseEntity.ok().body(categ);
	}

}
