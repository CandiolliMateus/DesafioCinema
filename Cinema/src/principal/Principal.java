package principal;

public class Principal {

	public static void main(String[] args) {
		
		CalculaIngresso calculo = new CalculaIngresso();		
		System.out.println(calculo.CalculandoIngresso(DiaSemana.Sexta, TiposDeIngressos.Estudante, new Ingresso(false)));
	}
}
