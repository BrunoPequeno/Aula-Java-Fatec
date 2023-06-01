package TreinandoLacos;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        ex8Lacos();
    }
    public static void ex8Lacos(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int qtdNegativos = 0;

        System.out.println("==================== VALORES ====================");

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o valor " + i + ": ");
            int valor = sc.nextInt();

            valores.add(valor);
        }
        for (int valor : valores){
            if (valor < 0)
                qtdNegativos++;
        }

        System.out.println("====================== - ======================");
        System.out.println("Foram digitados " + qtdNegativos + " valores negativos");
        System.out.println("====================== - ======================");
    }
}
