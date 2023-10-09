package entidades;
import java.util.Scanner;
import entidades.eventos.Evento;
import entidades.eventos.Exposicao;
import entidades.eventos.Jogo;
import entidades.eventos.Show;
import entidades.ingressos.IngExpo;
import entidades.ingressos.IngJogo;
import entidades.ingressos.IngShow;
import entidades.ingressos.Ingresso;
import entidades.ingressos.TipoIngresso;
import entidades.ingressos.IngShow.EspacoEnum;

public class Cli {
Scanner leitor = new Scanner(System.in);


public static Evento cadastrarEvento(Scanner leitor) {
    Evento evento = null;

    System.out.println("Qual tipo de evento deseja cadastar?\n  1 - Exposição\n  2 - Jogo\n  3 - Show\n");
    int tipoEvento = leitor.nextInt();

    leitor.nextLine();

    System.out.println("Qual nome do evento?\n");
    String nomeEvento = leitor.nextLine();

    System.out.println("Qual a data do evento?\n");
    String dataEvento = leitor.nextLine();

    System.out.println("Qual o local do evento?\n");
    String localEvento = leitor.nextLine();

    System.out.println("Quantos ingressos INTEIRA existem?\n");
    int ingressosInteira = leitor.nextInt();

    System.out.println("Quantos ingressos MEIA existem?\n");
    int ingressosMeia = leitor.nextInt();

    System.out.println("Qual o preço cheio do ingresso?\n");
    double precoCheio = leitor.nextDouble();

    switch (tipoEvento) {

        case 1:

            System.out.println("Qual a idade mínima?\n");
            int idadeMinima = leitor.nextInt();

            System.out.println("Quantos dias de duração?\n");
            int duracaoDias = leitor.nextInt();

            return new Exposicao(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, idadeMinima, duracaoDias);

        case 2:

            leitor.nextLine();

            System.out.println("Qual o esporte?\n");
            String esporte = leitor.nextLine();

            System.out.println("Qual a primeira equipe?\n");
            String equipe1 = leitor.nextLine();

            System.out.println("Qual a segunda equipe?\n");
            String equipe2 = leitor.nextLine();

            return new Jogo(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, esporte, equipe1, equipe2);

        case 3:
            leitor.nextLine();

            System.out.println("Qual o nome do artista?\n");
            String nomeArtista = leitor.nextLine();

            System.out.println("Qual o gênero musical?\n");
            String generoMusical = leitor.nextLine();

            return new Show(nomeEvento, dataEvento, localEvento, ingressosInteira, ingressosMeia, precoCheio, nomeArtista, generoMusical);

        default:
            System.out.println("OPÇÃO NÃO EXISTE!");
            return evento;
    }


}

/* public static void mostrarEvento(Evento evento) {
    if (evento instanceof Show) {
        Show show = (Show) evento;
        System.out.println("Nome: " + show.getNomeEvento());
        System.out.println("Data: " + show.getDataEvento());
        System.out.println("Local: " + show.getLocalEvento());
        System.out.println("Ings. Inteira: " + show.getIngressosInteira());
        System.out.println("Ings. Meia: " + show.getIngressosMeia());
        System.out.println("Valor: " + show.getPrecoCheio());
        System.out.println("Artista: " + show.getNomeArtista());
        System.out.println("Gênero musical: " + show.getGeneroMusical());

    } else if (evento instanceof Exposicao) {

        Exposicao expo = (Exposicao) evento;
        System.out.println("Nome: " + expo.getNomeEvento());
        System.out.println("Data: " + expo.getDataEvento());
        System.out.println("Local: " + expo.getLocalEvento());
        System.out.println("Ings. Inteira: " + expo.getIngressosInteira());
        System.out.println("Ings. Meia: " + expo.getIngressosMeia());
        System.out.println("Valor: " + expo.getPrecoCheio());
        System.out.println("Idade mínima: " + expo.getIdadeMinima());
        System.out.println("Duração: " + expo.getDuracaoDias());

    } else if (evento instanceof Jogo) {
        Jogo jogo = (Jogo) evento;
        System.out.println("Nome: " + jogo.getNomeEvento());
        System.out.println("Data: " + jogo.getDataEvento());
        System.out.println("Local: " + jogo.getLocalEvento());
        System.out.println("Ings. Inteira: " + jogo.getIngressosInteira());
        System.out.println("Ings. Meia: " + jogo.getIngressosMeia());
        System.out.println("Valor: " + jogo.getPrecoCheio());
        System.out.println("Esporte: " + jogo.getEsporte());
        System.out.println("Equipe 1: " + jogo.getEquipe1());
        System.out.println("Equipe 2: " + jogo.getEquipe2());
    }
    else { System.out.println("Tipo de evento desconhecido"); }
} */

public static Ingresso comprarIngresso(Scanner leitor, Evento evento) {
    Ingresso ingresso = null;


    System.out.println("Quantos ingressos deseja?\n");
    int quantidade = leitor.nextInt();

    while (true) {
    if (quantidade <= 0) {
        System.out.println("Quantidade inválida. Tente denovo!\n");
        quantidade = leitor.nextInt();
    } else {
        break;
    }
    }

    System.out.println("Qual o tipo de ingresso deseja comprar?\n  1 - INTEIRA\n  2 - MEIA\n");
    TipoIngresso tipoIngresso;
    int tipoInt = leitor.nextInt();

    while (true) {
    if (tipoInt == 1) {
        tipoIngresso = TipoIngresso.INTEIRA;
        break;
    } else if (tipoInt == 2) {
        tipoIngresso = TipoIngresso.MEIA;
        break;
    } else {
        System.out.println("Tipo de ingresso inválido. Tente denovo!\n");
        tipoInt = leitor.nextInt();
    }
    }

    if (!evento.isIngressoDisponivel(tipoIngresso, quantidade)) {
        System.out.println("Não existem ingressos disponíveis para sua compra :(\n");
        return ingresso;
    }

    switch (evento.getTipo()) {

        case "Exposição":
            System.out.println("Possui desconto social?\n  1 - SIM\n  2 - NÃO\n");
            int descontoInt = leitor.nextInt();
            boolean descontoSocial;

            while (true) {
            if (descontoInt == 1) {
                descontoSocial = true;
                break;
            } else if (descontoInt == 2) {
                descontoSocial = false;
                break;
            } else {
                System.out.println("Opção inválida! Tente denovo.\n");
                descontoInt = leitor.nextInt();
            }
            }
            System.out.println("as");
            ingresso = new IngExpo(evento, tipoIngresso, descontoSocial);
            emitirRecibo(evento, ingresso, tipoIngresso, quantidade);
            return ingresso;


        case "Jogo":
            System.out.println("Se possui desconto torcedor digite aqui!\n");
            double descontoTorcedor = leitor.nextDouble();

            ingresso = new IngJogo(evento, tipoIngresso, descontoTorcedor);
            emitirRecibo(evento, ingresso, tipoIngresso, quantidade);
            return ingresso;

        case "Show":
            System.out.println("Qual o espaço do show deseja ficar?\n  1 - PISTA\n  2 - CAMAROTE\n");
            EspacoEnum espacoEnum;
            int espacoInt = leitor.nextInt();

            while (true) {
            if (espacoInt == 1) {
                espacoEnum = EspacoEnum.PISTA;
                break;
            } else if (espacoInt == 2) {
                espacoEnum = EspacoEnum.CAMAROTE;
                break;
            } else {
                System.out.println("Espaço inválido! Tente novamente.\n"); }
                espacoInt = leitor.nextInt();
            }

            ingresso = new IngShow(evento, tipoIngresso, espacoEnum);
            emitirRecibo(evento, ingresso, tipoIngresso, quantidade);
            return ingresso;

        default:
            System.out.println("OPÇÃO NÃO EXISTE!\n");
            return ingresso;
        }
}

public static void emitirRecibo(Evento evento, Ingresso ingresso, TipoIngresso tipoIngresso, int quantidade) {
    double valor = ingresso.getPreco() * quantidade;
    evento.venderIngresso(tipoIngresso, quantidade);
    System.out.println("Compra realizada!\n  " + quantidade + "x " + tipoIngresso + "\n  TOTAL: R$ " + valor + "\n");
}

public static void consultarIngressosRestantes(Evento evento) {
    System.out.println("Quantidade de ingressos inteiras restante: "+ evento.getIngressosInteira() + "\nQuantidade de ingressos meia restante:" + evento.getIngressosMeia() + "\n");
    
}

public static void informaçaoUltimaVenda (Ingresso ingresso) {
    System.out.println("");
}

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


