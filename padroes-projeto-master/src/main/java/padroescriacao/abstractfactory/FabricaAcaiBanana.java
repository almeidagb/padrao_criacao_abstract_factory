package padroescriacao.abstractfactory;

public class FabricaAcaiBanana implements FabricaAbstrata {

    @Override
    public Acai createAcai() {
        return new AcaiBanana();
    }

    @Override
    public Acompanhamento createAcompanhamento() {
        return new AcompanhamentoLeitePo();
    }
}
