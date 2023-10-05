package eventos;
public class Jogo extends Evento{
    String esporte, equipes;

    Jogo(String esporte, String equipes, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.esporte = esporte;
        this.equipes = equipes;
    }
    
    //getters
    public String getEsporte(){
        return this.esporte;
    }

    public String getEquipes(){
        return this.equipes;
    }

    //setters
    public void setEsporte(String esporteAtualizado){
        this.esporte = esporteAtualizado;
    }

    public void setEquipes(String equipesAtualizado){
        this.equipes = equipesAtualizado;
    }
}
