package application;

public class Pilha<T> {
	private No<T> refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	
	public No<T> pop() {
		if(!isEmpty()) {
			No<T> noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
			
		}
		return null;
	}
	
	public void push(No<T> novoNo) {
		No<T> refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No<T> top() {
		return refNoEntradaPilha;
	}
	
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true: false;
	}
	
	@Override
	public String toString() {
		String stringRet = "----------------------\n";
		stringRet+="Pilha\n";
		stringRet += "----------------------\n";
		
		No<T> noAuxiliar = refNoEntradaPilha;
		while(true) {
			if(noAuxiliar!=null) {
				stringRet += "[No {dado =" + noAuxiliar.getDado() +"}]\n";
				noAuxiliar=noAuxiliar.getRefNo();
			}
			else {
				break;
			}
		}
		stringRet += "======================\n";
		return stringRet;
	}
	
}
