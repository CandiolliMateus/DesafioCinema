package principal;

public class Principal {

	public static void main(String[] args) {
		
		double precoIngresso = 11;
		double ingressoCriancas = 5.5;
		double ingressoEstudantes = 8;
		double ingressoIdosos = 6;
		
		boolean carteiraDeEstudante = true;
		String diaDaSemana = "outros";
		
		if(carteiraDeEstudante == true) {
			
			if(diaDaSemana.equals("segunda")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.1);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.1);
			} else if(diaDaSemana.equals("terça")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.15);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.15);
			} else if(diaDaSemana.equals("quarta")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.3);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.4);
			} else if(diaDaSemana.equals("quinta")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.3);
			} else if(diaDaSemana.equals("sexta")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.11);
			} else if(diaDaSemana.equals("feriado")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.35);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.5);
			} else {
				
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.05);
			}
			
		} else {
			
			if(diaDaSemana.equals("segunda")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.1);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.1);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.1);
			} else if(diaDaSemana.equals("terça")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.05);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.15);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.15);
			} else if(diaDaSemana.equals("quarta")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.5);
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.3);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.4);
			} else if(diaDaSemana.equals("quinta")) {
				
				ingressoEstudantes = ingressoEstudantes - (ingressoEstudantes * 0.3);
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.3);
			} else if(diaDaSemana.equals("sexta")) {
				
				ingressoCriancas = ingressoCriancas - (ingressoCriancas * 0.11);
			} else {
				
				ingressoIdosos = ingressoIdosos - (ingressoIdosos * 0.05);
			}
		}

		System.out.println("Dia da Semana: " + diaDaSemana);
		System.out.println("Ingresso normal: " + precoIngresso);
		System.out.println("Ingresso estudante: " + ingressoEstudantes);
		System.out.println("Ingresso criança: " + ingressoCriancas);
		System.out.println("Ingresso idoso: " + ingressoIdosos);
	}
}
