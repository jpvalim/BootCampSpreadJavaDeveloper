package application;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // Crie um conjunto contendo as cores do arco-íris.
        Set<String> arcoIris = new HashSet(Arrays.asList("Azul", "Vermelho", "Amarelo", "Verde", "Rosa", "Amarelo"));
        //A. Exiba todas as cores uma abaixo da outra
        System.out.println("Todas as cores do arco-iris: ");
        for (String x: arcoIris) System.out.println(x);
        //B. A quantidade de cores que o arco-íris tem
        System.out.println("Quantidade de cores: " + arcoIris.size());
        //C. Exiba as cores em ordem alfabética
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println("Cores em ordem alfabética: ");
        for (String x: arcoIris1) System.out.println(x);
        //D. Exiba as cores na ordem inversa da que foi informada

        List<String> lsArcoIris = new ArrayList<>(arcoIris1);
        Collections.reverse(lsArcoIris);
        System.out.println("Cores na ordem inversa: " + lsArcoIris);

        //E.Exiba todas as cores que começam com a letra "v"
        System.out.print("Cores que começam com a letra 'v': ");
        for (String x: arcoIris1) {
            if(x.startsWith("V")){
                System.out.print(x + " ,");
            }
        }

        System.out.println();
        //F. Remova todas as cores que não começam com a letra "V"

        System.out.println("Remova todas as cores que não começam com a letra 'V': " + lsArcoIris);
        //G. Limpe o conjunto


    }
}
