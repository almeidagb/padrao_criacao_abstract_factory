package padroescriacao.abstractfactory;

public class Sorveteria {

    private Acai acai; //precisar cria uma claasse com esse nomeatributo Diploma
    private Acompanhamento acompanhamento;

    public Sorveteria (FabricaAbstrata fabrica) {
        this.acai = fabrica.createAcai();
        this.acompanhamento = fabrica.createAcompanhamento();
    }

    public String escolherSaborAcai() {
        return this.acai.escolher();
    }

    public String escolherAcompanhamento() {
        return this.acompanhamento.escolher();
    }
}
