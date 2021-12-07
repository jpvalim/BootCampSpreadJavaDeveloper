package application;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lsTemp = new ArrayList<>();
        Double sum = 0.0;
        for(int i = 1; i<=6; i++){
            System.out.print("Entre com a temperatura para o mês  " + i + " :");
            Double temp = sc.nextDouble();
            lsTemp.add(temp);
            sum += temp;
        }
        Double mediaTemperatura = sum / lsTemp.size();

        for(int i = 0; i < 6; i++){

            if(lsTemp.get(i) > mediaTemperatura){
                System.out.println(i + 1 + " - "+ valueOfMes(i + 1) + ": " + lsTemp.get(i));
            }
        }
        sc.close();
    }

    private static String valueOfMes(int i){
        switch (i){
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Inválido";
        }
    }
}
