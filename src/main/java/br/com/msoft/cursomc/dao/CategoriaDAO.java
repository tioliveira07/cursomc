package br.com.msoft.cursomc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.msoft.model.Categoria;

public class CategoriaDAO {
	
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias() {
		
		List<Categoria> retorno = new ArrayList<>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		try {
			Query q = em.createQuery("select c from Categoria c");
			if (q.getResultList().size() > 0) {
				retorno = (List<Categoria>) q.getResultList();;
				System.out.println("Foram carregados " + String.valueOf(q.getResultList().size()) + " categorias!");
			} else {
				System.out.println("Tabela Categorias vazia");
			}
		} catch(Exception e) {
			System.out.println("Ocorreu um erro ao recuperar dados do Banco de Dados");
		}
		em.close();
		emf.close();
		return retorno;
	}

}
