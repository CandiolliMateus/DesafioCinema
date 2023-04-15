package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.CalculaIngresso;

class TestCalculaIngresso {
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 1, 'C');
		
		assertEquals(5.5, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 2, 'C');
		
		assertEquals(4.95, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 3, 'C');
		
		assertEquals(4.675, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 4, 'C');
		
		assertEquals(3.85, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 5, 'C');
		
		assertEquals(5.5, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasComCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 6, 'C');
		
		assertEquals(4.895, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 1, 'C');
		
		assertEquals(5.5, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 2, 'C');
		
		assertEquals(4.95, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 3, 'C');
		
		assertEquals(4.675, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 4, 'C');
		
		assertEquals(3.85, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 5, 'C');
		
		assertEquals(5.5, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaCriancasSemCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 6, 'C');
		
		assertEquals(4.895, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 1, 'E');
		
		assertEquals(8.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 2, 'E');
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 3, 'E');
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 4, 'E');
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 5, 'E');
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteComCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 6, 'E');
		
		assertEquals(5.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 1, 'E');
		
		assertEquals(8.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 2, 'E');
		
		assertEquals(7.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 3, 'E');
		
		assertEquals(7.6, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 4, 'E');
		
		assertEquals(4.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 5, 'E');
		
		assertEquals(5.6, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaEstudanteSemCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 6, 'E');
		
		assertEquals(8.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 1, 'I');
		
		assertEquals(5.7, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 2, 'I');
		
		assertEquals(5.4, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 3, 'I');
		
		assertEquals(5.1, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 4, 'I');
		
		assertEquals(3.5999999999999996, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 5, 'I');
		
		assertEquals(4.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososComCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 6, 'I');
		
		assertEquals(6.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 1, 'I');
		
		assertEquals(5.7, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 2, 'I');
		
		assertEquals(5.4, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 3, 'I');
		
		assertEquals(5.1, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 4, 'I');
		
		assertEquals(3.5999999999999996, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 5, 'I');
		
		assertEquals(4.2, resultado);
	}
	
	@Test
	void CalculoDoIngressoParaIdososSemCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 6, 'I');
		
		assertEquals(6.0, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 1, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 2, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 3, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 4, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 5, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoComCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(true, 6, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmFimDeSemanaEFeriados() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 1, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmSegunda() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 2, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmTerca() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 3, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmQuarta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 4, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmQuinta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 5, 'T');
		
		assertEquals(35, resultado);
	}
	
	@Test
	void CalculoDoIngressoCompletoSemCarteiraDeEstudanteEmSexta() {
		
		CalculaIngresso calc = new CalculaIngresso();
		double resultado = calc.calculoIngresso(false, 6, 'T');
		
		assertEquals(35, resultado);
	}	
}
