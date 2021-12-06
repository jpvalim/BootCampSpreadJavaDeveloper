package application;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Carro carro1= new Carro("Ford");
        Carro carro2 = new Carro("Fiat");
        Carro carro3 = new Carro("Ferrari");

        /*STACK*/
        /*Stack<Carro> stackCarros = new Stack<>();
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Ford"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop().equals(stackCarros.pop()));
        System.out.println(stackCarros);

        System.out.println(stackCarros.capacity());*/

        /*QUEUE (Fila)*/
       /* Queue<Carro> filaCarros = new LinkedList<>();
        filaCarros.add(carro1);
        filaCarros.add(carro2);
        filaCarros.add(carro3);

        System.out.println(filaCarros);
        System.out.println(filaCarros.element());
        System.out.println(filaCarros);
        System.out.println(filaCarros.offer(new Carro("Renaut")));
        System.out.println(filaCarros);*/

        /*List (Lista)*/

        /*List<Carro> listCarros = new ArrayList<>();
        listCarros.addAll(Arrays.asList(carro1, carro2, carro3));

        System.out.println(listCarros.contains(carro1));
        System.out.println(listCarros);
        System.out.println(listCarros.indexOf(carro1));
        System.out.println(listCarros.get(10));*/

        /* Set (Conjunto)*/

        Set<Carro> setCarros=new HashSet<>();

        setCarros.add(carro1);
        setCarros.add(carro2);
        setCarros.add(carro3);

        System.out.println(setCarros);
        Set<Carro> treeSetCarro = new TreeSet<>();
        treeSetCarro.add(carro1);
        treeSetCarro.add(carro2);
        treeSetCarro.add(carro3);

        System.out.println(treeSetCarro);

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.0");
        aluno.put("Turma", "3a");

        System.out.println(aluno);
        System.out.println(aluno.keySet());

    }
}
