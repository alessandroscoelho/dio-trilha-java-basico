import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso usuario
        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta.");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor a ser depositado.");
        Double saldo = scanner.nextDouble();

        

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta número: " +  numeroConta + " e seu saldo de: R$" + saldo + " já está disponível para saque.");



    }
}
