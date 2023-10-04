import java.util.Scanner;
import entidades.Cli;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("O que deseja fazer?\n  1 - Cadastrar novo evento\n  2 - Comprar ingresso");
            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    entidades.Cli.cadastrarEvento(leitor);
                    break;
                case 2:
                    entidades.Cli.comprarIngresso(leitor);
                    break;
                default:
                    System.out.println("OPÇÃO NÃO EXISTE!");
            }

        }
    }
}