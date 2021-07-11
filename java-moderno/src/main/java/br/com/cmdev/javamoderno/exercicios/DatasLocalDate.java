package br.com.cmdev.javamoderno.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatasLocalDate {

	public static void main(String[] args) {
	
		LocalDate data = LocalDate.of(2099, 1, 25);
		System.out.println(data);
		
		LocalDate datas = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(datas);
		
		LocalDate agora = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo = Period.between(agora, dataFutura);
		System.out.println(periodo.getYears() + " anos, "+ periodo.getMonths() + " meses, "+  periodo.getDays()+" dias");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		System.out.println(dataFormatada);		
		
	}
}
