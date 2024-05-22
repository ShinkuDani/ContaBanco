import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome Completo: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero do Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " +nomeCliente+ ", Obrigado por criar uma conta em nosso banco, sua agencia é " +agencia+ ", conta " + conta + " e seu saldo é R$" + saldo + " já esta disponível para saque !" );

    }
}
