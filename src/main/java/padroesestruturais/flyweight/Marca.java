package padroesestruturais.flyweight;

public class Marca {

    private String nome;
    private String uf;

    public Marca(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }
}
