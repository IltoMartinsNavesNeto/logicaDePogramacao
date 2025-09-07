package Main;

import Model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Object> produtos = new ArrayList<>();

        String resposta = sc.nextLine();
        while (resposta.equalsIgnoreCase("s")) {
            System.out.print("Informe o ID do produto:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Informe o nome do produto:");
            String nome = sc.nextLine();
            System.out.print("Informe o preço do produto:");
            double preco = sc.nextDouble();
            sc.nextLine();
            System.out.print("Informe o NCM do produto:");
            String ncm = sc.nextLine();
            System.out.print("Informe a unidade de medida do produto:");
            String unidadeMedida = sc.nextLine();

            Produto produto = new Produto(id, nome, preco, ncm, unidadeMedida);
            produtos.add(produto);

            System.out.println("Deseja cadastrar outro produto?s/n");
            resposta = sc.nextLine();
        }

        System.out.println("voce saiu do laço");

        sc.close(); 
    }

}
