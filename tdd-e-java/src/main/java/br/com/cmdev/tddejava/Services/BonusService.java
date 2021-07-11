package br.com.cmdev.tddejava.Services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.cmdev.tddejava.model.Funcionario;

public class BonusService {
	
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			//valor = BigDecimal.ZERO;
			throw new IllegalArgumentException("Funcionarios com salário maior que R$10.000 não tem direito a receber bonus!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
