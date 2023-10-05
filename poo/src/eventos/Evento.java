package eventos;

// VERIFICAR INTEGRIDADE DOS ATRIBUTOS E CLASSES

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
        if (tipo.equals(TipoIngresso.inteira) && quantidade <= ingressosInteira){
            return true;
        } else if (tipo.equals(TipoIngresso.meia) && quantidade <= ingressosInteira){
            return true;
        } else {
            return false;
        }
    }
    
    public double venderIngresso(TipoIngresso tipo, int quantidade){
        double valorTotal;
        // testar se da pra verificar o isIngressoDisponivel aqui dentro
        if (tipo.equals(TipoIngresso.inteira)){
            this.ingressosInteira -= quantidade;
            valorTotal = this.precoCheio*quantidade;
        } else {
            this.ingressosMeia -= quantidade;
            valorTotal = (this.precoCheio/2)*quantidade;}   
        return valorTotal;
    }

    // getters
    public String getNome(){
        return this.nome;
    }

    public String getData(){
        return this.data;
    }

    public String getLocal(){
        return this.local;
    }

    public int getIngressosMeia(){
        return this.ingressosMeia;
    }
    
    public int getIngressosInteira(){
        return this.ingressosInteira;
    }

    public double getPrecoCheio(){
        return this.precoCheio;
    }

    //setters
    public void setNome(String nomeAtualizado){
        this.nome = nomeAtualizado;
    }

    public void setData(String dataAtualizado){
        this.data = dataAtualizado;
    }

    public void setLocal(String localAtualizado){
        this.local = localAtualizado;
    }

    public void setIngressosInteira(int ingressosInteiraAtualizado){
        this.ingressosInteira = ingressosInteiraAtualizado;
    }

    public void setIngressosMeia(int ingressosMeiaAtualizado){
        this.ingressosMeia = ingressosMeiaAtualizado;
    }

    public void setPrecoCheio(double precoCheioAtualizado){
        this.precoCheio = precoCheioAtualizado;
    }
}

