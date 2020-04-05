package br.com.msoft.cursomc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msoft.cursomc.domain.Categoria;
import br.com.msoft.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired(required = true)
	private CategoriaRepository repo;

	public Categoria Buscar(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Categoria> Listar(){		
		List<Categoria> lista = new ArrayList<>();
		lista = repo.findAll();
		return lista;
	}
}
