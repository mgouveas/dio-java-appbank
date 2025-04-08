import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-Vindo ao Java bank. O Banco com mais de 5 Bilhões de usuários.");

        System.out.print("Informe seu nome completo: ");
        String cliente = scanner.next();

        System.out.print("Informe o número do sua agência: ");
        String agencia = scanner.next();

        System.out.print("Informe o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o valor a ser depositado: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("Obrigado pelas informações. Estamos efetuando a abertura da sua conta. Aguarde...");

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo +" já está disponível para saque.");

    }
}