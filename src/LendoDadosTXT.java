import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoDadosTXT {
    public static void main(String[] args) {

        final String ARQ_ENTRADA = "C:/Users/Aluno/Documents/Aula/entrada.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ARQ_ENTRADA))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
