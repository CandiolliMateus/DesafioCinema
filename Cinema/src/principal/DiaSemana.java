package principal;

public enum DiaSemana {
	
	Segunda {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca() - (new Ingresso().getIngressoCrianca() * 0.1);
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.1);
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso() - (new Ingresso().getIngressoIdoso() * 0.1);
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	},
	
	Terca {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca() - (new Ingresso().getIngressoCrianca() * 0.15);
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.05);
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso() - (new Ingresso().getIngressoIdoso() * 0.15);
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	},
	
	Quarta {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca() - (new Ingresso().getIngressoCrianca() * 0.3);
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.5);
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso() - (new Ingresso().getIngressoIdoso() * 0.4);
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	},
	
	Quinta {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca();
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.3);
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso() - (new Ingresso().getIngressoIdoso() * 0.3);
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	},
	
	Sexta {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca() - (new Ingresso().getIngressoCrianca() * 0.11);
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante();
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso();
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	},
	
	Outros {
		@Override
		public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
			
			double precoIngresso;
			
			if(tiposDeIngressos == TiposDeIngressos.Crianca) {
				
				precoIngresso = new Ingresso().getIngressoCrianca();
				return precoIngresso;
			} else if(tiposDeIngressos == TiposDeIngressos.Estudante) {
				
				if(ingresso.isCarteiraDeEstudante() == true) {
					
					precoIngresso = new Ingresso().getIngressoEstudante() - (new Ingresso().getIngressoEstudante() * 0.35);
					return precoIngresso;
				} else {
					
					precoIngresso = new Ingresso().getIngressoEstudante();
					return precoIngresso;
				}
			} else if(tiposDeIngressos == TiposDeIngressos.Idoso) {
				
				precoIngresso = new Ingresso().getIngressoIdoso() - (new Ingresso().getIngressoIdoso() * 0.05);
				return precoIngresso;
			} else {
				precoIngresso = new Ingresso().getingressoInteiro();
				return precoIngresso;
			}
		}
	};

	public double CalculoDiaSemana(TiposDeIngressos tiposDeIngressos, Ingresso ingresso) {
		// TODO Auto-generated method stub
		return 0;
	}
}
