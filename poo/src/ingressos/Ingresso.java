package ingressos;
import eventos.Evento;
public abstract class Ingresso {
    Evento evento;
    TipoIngresso tipo;

    Ingresso(){}
    Ingresso(Evento evento, TipoIngresso tipo){
        this.evento = evento;
        this.tipo = tipo;
    }

    // verificar getPreco
    public double getPreco(TipoIngresso tipo, Evento evento){
        double preco;
        if(tipo.equals(TipoIngresso.inteira)){
            preco = this.evento.getPrecoCheio();
        } else{
            preco = this.evento.getPrecoCheio() / 2;
        }
        return preco;
    }

    //getters
    public Evento getEvento(){
        return this.evento;
    }

    public TipoIngresso getTipoIngresso(){
        return this.tipo;
    }

    //setters
    public void setEvento(Evento eventoAtualizado){
        this.evento = eventoAtualizado;
    }

    public void setTipoIngresso(TipoIngresso tipoAtualizado){
        this.tipo = tipoAtualizado;
    }
}
