package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CelularTest {

    @Test
    void deveRetornarCelulares() {
        Loja loja = new Loja();
        loja.Cadastrar("moto g5", "Motorola", "SP");
        loja.Cadastrar("moto g6", "Motorola", "SP");
        loja.Cadastrar("moto g7", "Motorola", "SP");
        loja.Cadastrar("moto g8", "Motorola", "SP");

        List<String> saida = Arrays.asList(
                "Celular{nome='moto g5', Marca='Motorola', uf='SP'}",
                "Celular{nome='moto g6', Marca='Motorola', uf='SP'}",
                "Celular{nome='moto g7', Marca='Motorola', uf='SP'}",
                "Celular{nome='moto g8', Marca='Motorola', uf='SP'}");

        assertEquals(saida, loja.obterCelulars());
    }

    @Test
    void deveRetornarTotalMarcas() {
        Loja loja = new Loja();
        loja.Cadastrar("moto g5", "Motorola", "SP");
        loja.Cadastrar("moto g6", "Motorola", "SP");
        loja.Cadastrar("moto g7", "Motorola", "SP");
        loja.Cadastrar("moto g8", "Motorola", "SP");

        assertEquals(1, MarcaFactory.getTotalMarcas());
    }

}