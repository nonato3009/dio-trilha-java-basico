import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
            Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuario
            System.out.print("Digite o numero da agência: ");
            String agencia = sc.nextLine();
            System.out.print("Digite o número da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do cliente: ");
            String nome = sc.nextLine();
            System.out.print("Por favor, digite o saldo da conta: ");
            double saldo = sc.nextDouble();

            System.out.println();
            
        //Obter pela classe Scanner os valores digitados no terminal
            String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
             + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        //Exibir a mensgem da conta criada 
              System.out.println(mensagem);

        sc.close();
    }
}
