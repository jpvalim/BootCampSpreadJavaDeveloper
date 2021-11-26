package application;

public class ListaEncadeada<T> {
	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		referenciaEntrada = null;
	}
	
	public T remove(int index) {
		
		No<T> noPivor = getNo(index);
		if (index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index -1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size()-1; i++) {
			noAuxiliar=noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	public int size() {
		int size=0;
		No<T> noAuxiliar = referenciaEntrada;
		
		while(noAuxiliar != null) {
			size ++;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return size;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}
		
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size(); i++) {
			strRetorno += "{No [conteudo =" + noAuxiliar.getConteudo() + "]} -->";
			noAuxiliar=noAuxiliar.getProximoNo();
		}
		
		strRetorno += "null";
		
		return strRetorno;
	}

	private No<T> getNo (int index){
		
		validarIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for (int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}

	private void validarIndice(int index) {
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
		}
	}
	
	
	
}
