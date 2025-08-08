package Main;

import Model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto(1, "Arroz", 20.50, "1006.10.00", "kg");

        System.out.println(produto.toString());
    }
}
