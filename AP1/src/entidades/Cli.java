package entidades;
import java.util.Scanner;
import entidades.eventos.Evento;
import entidades.eventos.Exposicao;
import entidades.eventos.Jogo;
import entidades.eventos.Show;
import entidades.ingressos.TipoIngresso;

public class Cli {
Scanner leitor = new Scanner(System.in);
    Show show;
    Jogo jogo;
    Exposicao expo;

public static void cadastarEvento(Scanner leitor) {

    System.out.println("Qual tipo de evento deseja cadastar?\n  1 - Exposição\n  2 - Jogo\n  3 - Show");
    int tipo = leitor.nextInt();

    System.out.println("Qual nome do evento?\n");
    String nomeEvento = leitor.next();

    System.out.println("Qual a data do evento?\n");
    String dataEvento = leitor.next();

    System.out.println("Qual o local do evento?\n");
    String localEvento = leitor.next();

    System.out.println("Quantos ingressos INTEIRA existem?\n");
    int ingressosInteira = leitor.nextInt();

    System.out.println("Quantos ingressos MEIA existem?\n");
    int ingressosMeia = leitor.nextInt();

    System.out.println("Qual o preço cheio do ingresso?\n");
    double precoCheio = leitor.nextDouble();

    switch (tipo) {

        case 1:
            System.out.println("Qual a idade mínima?\n");
            int idadeMinima = leitor.nextInt();

            System.out.println("Quantos dias de duração?\n");
            int duracaoDias = leitor.nextInt();

            Exposicao expo = new Exposicao(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, idadeMinima, duracaoDias);
            System.out.println("Nome: " + expo.getNomeEvento());
            System.out.println("Data: " + expo.getDataEvento());
            System.out.println("Local: " + expo.getLocalEvento());
            System.out.println("Ings. Inteira: " + expo.getIngressosInteira());
            System.out.println("Ings. Meia: " + expo.getIngressosMeia());
            System.out.println("Valor: " + expo.getPrecoCheio());
            System.out.println("Idade mínima: " + expo.getIdadeMinima());
            System.out.println("Duração: " + expo.getDuracaoDias());
            break;

        case 2:
            System.out.println("Qual o esporte?\n");
            String esporte = leitor.next();

            System.out.println("Qual a primeira equipe?\n");
            String equipe1 = leitor.next();

            System.out.println("Qual a segunda equipe?\n");
            String equipe2 = leitor.next();

            Jogo jogo = new Jogo(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, esporte, equipe1, equipe2);
            System.out.println("Nome: " + jogo.getNomeEvento());
            System.out.println("Data: " + jogo.getDataEvento());
            System.out.println("Local: " + jogo.getLocalEvento());
            System.out.println("Ings. Inteira: " + jogo.getIngressosInteira());
            System.out.println("Ings. Meia: " + jogo.getIngressosMeia());
            System.out.println("Valor: " + jogo.getPrecoCheio());
            System.out.println("Idade mínima: " + jogo.getEsporte());
            System.out.println("Idade mínima: " + jogo.getEquipe1());
            System.out.println("Duração: " + jogo.getEquipe2());
            break;

        case 3:
            System.out.println("Qual o nome do artista?\n");
            String nomeArtista = leitor.next();

            System.out.println("Qual o gênero musical?\n");
            String generoMusical = leitor.next();

            Show show = new Show(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, nomeArtista, generoMusical);
            System.out.println("Nome: " + show.getNomeEvento());
            System.out.println("Data: " + show.getDataEvento());
            System.out.println("Local: " + show.getLocalEvento());
            System.out.println("Ings. Inteira: " + show.getIngressosInteira());
            System.out.println("Ings. Meia: " + show.getIngressosMeia());
            System.out.println("Valor: " + show.getPrecoCheio());
            System.out.println("Idade mínima: " + show.getNomeArtista());
            System.out.println("Duração: " + show.getGeneroMusical());
            break;

        default:
        System.out.println("OPÇÃO NÃO EXISTE!");
    }


}


/*public static void comprarIngresso(Scanner leitor) {
    System.out.println("Qual o tipo de ingresso deseja cadastar?\n Digite INTEIRA ou MEIA\n");
    TipoIngresso tipo = leitor.next();

    System.out.println("Qual nome do evento?\n");
    String nomeEvento = leitor.next();

    System.out.println("Qual a data do evento?\n");
    String dataEvento = leitor.next();

    System.out.println("Qual o local do evento?\n");
    String localEvento = leitor.next();
} */

}


/*   String nomeEvento, String dataEvento, String localEvento, int ingressosInteira, int ingressosMeia, double precoCheio, String nomeArtista,
        String generoMusical

Foi solicitado que você elabore uma interface por linha de comando
de forma que o usuário possa realizar as seguintes operações:

Cadastre um novo evento;

Realize a venda de um ingresso, em que o usuário escolhe o tipo do ingresso (inteira ou meia)
e apresenta as características particulares do ingresso (desconto social, por exemplo),
e o programa gera um ingresso e exibe na tela as informações. O usuário deve confirmar se
as informações estão corretas e o programa deve sinalizar que a compra foi realizada;

Exibir informações do evento;

Exibir o número de ingressos restantes;

Exibir informações do último ingresso vendido;

O programa só precisa armazenar um evento e um ingresso por vez.
Ou seja, se um novo evento for cadastrado, o evento anterior é apagado.

===============================================================================================

O aplicativo deve permitir que o usuário visualize a lista de partidas disponíveis para venda;

Para cada partida, o usuário deve poder escolher a quantidade e o tipo de ingressos desejados;

O aplicativo deve calcular o preço total da compra de acordo com a quantidade e o tipo de ingressos selecionados;

Após o pagamento, o usuário deve receber uma mensagem com as informações sobre a partida e a quantidade e o tipo de ingressos comprados.

*/


