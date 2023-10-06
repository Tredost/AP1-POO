package eventos;

public class Exposicao extends Evento{
    int idadeMinima, duracaoDias;
    
    Exposicao(int idadeMinima, int duracaoDias, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.idadeMinima = idadeMinima;
        this.duracaoDias = duracaoDias;
    }

    //getters
    public int getIdadeMinima(){
        return this.idadeMinima;
    }

    public int getDuracaoDias(){
        return this.duracaoDias;
    }
    
    //setters
    public void setIdadeMinima(int idadeMinimaAtualizado){
        this.idadeMinima = idadeMinimaAtualizado;
    }

    public void setDuracaoDias(int duracaoDiasAtualizado){
        this.duracaoDias = duracaoDiasAtualizado;
    }

    @Override
    public String toString() {
        return "Evento " + super.toString() + "\n" +
            "Faixa etária mínima para participação: " + this.getIdadeMinima() + "\n" +
            "Duração do evento em dias : " + this.getDuracaoDias();
    }
}

