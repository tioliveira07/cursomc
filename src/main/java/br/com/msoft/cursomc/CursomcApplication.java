package br.com.msoft.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.msoft.cursomc.service.CategoriaService") // Pacote de serviço
@EntityScan("br.com.msoft.cursomc.domain.Categoria") // Pacote de domínio-entidade
@EnableJpaRepositories("br.com.msoft.cursomc.repository.CategoriaRepository") // Pacote de repositório
public class CursomcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

}
