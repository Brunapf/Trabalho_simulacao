package aplicacao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.jpa.EM;
import dominio.Banda;

public class Principal3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preco minimo");
		int minimo = sc.nextInt();
		
		System.out.println("Digite o preco maximo");
		int maximo = sc.nextInt();
		
		
		EntityManager em = EM.getLocalEm();
		em.getTransaction().begin();
		//String str = "Banda";
		int str1 = minimo;
		int str2 = maximo;
		
		String jpql = "select u from Banda u where u.preco between :str1 and :?str2";
		
		Query consulta = em.createQuery(jpql);
		consulta.setParameter("str1",2);
		consulta.setParameter("str2", 6);
		
		
		
		List<Banda> resultado = consulta.getResultList();
		
		for (Banda x : resultado) {
			System.out.println(x.getNome() + " - " + x.getPreco());
		}
		em.getTransaction().commit();
		EM.closeLocalEm();

}
}
