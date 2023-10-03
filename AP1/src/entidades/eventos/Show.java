package entidades.eventos;

import entidades.ingressos.IngShow;
import entidades.ingressos.IngShow.EspacoEnum;
import entidades.ingressos.TipoIngresso;

public class Show extends Evento {
    private String nomeArtista, generoMusical;

    public Show(String nomeEvento, String dataEvento, String localEvento, int ingressosInteira, int ingressosMeia, double precoCheio, int idadeMinima, int duracaoDias, String nomeArtista, String generoMusical) {
        super(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio);
        this.nomeArtista = nomeArtista;
        this.generoMusical = generoMusical;
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


    public double venderIngresso(TipoIngresso tipoIngresso, int quantidade, EspacoEnum espacoEnum) {

        String nomeEvento = this.getNomeEvento();
        IngShow ingresso = new IngShow(nomeEvento, tipoIngresso, espacoEnum);
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

    public String getNomeArtista() {
        return this.nomeArtista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    // SETTERS

    public void setNomeArtista(String novoArtista) {
        this.nomeArtista = novoArtista;
    }

    public void setGeneroMusical(String novoGenero) {
        this.generoMusical = novoGenero;
    }


}


/* o evento deve conter o nome do artista e o gênero da música. */