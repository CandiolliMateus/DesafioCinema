package principal;

public enum TiposDeIngressos {
	
	Crianca {
		@Override
		public double Preco() {
			
			return new Ingresso().getIngressoCrianca();
		}
	},
	Estudante {
		@Override
		public double Preco() {

			return new Ingresso().getIngressoEstudante();
		}
	},
	Idoso {
		@Override
		public double Preco() {

			return new Ingresso().getIngressoIdoso();
		}
	},
	Normal {
		@Override
		public double Preco() {

			return new Ingresso().getingressoInteiro();
		}
	};
	
	public abstract double Preco();
}
