package application;


public class ListaDuplamenteEncadeada <T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada(){
		primeiroNo=null;
		ultimoNo=null;
		tamanhoLista=0;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	public T get(int index) {
		if(index > size()) {
			throw new NullPointerException("A lista n?o possui o indice informado. Indice: " + index);
		}
		return getNo(index).getConteudo();
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}
		else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}
			else {
				ultimoNo = noAuxiliar;
			}
		}
		
		tamanhoLista--;
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		
		
		if(primeiroNo == null) {
			primeiroNo=novoNo;
		}
		
		if (ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo;
		
		tamanhoLista++;
	}
	
	public void add(T elemento, int index) {
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		NoDuplo<T> noAuxiliar = getNo(index);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoPrevio().setNoPrevio(novoNo);
		}
		else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo=novoNo;
		}
		if(index == 0) {
			primeiroNo=novoNo;
		}else
		{
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
	}
	
	
	@Override
	public String toString() {
		String stringRetorno = "ListaDuplamenteEncadeada [";
		NoDuplo<T> noAuxiliar = primeiroNo;
		
		for(int i=0; i<size();i++) {
			stringRetorno += "No " + i + "{Conte?do: " + noAuxiliar.getConteudo() + "} -->";
			noAuxiliar=noAuxiliar.getNoProximo();
		}
		
		stringRetorno += "null]";
		return stringRetorno;
	}
	
	private NoDuplo<T> getNo(int index){
		
			NoDuplo<T> noAuxiliar = primeiroNo;
			
			for(int i =0; (i<index) && (noAuxiliar != null); i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			return noAuxiliar;
		
		
	}

}
