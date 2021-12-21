package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
		Queue<String> filaNomes = new LinkedList<>();
		filaNomes.add("Juliana");
		filaNomes.add("Pedro");
		filaNomes.add("Carlos");
		filaNomes.add("Larissa");
		filaNomes.add("João");
		
		for ( String s : filaNomes) {
			System.out.println(s);
		}
		
		System.out.println("Primeiro item da fila sem remover: " + filaNomes.peek());
		
		System.out.println(filaNomes);
		
		System.out.println("Primeiro item da fila removendo: " + filaNomes.poll());
		
		System.out.println(filaNomes);
		
		filaNomes.add("Daniel");
		
		System.out.println(filaNomes);
		
		System.out.println("Tamanho da fila: " + filaNomes.size());
		//filaNomes.clear();
		System.out.println("Fila vazia? " + filaNomes.isEmpty());
		
		System.out.println("Existe o nome Carlos na fila? " + filaNomes.contains("Carlos"));
		
		

	}

}
