import java.util.Scanner;
import entidades.Cli;
import entidades.eventos.Exposicao;
import entidades.eventos.Jogo;
import entidades.eventos.Show;
import entidades.ingressos.Ingresso;
import entidades.eventos.Evento;
public class App {
    public static void main(String[] args) throws Exception {
        Evento evento = null;
        Ingresso ingresso = null;

        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer?\n  1 - Cadastrar novo evento\n  2 - Comprar ingressos\n  3 - Informações do evento\n  4 - Informações do último ingresso vendido\n");
            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    evento = entidades.Cli.cadastrarEvento(leitor);
                    break;
                case 2:
                    if (evento != null) {
                        ingresso = entidades.Cli.comprarIngresso(leitor, evento); }
                    else {
                        System.out.println("CADASTRE UM EVENTO PRIMEIRO!");
                    }
                    break;
                case 3:
                    if (evento != null) {
                        System.out.println(evento); }
                    else {
                        System.out.println("CADASTRE UM EVENTO PRIMEIRO!");
                    }
                    break;
                case 4:
                    if (ingresso != null) {
                        System.out.println(ingresso); }
                    else {
                        System.out.println("COMPRE UM INGRESSO PRIMEIRO!");
                    }
                    break;
                default:
                    System.out.println("OPÇÃO NÃO EXISTE!");
            }
        }
    }
}