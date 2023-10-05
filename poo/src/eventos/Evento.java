package eventos;
import ingressos.TipoIngresso;
public abstract class Evento {
    String nome, data, local;
    int ingressosInteira, ingressosMeia;
    double precoCheio;

    Evento(){}

    Evento(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.ingressosInteira = ingressosInteira;
        this.ingressosMeia = ingressosMeia;
        this.precoCheio = precoCheio;
    }

    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade){
        boolean disponivel = true;
        //  verifica se há ingressos disponíveis para o tipo e quantidade especificados
        return disponivel;
    }

    public double venderIngresso(TipoIngresso tipo){
        double valorTotal = 12.3;
        //  realiza a venda de ingressos do tipo e quantidade especificados e retorna o valor total da venda
        return valorTotal;
    }
}

// IMPLMENTAR GETTERS E SETTERS
// VERIFICAR INTEGRIDADE DOS ATRIBUTOS E CLASSES