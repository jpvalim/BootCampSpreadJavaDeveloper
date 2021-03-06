package application;

public class ListaCircular<T> {
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		cabeca = null;
		cauda = null;
		tamanhoLista = 0;
	}
	
		
	public void add(T conteudo){
		No<T> novoNo = new No<>(conteudo);
		if(size() == 0) {
			cabeca = novoNo;
			cauda = novoNo= cabeca;
			cabeca.setNoProximo(cauda);
		}
		else {
			novoNo.setNoProximo(cauda);
			cabeca.setNoProximo(novoNo);
			cauda = novoNo;
		}
		tamanhoLista++;
		
	}
	
	public void remove(int index) {
		if(index >= size()) {
			throw new IndexOutOfBoundsException("O indice  " + index + "? maior que o tamanho da lista");
		}
		No<T> noAuxiliar = cauda;
		
		if(index == 0) {
			cauda = cauda.getNoProximo();
			cabeca.setNoProximo(cauda);
		}
		else if(index == 1){
			cauda.setNoProximo(cauda.getNoProximo());
		}
		else {
			for(int i=0 ; i< index -1 ; i++) {
				noAuxiliar=noAuxiliar.getNoProximo();
			}
		}
		noAuxiliar.setNoProximo((noAuxiliar.getNoProximo().getNoProximo()));
		tamanhoLista--;
		
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return tamanhoLista==0 ? true : false;
	}
	
	private No<T> getNo (int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("A lista est? vazia");
		}
		
		if(index ==0) {
			return this.cauda;
		}
		
		No<T> noAuxiliar = cauda;
		
		for(int i=0; i< index; i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
						
		return noAuxiliar;
	}


	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar=cauda;
		
		for(int i = 0; i< size(); i++) {
			strRetorno += "[No {Conteudo= " + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		strRetorno += !isEmpty()? "(Retorna ao inicio)" : "[]";
		
		return strRetorno;
	}
	
	
}
