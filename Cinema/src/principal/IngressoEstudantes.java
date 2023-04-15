package principal;

public class IngressoEstudantes {
	
	private final char tipo = 'E';
	private final double ingresso = 8;
	private boolean carteiraEstudante = true;
	
	public IngressoEstudantes() {
		
	}
	
	public char getTipo() {
		return tipo;
	}

	public double getIngresso() {
		return ingresso;
	}

	public boolean isCarteiraEstudante() {
		return carteiraEstudante;
	}

	public void setCarteiraEstudante(boolean carteiraEstudante) {
		this.carteiraEstudante = carteiraEstudante;
	}
}
