package eventos;
public class Show extends Evento{
    String nomeArtista, generoMusica;

    Show(String nomeArtista, String generoMusica, String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.nomeArtista = nomeArtista;
        this.generoMusica = generoMusica;
    }
    
    //getters
    public String getNomeArtista(){
        return this.nomeArtista;
    }

    public String getGeneroMusica(){
        return this.generoMusica;
    }

    //setters
    public void setNomeArtista(String nomeArtistaAtualizado){
        this.nomeArtista = nomeArtistaAtualizado;
    }

    public void setGeneroMusica(String generoMusicaAtualizado){
        this.generoMusica = generoMusicaAtualizado;
    }
}
