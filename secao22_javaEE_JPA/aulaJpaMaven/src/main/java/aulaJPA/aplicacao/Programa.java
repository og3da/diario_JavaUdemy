package aulaJPA.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulaJPA.dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		// gerenciadores do JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// iniciando a transação e gravando objetos no banco
		/*
		 * em.getTransaction().begin(); em.persist(p1); em.persist(p2); em.persist(p3);
		 * em.getTransaction().commit(); System.out.println("Pronto!"); // encerrando
		 * conexão em.close(); emf.close();
		 */

		// buscando dados e printando
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);

		// removendo
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("removido!");
	}
}
