package ingressos;

import eventos.Evento;

public class IngressoExposicao extends Ingresso{
    boolean descontoSocial;

    IngressoExposicao(boolean descontoSocial, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.descontoSocial = descontoSocial;
    }

    public double getPreco(){
        if(descontoSocial){
            return 0.0;
        }else if (this.tipo.equals(TipoIngresso.inteira)){
            return this.evento.getPrecoCheio();
        }else{
            return this.evento.getPrecoCheio()/2;
        }
    }

    //getter
    public boolean getDescontoSocial(){
        return this.descontoSocial;
    }

    //setter
    public void setDescontoSocial(boolean descontoSocialAtualizado){
        this.descontoSocial = descontoSocialAtualizado;
    }

    @Override
    public String toString() {
        return "Ingresso " + super.toString() + "\n" +
            "Desconto Social: " + this.getDescontoSocial();
}
}