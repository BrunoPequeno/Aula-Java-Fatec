package TreinandoLacos;

import java.util.Scanner;

public class ex9 {
    public static void ex9Lacos(){
        Scanner sc = new Scanner(System.in);
        int nm = 1;
        boolean condicao = true;

        while (condicao) {
            if (nm != 0) {
                nm = sc.nextInt();

            } else {
                condicao = false;
                System.out.println("====================== - ======================");
                System.out.println("Zero digitado!\nFim do programa.");
                System.out.println("====================== - ======================");
            }
        }
    }
}
