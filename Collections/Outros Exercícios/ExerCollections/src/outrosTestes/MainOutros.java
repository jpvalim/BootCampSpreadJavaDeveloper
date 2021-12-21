package outrosTestes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainOutros {

	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<>();
		Estudante estudante1 = new Estudante(1, "Alex Green");
		Estudante estudante2 = new Estudante(2, "James Brown");
		Estudante estudante3 = new Estudante(3, "Maria Red");
		Estudante estudante4 = new Estudante(4, "Joe Ramone");
		estudantes.addAll(Arrays.asList(estudante4, estudante3, estudante2, estudante1));
		
		estudantes.stream()
			.sorted((e1, e2)-> e1.getName().compareTo(e2.getName()))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println("--------------------------");
		
		estudantes.stream()
		.sorted((e1, e2)-> e1.getId().compareTo(e2.getId()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
