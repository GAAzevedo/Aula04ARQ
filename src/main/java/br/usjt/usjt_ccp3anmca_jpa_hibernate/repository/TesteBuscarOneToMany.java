package br.usjt.usjt_ccp3anmca_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Cidades;

public class TesteBuscarOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidades p = manager.find(Cidades.class, 1L);
		System.out.println(p.getPrevisao());
		manager.close();
		JPAUtil.close();
	}

}
