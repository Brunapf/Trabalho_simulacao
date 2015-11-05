package aplicacao;

import java.util.Scanner;

import dominio.Participacao;
import servico.BandaServico;
import servico.EspetaculoServico;
import servico.ParticipacaoServico;
import servico.ServicoFactory;

public class Principal3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		
		
		BandaServico bandaServico = ServicoFactory.criarBandaServico();
		EspetaculoServico espetaculoServico = ServicoFactory.criarEspetaculoServico();
		ParticipacaoServico participacaoServico = ServicoFactory.criarParticipacaoServico();

}
}
