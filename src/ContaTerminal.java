import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome completo:");
        String name = scanner.nextLine().toUpperCase();

        System.out.println("Por favor, informe o número da sua conta:");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, informe o número da agência:");
        String agencyNumber = scanner.next();
        
        System.out.println("Por favor, informe o saldo da conta:");
        float balance = scanner.nextFloat();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", name, agencyNumber, accountNumber, balance);
        scanner.close();
    }
}
