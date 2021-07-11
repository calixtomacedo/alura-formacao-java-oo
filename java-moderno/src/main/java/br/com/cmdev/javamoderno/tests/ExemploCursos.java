package br.com.cmdev.javamoderno.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.cmdev.javamoderno.model.Curso;


/**
 * @author calixto.macedo - Calixto Macedo
 */
public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(c -> System.out.println("Cuso de: "+ c.getNome()+ " - "+ c.getAlunos()));
		
		System.out.println("\t");
		//Stream<Curso> filter = cursos.stream().filter(c -> c.getAlunos() >= 100);
		//filter.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("\t");
		cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);
	
		System.out.println("\t");
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
		System.out.println(sum);
		
		System.out.println("\t");
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getAlunos() +" - "+c.getNome()));
		
		System.out.println("\nFiltrados: ");
		cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList()).forEach(cc -> System.out.println(cc.getAlunos() +"  -  "+ cc.getNome()));
		
		System.out.println("\nMapas: ");
		cursos.stream().filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome +" tem "+ alunos + " alunos"));
		
		System.out.println("\nMédia dos alunos: ");
		OptionalDouble average = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		average.ifPresent(c -> System.out.println(c));
	}
}
