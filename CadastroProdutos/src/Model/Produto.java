package Model;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String ncm;
    private String unidadeMedida;

    public Produto() {}

    public Produto(int id, String nome, double preco, String ncm, String unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.ncm = ncm;
        this.unidadeMedida = unidadeMedida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", ncm='" + ncm + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }


    public  void cadastrarProduto(int id, String nome, double preco, String ncm, String unidadeMedida) {
        Produto produto = new Produto(id, nome, preco, ncm, unidadeMedida);
    }
}
