package eventos;
public class Show extends Evento{
    String nomeArtista, generoMusica;

    Show(String nomeArtista, String generoMusica, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.nomeArtista = nomeArtista;
        this.generoMusica = generoMusica;
    }
    // O ingresso precisa ter qual a localização do ingresso dentro do local do evento, podendo ser “pista” ou “camarote”
}
