package principal;

public class CalculaIngresso {
	
	double ingressoComDesconto;
	
	Ingresso ingresso = new Ingresso();
	
	public void calculoIngresso(boolean carteiraEstudante, int diaDaSemana, char tipoDeIngresso) {
		
		if(carteiraEstudante == ingresso.ingressoEstudantes.isCarteiraEstudante()) {
			
			System.out.println("Possui carteira de estudante");
			
			if(diaDaSemana == ingresso.diaDaSemana.getOutros()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					System.out.printf("Ingresso para crianças: R$ %.2f", ingresso.ingressoCriancas.getIngreco());
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					System.out.printf("Ingresso para estudante: R$ %.2f", ingresso.ingressoEstudantes.getIngresso());
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.05);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Fim de semana ou feriado.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getSegunda()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.1);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.35);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.1);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Segunda feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getTerca()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.15);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.35);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.15);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Terça feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getQuarta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.3);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.35);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.4);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Quarta feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getQuinta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					System.out.printf("Ingresso para crianças: R$ %.2f", ingresso.ingressoCriancas.getIngreco());
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.35);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.3);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Quinta feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getSexta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.11);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.35);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					System.out.printf("Ingresso para idosos: R$ %.2f", ingresso.ingressoIdosos.getIngresso());
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Sextta feira.");
			}
		} else {

			System.out.println("Não possui carteira de estudante");
			
			if(diaDaSemana == ingresso.diaDaSemana.getOutros()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					System.out.printf("Ingresso para crianças: R$ %.2f", ingresso.ingressoCriancas.getIngreco());
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					System.out.printf("Ingresso para estudante: R$ %.2f", ingresso.ingressoEstudantes.getIngresso());
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.05);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Fim de semana ou feriado.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getSegunda()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.1);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.1);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.1);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Segunda feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getTerca()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.15);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.05);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.15);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Terça feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getQuarta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.3);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.5);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.4);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Quarta feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getQuinta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					System.out.printf("Ingresso para crianças: R$ %.2f", ingresso.ingressoCriancas.getIngreco());
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoEstudantes.getIngresso() - (ingresso.ingressoEstudantes.getIngresso() * 0.3);
					System.out.printf("Ingresso para estudante: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					ingressoComDesconto = ingresso.ingressoIdosos.getIngresso() - (ingresso.ingressoIdosos.getIngresso() * 0.3);
					System.out.printf("Ingresso para idosos: R$ %.2f", ingressoComDesconto);
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Quinta feira.");
			} else if(diaDaSemana == ingresso.diaDaSemana.getSexta()) {
				
				if (tipoDeIngresso == ingresso.ingressoCriancas.getTipo()) {
					
					ingressoComDesconto = ingresso.ingressoCriancas.getIngreco() - (ingresso.ingressoCriancas.getIngreco() * 0.11);
					System.out.printf("Ingresso para crianças: R$ %.2f", ingressoComDesconto);
				} else if (tipoDeIngresso == ingresso.ingressoEstudantes.getTipo()) {
					
					System.out.printf("Ingresso para estudante: R$ %.2f", ingresso.ingressoEstudantes.getIngresso());
				} else if (tipoDeIngresso == ingresso.ingressoIdosos.getTipo()) {

					System.out.printf("Ingresso para idosos: R$ %.2f", ingresso.ingressoIdosos.getIngresso());
				} else {
					
					System.out.printf("Ingresso inteiro: R$ %.2f", ingresso.getingressoInteiro());
				}
				System.out.println("Sextta feira.");
			}
		}
	}	
}
