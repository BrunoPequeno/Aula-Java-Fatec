package TreinandoLacos;

public class ex11 {
    public static void main(String[] args) {
        ex11Lacos();
    }

    public static void ex11Lacos() {
        int n1 = 1, n2 = 1;
        System.out.println(n1 + "\n" + n2);

        for (int i = 3; n1 + n2 < 1000; i = i + 1) {
            int numProximo = n1 + n2;
            System.out.println(numProximo);

            n1 = n2;
            n2 = numProximo;
        }
    }
}
