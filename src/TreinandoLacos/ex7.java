package TreinandoLacos;

import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        ex7Lacos();
    }
    public static  void ex7Lacos(){
        Scanner sc = new Scanner(System.in);
        double media = 0;
        ArrayList<Integer> valores = new ArrayList();

        System.out.println("==================== - ====================");
        System.out.print("Digite quntas notas deseja fazer a média: ");
        int qtd = sc.nextInt();
        System.out.println("==================== - ====================");

        for(int i = 1; i <= qtd; i++){
            System.out.print("Digite a " + i + "° nota: ");
            int nm = sc.nextInt();

            valores.add(nm);
        }

        for(int valor : valores){
            media = media + valor;
        }

        System.out.println("==================== - ====================");
        System.out.printf("A média dos valores digitados é: %.1f\n", (media / qtd));
        if(media > 7 ){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        System.out.println("==================== - ====================");

    }
}
