import java.util.Arrays;
import java.util.Scanner;

public class NotasDeAlunos {
    //Trabalhando com arrays e listas e usando stream para calcular a maior, menor e média das notas dos alunos
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de alunos da sua turma?");
        int quantidadeDeAlunos = sc.nextInt();
        double [] notas = new double[quantidadeDeAlunos];

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
        }

        System.out.println(Arrays.stream(notas).max().getAsDouble());
        System.out.println(Arrays.stream(notas).min().getAsDouble());
        System.out.println(Arrays.stream(notas).average().getAsDouble());

        sc.close();
    }
}
