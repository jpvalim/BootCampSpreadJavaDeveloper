package application;

public class No<T> {
	private T conteudo;
	private No<T> noProximo;
	
	
	public No() {
		this.noProximo = null;
	}
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.noProximo=null;
	}

	public No(T conteudo, No<T> noProximo) {
	
		this.conteudo = conteudo;
		this.noProximo = noProximo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(No<T> noProximo) {
		this.noProximo = noProximo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str = "No [conteudo=" + conteudo + "]";
		if (noProximo != null) {
			str += "--> " + noProximo.toString();
		}
		else {
			str += "-->null";
		}
		return str;
			
	}
}
