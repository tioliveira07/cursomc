package br.com.msoft.cursomc.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.msoft.cursomc.domain.Categoria;
import br.com.msoft.cursomc.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaREST {
	
	private CategoriaService service = new CategoriaService();
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Categoria> lista = service.Listar();
		return ResponseEntity.ok().body(lista);
	}

}
