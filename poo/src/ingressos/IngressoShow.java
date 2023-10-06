package ingressos;

import eventos.Evento;

public class IngressoShow extends Ingresso{
    public enum Setor{pista,camarote}
    Setor setor;

    IngressoShow(Setor setor, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.setor = setor;
    }

    public double getPreco(){
        if(tipo.equals(TipoIngresso.inteira)){
            return this.getEvento().getPrecoCheio();
        }else{
            return this.getEvento().getPrecoCheio()/2;
        }
    }

    // getter
    public Setor getSetor(){
        return this.setor;
    }

    //setter
    public void setSetor(Setor setorAtualizado){
        this.setor = setorAtualizado;
    }

    @Override
    public String toString() {
        return "Ingresso " + super.toString() + "\n" +
            "Setor: " + this.getSetor();
    }
}
