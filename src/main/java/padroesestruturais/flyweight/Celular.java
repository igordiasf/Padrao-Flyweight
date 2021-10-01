package padroesestruturais.flyweight;

public class Celular {

    private String nome;
    private Marca MarcaResidencia;

    public Celular(String nome, Marca MarcaResidencia) {
        this.nome = nome;
        this.MarcaResidencia = MarcaResidencia;
    }

    public String obterCelular() {
        return "Celular{" +
                "nome='" + this.nome + '\'' +
                ", Marca='" + MarcaResidencia.getNome() + '\'' +
                ", uf='" + MarcaResidencia.getUf() + '\'' +
                '}';
    }
}
