package ingressos;
import eventos.Evento;
public abstract class Ingresso {
    Evento evento;
    TipoIngresso tipo;

    Ingresso(Evento evento, TipoIngresso tipo){
        this.evento = evento;
        this.tipo = tipo;
    }

    public double getPreco(){
        double preco = 12.3;
        // retorna o preço a depender do tipo de ingresso.
        return preco;
    }
}
