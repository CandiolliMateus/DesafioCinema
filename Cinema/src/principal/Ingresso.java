package principal;

public class Ingresso {
	
	private final double ingressoCrianca = 5.5;
	private final double ingressoEstudante = 8;
	private final double ingressoIdoso = 6;
	private final double ingressoInteiro = 35.00;
	private boolean carteiraDeEstudante = false;
	
	public Ingresso() {
		
	}
	
	public Ingresso(boolean carteiraDeEstudante) {
		
		this.carteiraDeEstudante = carteiraDeEstudante;	
	}

	public double getingressoInteiro() {
		return ingressoInteiro;
	}

	public double getIngressoCrianca() {
		return ingressoCrianca;
	}

	public double getIngressoEstudante() {
		return ingressoEstudante;
	}

	public double getIngressoIdoso() {
		return ingressoIdoso;
	}

	public boolean isCarteiraDeEstudante() {
		return carteiraDeEstudante;
	}

	public void setCarteiraDeEstudante(boolean carteiraDeEstudante) {
		this.carteiraDeEstudante = carteiraDeEstudante;
	}
}
