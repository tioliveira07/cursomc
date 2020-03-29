package br.com.msoft.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testerest")
public class TesteRestResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest executado com sucesso!";
	}

}
