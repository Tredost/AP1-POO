package ingressos;

import eventos.Evento;

public class IngressoShow extends Ingresso{
    public enum Setor{pista,camarote}
    Setor setor;

    IngressoShow(Setor setor, Evento evento, TipoIngresso tipo){
        super(evento, tipo);
        this.setor = setor;
    }

    // getter
    public Setor getSetor(){
        return this.setor;
    }

    //setter
    public void setSetor(Setor setorAtualizado){
        this.setor = setorAtualizado;
    }
}
