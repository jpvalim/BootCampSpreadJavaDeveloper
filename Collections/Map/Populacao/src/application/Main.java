package application;

import java.text.NumberFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
            Map<String, Integer> populacaoNeBr = new HashMap<>(){{
                put("PE", 9616621);
                put("AL",3351543);
                put("CE", 9187103);
                put("RN", 3535265);
            }};
            NumberFormat br = NumberFormat.getInstance();
            /*Set<Map.Entry<String, Integer>> entries = populacaoNeBr.entrySet();
            for (Map.Entry<String, Integer> entry: entries) {
                System.out.println("Estado = " + entry.getKey() + " - População = " + br.format(entry.getValue()));
            }
        System.out.println("---------------------------------------------------------");
            populacaoNeBr.put("RN", 3534165);
        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println("Estado = " + entry.getKey() + " - População = " + br.format(entry.getValue()));
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(populacaoNeBr.get("PB"));
        populacaoNeBr.put("PB", 4039277); //Não precisa conferir se existe, porque o set não permite repetições.
        for(Map.Entry<String, Integer> entry: populacaoNeBr.entrySet()){
            System.out.println("Estado = " + entry.getKey() + " - População = " + br.format(entry.getValue()));
        }*/
       //Organizar por população

        /*Set <Map.Entry<String, Integer>> populacaoBr = new TreeSet<>(Comparator.comparing(estado->estado.getValue()));

        populacaoBr.addAll(populacaoNeBr.entrySet());
        System.out.println("---------------------------------------------------------");
        populacaoBr.stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));*/

        List<String> lsNumber = new ArrayList<>(Arrays.asList("1", "2", "5", "6", "7", "0"));

        System.out.println(lsNumber);
        List<Integer> lsNumberInt = lsNumber.stream().map(s->Integer.parseInt(s) + 1).collect(Collectors.toList());
        System.out.println(lsNumberInt);

        Collections.sort(lsNumber);


    }
}
