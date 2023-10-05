package eventos;
public class Jogo extends Evento{
    String esporte, equipes;
    double percentualDescontoTorcedor;

    Jogo(String esporte, String equipes, double percentualDescontoTorcedor, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.esporte = esporte;
        this.equipes = equipes;
        this.percentualDescontoTorcedor = percentualDescontoTorcedor;
    }
    //  Por exemplo, se o desconto de torcedor for 15% e o ingresso foi meia entrada, com um preço cheio de R$100, o preço final fica 0.85 * 0.5 * 100 = R$42.50.
}
