package aplicacao;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dominio.Banda;
import dominio.Espetaculo;
import dominio.Espetaculo;

import dominio.Participacao;

import servico.BandaServico;
import servico.EspetaculoServico;
import servico.ParticipacaoServico;
import servico.ServicoFactory;


public class Principal2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int op;
		
		int cod;
				
		
		
		Participacao part = null;

		
		
		BandaServico bandaServico = ServicoFactory.criarBandaServico();
		EspetaculoServico espetaculoServico = ServicoFactory.criarEspetaculoServico();
		ParticipacaoServico participacaoServico = ServicoFactory.criarParticipacaoServico();

		
		do {
			System.out.println("--------- ESTACIONAMENTO EAKI -------------");
			System.out.println("1 - Cadastrar um novo espetáculo e as participações dele");
			System.out.println("2 - Mostrar os dados de um espetáculo (nome, preço total e participações)");
			System.out.println("Digite 3 - Sair.");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				
				List<Espetaculo> listEspetaculo = espetaculoServico.buscarTodos();
				
				System.out.println("Espetaculos existentes: ");
				for (Espetaculo x : listEspetaculo) {
					System.out.println(x);
				}
									
				System.out.println("Digite o nome do novo Espetaculo: ");
				String nome = sc.next();
					
								
				Espetaculo esp = new Espetaculo(null,nome);
												
					try {
						espetaculoServico.inserirAtualizar(esp);
						System.out.println("Espetaculo inserido! ");
					}
					catch (Exception e) {
						
						System.out.println("Falha ao inserir Espetaculo!");
				}
									
									
				break;
			case 2:
				
				List<Espetaculo> listEspetaculos = espetaculoServico.buscarTodos();
				
				System.out.println("Espetaculos existentes: ");
				for (Espetaculo x : listEspetaculos) {
					System.out.println(x);
				}
									
								
				List<Participacao> listParticipacao = participacaoServico.buscarTodos();
				
				System.out.println("Participacao : ");
				for (Participacao x : listParticipacao) {
					System.out.println(x);
				}
				break;

			

			
		
		
		
		
		
	}
			
}
		while (op != 3);
		}
}