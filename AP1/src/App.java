import java.util.Scanner;
import entidades.Cli;
import entidades.eventos.Exposicao;
import entidades.eventos.Jogo;
import entidades.eventos.Show;
import entidades.eventos.Evento;
public class App {
    public static void main(String[] args) throws Exception {
        Evento evento = null;

        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer?\n  1 - Cadastrar novo evento\n  2 - Comprar ingresso");
            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    evento = entidades.Cli.cadastrarEvento(leitor);
                    break;
                case 2:
                    if (evento != null) {
                    entidades.Cli.comprarIngresso(leitor, evento); }
                    else {
                        System.out.println("CADASTRE UM EVENTO PRIMEIRO!");
                    }
                    break;
                default:
                    System.out.println("OPÇÃO NÃO EXISTE!");
            }
        }
    }
}