package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<String> listaNomes = new ArrayList();
		listaNomes.add("Juliana");
		listaNomes.add("Pedro");
		listaNomes.add("Carlos");
		listaNomes.add("Larissa");
		listaNomes.add("João");
		
		for (String  x : listaNomes) {
			System.out.println(x);
		}
		
		
		
		listaNomes.set(2, "Roberto");
		System.out.println(listaNomes);
		
		System.out.println("Nome da posição 1: "  + listaNomes.get(1));
		listaNomes.remove(4);
		System.out.println(listaNomes);
		
		System.out.println("Quantidade de itens da lista: " + listaNomes.size());
		
		System.out.println("Existe o nome Juliana? " + listaNomes.contains("Juliana"));
		
		List<String> listaNomes2 = new ArrayList();
		listaNomes2.add("Ismael");
		listaNomes2.add("Rodrigo");
		//incluir os dados da listaNomes2 na listaNomes
		
		Iterator<String> it = listaNomes2.iterator();
		while(it.hasNext()) {
			listaNomes.add(it.next());
		}
		
		System.out.println(listaNomes);
		
		Collections.sort(listaNomes);
		System.out.println(listaNomes);
		
		
		
	}

}
