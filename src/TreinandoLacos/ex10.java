package TreinandoLacos;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        ex10Lacos();

    }
    public static void ex10Lacos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("====================== - ======================");
        System.out.print("Digite o valor que deseja calcular o fatorial: ");
        int fatorial = sc.nextInt();
        System.out.println("====================== - ======================");

        for (long i = 0; i <= fatorial; i++){
            System.out.println(i + "! = " + calcularFatorial(i));

        }
        System.out.println("====================== - ======================");
    }
    public static long calcularFatorial(long num){
        if (num <= 1){
            return (1);
        }else{
            return (num * calcularFatorial (num -1));
        }
    }
}