package eventos;
public class Exposicao extends Evento{
    int faixaEtaria, duracaoDias;
    boolean descontoSocial;
    
    Exposicao(int faixaEtaria, int duracaoDias,boolean descontoSocial, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.faixaEtaria = faixaEtaria;
        this.duracaoDias = duracaoDias;
        this.descontoSocial = descontoSocial;
    }
    // O ingresso deve possuir um novo atributo booleano, chamado descontoSocial. Caso esse valor seja true, o preço de venda do ingresso é zerado;
}
