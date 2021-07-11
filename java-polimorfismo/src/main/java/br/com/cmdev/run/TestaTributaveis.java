package br.com.cmdev.run;

import br.com.cmdev.model.CalculadorDeImposto;
import br.com.cmdev.model.ContaCorrente;
import br.com.cmdev.model.SeguroDeVida;

public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.calcula(contaCorrente);
		calc.calcula(seguroDeVida);
		
		System.out.println(calc.getTotalImposto());
	}

}
