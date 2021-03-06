package application;

public class Fila<T> {
	
	private No<T> refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}

	
	public T dequeue(){
		
		No<T> primeiroNo = refNoEntradaFila;
		No<T> noAuxiliar = refNoEntradaFila;
		if(!isEmpty()) {
			while(primeiroNo.getRefNo() != null) {
				noAuxiliar=primeiroNo;
				primeiroNo=primeiroNo.getRefNo();
			}
			noAuxiliar.setRefNo(null);
			return primeiroNo.getDado();
		}
		else {
			return null;
		}
}
	
	
	public T first(){
			
			No<T> primeiroNo = refNoEntradaFila;
			if(!isEmpty()) {
				while(primeiroNo.getRefNo() != null) {
					primeiroNo=primeiroNo.getRefNo();
				}
				return primeiroNo.getDado();
			}
			else {
				return null;
			}
	}
	
	public void enqueue(T obj) {
		No<T> novoNo= new No<T>(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}


	@Override
	public String toString() {
		String stringRet = "";
		
		No<T> noAuxiliar = refNoEntradaFila;
		if(refNoEntradaFila != null) {
			while(true) {
				stringRet += "[No{Objeto =" + noAuxiliar.getDado() + "}]--->";
				
				if(noAuxiliar.getRefNo()!=null) {
					noAuxiliar=noAuxiliar.getRefNo();
				}
				else {
					stringRet+= "null";
					break;
				}
				
			}
				
		}
		else {
			stringRet = "null\n";
		}
						
		return stringRet;
	}
	
	
	
}
