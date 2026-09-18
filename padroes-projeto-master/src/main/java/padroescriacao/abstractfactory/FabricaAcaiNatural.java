package padroescriacao.abstractfactory;

public class FabricaAcaiNatural implements FabricaAbstrata {

    @Override
    public Acai createAcai() {
        return new AcaiNatural();
    }

    @Override
    public Acompanhamento createAcompanhamento() {
        return new AcompanhamentoNutella();
    }
}
