import java.util.Scanner;
import entidades.Cli;
import entidades.eventos.Exposicao;
import entidades.eventos.Jogo;
import entidades.eventos.Show;
public class App {
    public static void main(String[] args) throws Exception {
        Exposicao expo = new Exposicao(null, null, null, 0, 0, 0, 0, 0);
        Show show = new Show(null, null, null, 0, 0, 0, null, null);
        Jogo jogo = new Jogo(null, null, null, 0, 0, 0, null, null, null);

        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer?\n  1 - Cadastrar novo evento\n  2 - Comprar ingresso");
            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    entidades.Cli.cadastrarEvento(leitor, expo, show, jogo);
                    break;
                case 2:
                    entidades.Cli.comprarIngresso(leitor, expo, show, jogo);
                    break;
                default:
                    System.out.println("OPÇÃO NÃO EXISTE!");
            }
        }
    }
}