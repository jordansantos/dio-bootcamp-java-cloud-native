import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da conta!");
            int numero = Integer.parseInt(sc.nextLine());

            System.out.println("Por favor, digite o número da agência!");
            String agencia = sc.nextLine();

            System.out.println("Por favor, digite o seu nome!");
            String nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o seu saldo!");
            double saldo = Double.parseDouble(sc.nextLine());

            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
            System.out.println(mensagem);
        }
    }
}
