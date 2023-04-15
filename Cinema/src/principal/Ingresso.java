package principal;

public class Ingresso {
	
	private final char tipo = 'T';
	private final double ingressoInteiro = 35.00;
	
	IngressoCriancas ingressoCriancas = new IngressoCriancas();
	IngressoEstudantes ingressoEstudantes = new IngressoEstudantes();
	IngressoIdosos ingressoIdosos = new IngressoIdosos();
	DiaDaSemana diaDaSemana = new DiaDaSemana();
	
	// private final double ingressoCriancas = 5.50;
	// private final double ingressoEstudantes = 8.00;
	// private final double ingressoIdosos = 6.00;
	
	// CalculaIngresso calc = new CalculaIngresso();
	
	public Ingresso() {
		
	}

	public double getingressoInteiro() {
		return ingressoInteiro;
	}

	public char getTipo() {
		return tipo;
	}
}
