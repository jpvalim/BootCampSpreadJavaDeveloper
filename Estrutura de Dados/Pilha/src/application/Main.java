package application;

public class Main {

	public static void main(String[] args) {
		Pilha<Integer> minhaPilha=new Pilha<>();
		
		minhaPilha.push(new No<Integer>(1));
		minhaPilha.push(new No<Integer>(2));
		minhaPilha.push(new No<Integer>(3));
		minhaPilha.push(new No<Integer>(4));
		minhaPilha.push(new No<Integer>(5));
		System.out.println(minhaPilha);
		
		minhaPilha.pop();
		System.out.println(minhaPilha);

	}

}
