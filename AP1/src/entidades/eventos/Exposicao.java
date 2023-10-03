package entidades.eventos;

import entidades.ingressos.TipoIngresso;
import entidades.ingressos.IngExpo;

public class Exposicao extends Evento {
    private int idadeMinima, duracaoDias;

    public Exposicao(String nomeEvento, String dataEvento, String localEvento, int ingressosInteira, int ingressosMeia, double precoCheio, int idadeMinima, int duracaoDias) {
        super(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio);
        this.idadeMinima = idadeMinima;
        this.duracaoDias = duracaoDias;
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






















    public double venderIngresso(TipoIngresso tipoIngresso, int quantidade, boolean descontoSocial) {

        String nomeEvento = this.getNomeEvento();
        IngExpo ingresso = new IngExpo(nomeEvento, tipoIngresso, descontoSocial);
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

    public int getIdadeMinima() {
        return this.idadeMinima;
    }

    public int getDuracaoDias() {
        return this.duracaoDias;
    }

    // SETTERS

    public void setIdadeMinima(int novaIdade) {
        this.idadeMinima = novaIdade;
    }

    public void setDuracaoDias(int novaDuracao) {
        this.duracaoDias = novaDuracao;
    }
}


/* o evento deve conter a faixa etária mínima recomendada e a duração, em dias, da exposição. */