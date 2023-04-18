package principal;

public class CalculaIngresso {
	
	double ingressoAPagar;
	
	public double CalculandoIngresso(DiaSemana diaSemana, TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
				
		ingressoAPagar = diaSemana.CalculoDiaSemana(tiposDeIngressos, ingresso);
		return ingressoAPagar;
	}
}
