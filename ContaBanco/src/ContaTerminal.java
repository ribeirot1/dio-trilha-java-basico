import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso usuario
        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt(); 
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Entre com saldo inicial do cliente: ");
        float saldo = scanner.nextFloat(); 

       //Obter pelo scanner os valores digitados no terminal
       String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ")+numero+" e seu saldo R$ "+saldo+" já está disponível para saque.";
       //exibir mensagem da conta criada
       System.out.println(mensagem);

    }
}
