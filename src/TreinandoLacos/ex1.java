package TreinandoLacos;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        ex1Lacos();
    }
    public static void ex1Lacos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== - ==================");
        System.out.print("Digite o 1° valor: ");
        int nm1 = sc.nextInt();

        System.out.print("Digite o 2° valor: ");
        int nm2 = sc.nextInt();

        System.out.print("Digite o 3° valor: ");
        int nm3 = sc.nextInt();
        System.out.println("================== - ==================");

        int soma = nm1 + nm2 + nm3;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("================== - ==================");

    }
}
