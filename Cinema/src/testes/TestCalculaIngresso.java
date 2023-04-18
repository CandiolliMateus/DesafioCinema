package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.CalculaIngresso;
import principal.DiaSemana;
import principal.Ingresso;
import principal.TiposDeIngressos;

class TestCalculaIngresso {
	
	@Test
	void NovoCalculandoIngressoEstudanteComCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.CalculandoIngresso(DiaSemana.Sexta, TiposDeIngressos.Estudante, new Ingresso(true));
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void NovoCalculandoIngressoEstudanteSemCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.CalculandoIngresso(DiaSemana.Sexta, TiposDeIngressos.Estudante, new Ingresso(false));
		
		assertEquals(8.0, resultado);
	}
}
