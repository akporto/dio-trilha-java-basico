import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Por favor, digite o numero da Agencia!");
       String agencia = sc.nextLine();

       System.out.println("Por favor, digite o número da Conta!");
       int numero = sc.nextInt();
       
       sc.nextLine(); 

       System.out.println("Por favor, digite o nome do cliente!");
       String nomeCliente = sc.nextLine();

       double saldo = 237.48;

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
