import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {

      int numeroDaConta;
      String numeroDaAgencia;
      String nomeDoCliente;
      double saldo;

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor, Digite o seu nome: ");
      nomeDoCliente = sc.nextLine();

      System.out.println("Digite o número da Agência (xxxx-x): ");
      numeroDaAgencia = sc.nextLine();

      System.out.println("Digite o número da sua Conta (xxxx): ");
      numeroDaConta = sc.nextInt();

      while (numeroDaConta <= 0 || numeroDaConta > 9999) {
         System.out.println("Houve um problema no número da conta, por favor verifique novamente se digitou os 4 digitos ");
         System.out.println("Digite o número da sua Conta (xxxx): ");
         numeroDaConta = sc.nextInt();
      }

      System.out.println("Digite o saldo inicial da conta: ");
      saldo = sc.nextDouble();

      sc.close();

      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeDoCliente, numeroDaAgencia, numeroDaConta, saldo);
   }

}