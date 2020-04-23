package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Cidades;
public class TesteBuscarPrevisaoComCidadeAssociada {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidades p = manager.find(Cidades.class, 1L);
		System.out.println(p.getPrevisao());
		System.out.println(p);
		manager.close();
		JPAUtil.close();
	}
}


