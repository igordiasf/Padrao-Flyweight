package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarcaFactory {
    private static Map<String, Marca> Marcas = new HashMap<>();

    public static Marca getMarca(String nome, String uf) {
        Marca Marca = Marcas.get(nome);
        if (Marca == null) {
            Marca = new Marca(nome, uf);
            Marcas.put(nome, Marca);
        }
        return Marca;
    }

    public static int getTotalMarcas() {
        return Marcas.size();
    }

}




