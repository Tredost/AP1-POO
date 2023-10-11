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
    public abstract double getPreco();

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

    @Override
    public String toString() {
        return this.getEvento() + "\n" +
            "Tipo do ingresso: " + this.getTipoIngresso();
    }
}
