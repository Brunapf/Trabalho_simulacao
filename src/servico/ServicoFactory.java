package servico;

import servico.impl.ParticipacaoServicoImpl;
import servico.impl.BandaServicoImpl;
import servico.impl.EspetaculoServicoImpl;



public class ServicoFactory {

	public static ParticipacaoServico criarParticipacaoServico() {
		return new ParticipacaoServicoImpl();
	}
	
	public static BandaServico criarBandaServico() {
		return new BandaServicoImpl();
	}
	
	public static EspetaculoServico criarEspetaculoServico() {
		return new EspetaculoServicoImpl();
	}
	
}