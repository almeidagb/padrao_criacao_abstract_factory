package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SorveteriaTest {

    @Test
    void deveEscolherAcaiNatural() {
        FabricaAbstrata fabrica = new FabricaAcaiNatural();
      Sorveteria sorveteria = new Sorveteria(fabrica);
        assertEquals("Açaí Natural",sorveteria.escolherSaborAcai());
    }

    @Test
    void deveEscolherAcaiBanana() {
        FabricaAbstrata fabrica = new FabricaAcaiBanana();
        Sorveteria sorveteria = new Sorveteria(fabrica);
        assertEquals("Açaí com Banana",sorveteria.escolherSaborAcai());
    }

    @Test
    void deveEscolherAcompanhamentoNutella() {
        FabricaAbstrata fabrica = new FabricaAcaiNatural();
        Sorveteria sorveteria = new Sorveteria(fabrica);
        assertEquals("Adicional de Nutella", sorveteria.escolherAcompanhamento());
    }

    @Test
    void deveEscolherAcompanhamentoLeitePo() {
        FabricaAbstrata fabrica = new FabricaAcaiBanana();
        Sorveteria sorveteria = new Sorveteria(fabrica);
        assertEquals("Adicional de  leite em pó", sorveteria.escolherAcompanhamento());
    }

}