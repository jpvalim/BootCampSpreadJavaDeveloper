package application;

import model.Obj;

public class Main {

    public static void main(String[] args) {
	    ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<Obj>();
        minhaArvore.inserir(new Obj(1));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(10));

        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirInOrdem();


    }
}
