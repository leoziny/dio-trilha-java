import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a Agencia");
        String codigoAgencia = sc.next();
        System.out.println("O numero da agencia contem apenas 4 numeros, Digite o numero da agencia: ");
        int numeroAgencia = sc.nextInt();

        while (numeroAgencia < 1000 || numeroAgencia > 9999) {
            System.out.println("O número da Agência deve conter exatamente 4 dígitos. Por favor, digite novamente:");
            numeroAgencia = sc.nextInt();
        }

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o seu saldo: ");
        double saldoCliente = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f%n já está disponível para saque", nomeCliente, codigoAgencia, numeroAgencia, saldoCliente);
    }
}