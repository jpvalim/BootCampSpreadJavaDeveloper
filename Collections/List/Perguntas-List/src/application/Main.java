package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        List<Character> lsRespostas = new ArrayList<>();
        int qtRespostasPositivas = 0;

        System.out.println("1. Telefonou para a vítima? ");
        lsRespostas.add(sc.next().charAt(0));
        System.out.println("2. Esteve no local do crime? ");
        lsRespostas.add(sc.next().charAt(0));
        System.out.println("3. Mora perto da vítima? ");
        lsRespostas.add(sc.next().charAt(0));
        System.out.println("5. Devia para a vítima? ");
        lsRespostas.add(sc.next().charAt(0));
        System.out.println("6. Já trabalhou com a vítima? ");
        lsRespostas.add(sc.next().charAt(0));

        if(lsRespostas.contains('s')){
            Iterator<Character> iterator = lsRespostas.iterator();
            while(iterator.hasNext()){
                if(iterator.next() == 's'){
                    qtRespostasPositivas++;
                }
            }
        }

        if(qtRespostasPositivas == 2){
            System.out.println("Suspeita");
        }
        else if(qtRespostasPositivas > 2 && qtRespostasPositivas < 5){
            System.out.println("Cúmplice");
        }
        else if(qtRespostasPositivas == 5){
            System.out.println("Assassina");
        }
        else{
            System.out.println("Inocente");
        }

        sc.close();

    }
}
