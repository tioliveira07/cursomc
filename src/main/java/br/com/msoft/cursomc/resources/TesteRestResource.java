package br.com.msoft.cursomc.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.msoft.cursomc.dao.CategoriaDAO;
import br.com.msoft.model.Categoria;

@RestController
@RequestMapping("/testerest")
public class TesteRestResource {
	
	@RequestMapping(path = "/listar" , method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		/* Categoria c1 = new Categoria(1,"Informática");
		Categoria c2 = new Categoria(2,"Papelaria");
		Categoria c3 = new Categoria(3,"Perfumaria");
		Categoria c4 = new Categoria(4,"Alimenticios");
		Categoria c5 = new Categoria(5,"Açougue");
		Categoria c6 = new Categoria(6,"Padaria"); */
		
		
		List<Categoria> categorias = new CategoriaDAO().getCategorias();
		/* categorias.add(c1);
		categorias.add(c2);
		categorias.add(c3);
		categorias.add(c4);
		categorias.add(c5);
		categorias.add(c6); */
		
		return categorias;
	}

}
