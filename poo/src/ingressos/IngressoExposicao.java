package ingressos;

import eventos.Evento;

public class IngressoExposicao extends Ingresso{
    boolean descontoSocial;

    IngressoExposicao(boolean descontoSocial, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.descontoSocial = descontoSocial;
    }

    //getter
    public boolean getDescontoSocial(){
        return this.descontoSocial;
    }

    //setter
    public void setDescontoSocial(boolean descontoSocialAtualizado){
        this.descontoSocial = descontoSocialAtualizado;
    }

    // VENDA OU GETPRECO?
    // if descontoSocial: venda return 0
}
