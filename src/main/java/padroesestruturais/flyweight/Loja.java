package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Celular> Celulares = new ArrayList<>();

    public void Cadastrar(String nomeCelular, String nomeMarca, String uf) {
        Marca Marca = MarcaFactory.getMarca(nomeMarca, uf);
        Celular Celular = new Celular(nomeCelular, Marca);
        Celulares.add(Celular);
    }

    public List<String> obterCelulars() {
        List<String> saida = new ArrayList<String>();
        for (Celular Celular : this.Celulares) {
            saida.add(Celular.obterCelular());
        }
        return saida;
    }


}
