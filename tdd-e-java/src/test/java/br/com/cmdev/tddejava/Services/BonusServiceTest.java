package br.com.cmdev.tddejava.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.cmdev.tddejava.model.Funcionario;

public class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Calixto Macedo", LocalDate.now(), new BigDecimal("25000"));
		
		//BigDecimal bonus = service.calcularBonus(funcionario);
		//assertEquals(new BigDecimal("0.00"), bonus);

		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionario));
		
		/*
		try {
			service.calcularBonus(funcionario);
			fail("Não lançou nenhuma exception!");
		} catch (Exception e) {
			assertEquals("Funcionarios com salário maior que R$10.000 não tem direito a receber bonus!", e.getMessage());
		}
		*/
	}

	@Test
	void bonusDeveriaSerDezPorCentoDoSalario() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Calixto Macedo", LocalDate.now(), new BigDecimal("2500"));
		BigDecimal bonus = service.calcularBonus(funcionario);
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMil() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Calixto Macedo", LocalDate.now(), new BigDecimal("10000"));
		BigDecimal bonus = service.calcularBonus(funcionario);
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
}
