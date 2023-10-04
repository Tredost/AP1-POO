import java.util.Scanner;
import entidades.Cli;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        entidades.Cli.cadastarEvento(leitor);
    }
}