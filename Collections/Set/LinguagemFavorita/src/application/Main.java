package application;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinguagemFavorita ling1 = new LinguagemFavorita("Java", 1991, "InteliJ" );
        LinguagemFavorita ling2 = new LinguagemFavorita("Java", 1991, "Eclipse" );
        LinguagemFavorita ling3 = new LinguagemFavorita("C", 1972, "Dev C++" );

        System.out.println("##################### - Imprimir na ordem de inserção - ######################");
        Set<LinguagemFavorita> cjLinguagens = new LinkedHashSet<>(Arrays.asList(ling1, ling2, ling3));
        for (LinguagemFavorita x: cjLinguagens) {
            System.out.println("Nome:" + x.getNome() + " Ano de criação: " + x.getAnoDeCriacao() + " IDE: " + x.getIde());
        }

        System.out.println("##################### - Imprimir na ordem natural - Nome - #######################");

        Set<LinguagemFavorita> cjLinguagens2 = new TreeSet<>(cjLinguagens);
        for (LinguagemFavorita x: cjLinguagens2) {
            System.out.println("Nome:" + x.getNome() + " Ano de criação: " + x.getAnoDeCriacao() + " IDE: " + x.getIde());
        }
        System.out.println("##################### - Imprimir na ordem nome, ano de criacao, IDE - #######################");
        Set<LinguagemFavorita> cjLinguagens3 = new TreeSet<>(new ComparatorNomeAnoIde());
        cjLinguagens3.add(ling1);
        cjLinguagens3.add(ling2);
        cjLinguagens3.add(ling3);
        for (LinguagemFavorita x: cjLinguagens3) {
            System.out.println("Nome:" + x.getNome() + " Ano de criação: " + x.getAnoDeCriacao() + " IDE: " + x.getIde());
        }
   }
}
