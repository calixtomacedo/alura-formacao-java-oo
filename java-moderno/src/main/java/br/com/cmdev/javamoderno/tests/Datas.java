package br.com.cmdev.javamoderno.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author calixto.macedo - Calixto Macedo
 *
 */
public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate copaDoMundoQatar = LocalDate.of(2022, Month.NOVEMBER, 21);
		System.out.println(copaDoMundoQatar);
		
		int anos = copaDoMundoQatar.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period period = Period.between(hoje, copaDoMundoQatar);
		System.out.println(period.getYears() +" anos, "+ period.getMonths()+ " meses, "+ period.getDays() +" dias");
		
		LocalDate proximaCopaDoMundo = copaDoMundoQatar.plusYears(4);
		System.out.println(proximaCopaDoMundo);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximaCopaDoMundo.format(formatter));
		
		System.out.println("\t");
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatterTime));
		
		System.out.println("\t");
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		System.out.println("\t");
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));

		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		System.out.println("\t");
		copaDoMundoQatar.plusYears(4);
		System.out.println(copaDoMundoQatar);
		
		System.out.println("\t");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
	}
}
