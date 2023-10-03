package entidades.eventos;

import entidades.ingressos.IngJogo;
import entidades.ingressos.TipoIngresso;

public class Jogo extends Evento {
    private String esporte, equipe1, equipe2;

    public Jogo(String nomeEvento, String dataEvento, String localEvento, int ingressosInteira, int ingressosMeia, double precoCheio, String esporte, String equipe1, String equipe2) {
        super(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio);
        this.esporte = esporte;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public boolean isIngressoDisponivel(TipoIngresso tipoIngresso, int quantidade) {
        if (tipoIngresso.equals(TipoIngresso.INTEIRA) && quantidade <= this.getIngressosInteira()){
            return true;
        }
        else if (tipoIngresso.equals(TipoIngresso.MEIA) && quantidade <= this.getIngressosMeia()) {
            return true;
        }
            return false;
    }

    public double venderIngresso(TipoIngresso tipoIngresso, int quantidade, int descontoTorcedor) {

        IngJogo ingresso = new IngJogo(this, tipoIngresso, descontoTorcedor);
        double valor = ingresso.getPreco();

        if (tipoIngresso.equals(TipoIngresso.INTEIRA)){
            int ingressosInteira = this.getIngressosInteira();
            ingressosInteira -= quantidade;
            this.setIngressosInteira(ingressosInteira);
        }
        else {
            int ingressosMeia = this.getIngressosMeia();
            ingressosMeia -= quantidade;
            this.setIngressosMeia(ingressosMeia);
        }
        return valor * quantidade;
    }


























































    // GETTERS

    public String getEsporte() {
        return this.esporte;
    }

    public String getEquipe1() {
        return this.equipe1;
    }

    public String getEquipe2() {
        return this.equipe2;
    }

    // SETTERS

    public void setEsporte(String novoEsporte) {
        this.esporte = novoEsporte;
    }

    public void setEquipe1(String novaEquipe) {
        this.equipe1 = novaEquipe;
    }

    public void setEquipe2(String novaEquipe) {
        this.equipe2 = novaEquipe;
    }
}


/* o evento deve conter o esporte e as equipes que estão competindo. */