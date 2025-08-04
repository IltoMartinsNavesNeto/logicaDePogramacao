import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMediaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o número de notas: ");
            int numeroDeNotas = sc.nextInt();

            if (numeroDeNotas <= 0) {
                System.out.println("Erro: O número de notas deve ser maior que zero.");
                return;
            }

            double somaNotas = 0.0;

            for (int i = 1; i <= numeroDeNotas; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = sc.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / numeroDeNotas;
            System.out.println("A média das notas é: " + media);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira apenas números.");
        } finally {
            sc.close();
        }
    }
}
