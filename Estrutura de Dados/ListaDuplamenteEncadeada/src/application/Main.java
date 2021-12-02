package application;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lde = new ListaDuplamenteEncadeada<Integer>();
		
		lde.add(0);
		lde.add(1);
		lde.add(2);
		lde.add(3);
		lde.add(4);
		lde.add(5);
		lde.add(6);
		
		System.out.println(lde);
		lde.remove(3);
		System.out.println(lde);
		lde.add(23, 3);
		System.out.println(lde);
		System.out.println(lde.size());
		System.out.println(lde.get(18));
	}

}
