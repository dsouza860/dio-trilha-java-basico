import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número da agência: ");
        int numAgencia = ler.nextInt();
        System.out.print("Informe o número da conta: ");
        String numConta = ler.next();
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = ler.next();
        ler.nextLine();
        System.out.print("Saldo: ");
        double saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua "+
                "agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo
                + " já está disponível para saque.");
    }
}
