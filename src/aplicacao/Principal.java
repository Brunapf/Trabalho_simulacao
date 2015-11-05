package aplicacao;

import java.math.BigDecimal;
import java.util.Scanner;

import dominio.Banda;
import dominio.Espetaculo;
import dominio.Participacao;

import servico.BandaServico;
import servico.EspetaculoServico;
import servico.ParticipacaoServico;
import servico.ServicoFactory;


public class Principal {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
				
		
		Espetaculo esp = null;
		Participacao part = null;

		
		
		BandaServico bandaServico = ServicoFactory.criarBandaServico();
		EspetaculoServico espetaculoServico = ServicoFactory.criarEspetaculoServico();
		ParticipacaoServico participacaoServico = ServicoFactory.criarParticipacaoServico();

		
		Banda band = new Banda(1,"Amazon",new BigDecimal(4.9));
		Banda band1 = new Banda(2,"Cameron",new BigDecimal(7.4));
		Banda band2 = new Banda(3,"Green",new BigDecimal(2.6));
		Banda band3 = new Banda(4,"Capit",new BigDecimal(99.0));
		Banda band4 = new Banda(5,"Carava",new BigDecimal(55.6));
		
		bandaServico.inserirAtualizar(band);
		bandaServico.inserirAtualizar(band1);
		bandaServico.inserirAtualizar(band2);
		bandaServico.inserirAtualizar(band3);
		bandaServico.inserirAtualizar(band4);
		
	
		
		
		System.out.println("Bandas inserida! ");
		
		
	}
}
