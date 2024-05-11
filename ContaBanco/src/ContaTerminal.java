import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Informe o Número da Conta ");
       int conta = scanner.nextInt();

       System.out.println("Informe o Número da Agência ");
       String agencia = scanner.next();

       System.out.println("Informe o Nome do Cliente");
       String NomeCliente = scanner.next();

       System.out.println("Informe o Saldo da Conta ");
       double saldo = scanner.nextDouble();
       /* 
         conheço logica de programação e prints eu sei concatenar variáveis com textos,
         por isso preferi fazer com mais de um print para não ficar uma linha extensa
         .....
       */
       
       System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco");
       System.out.println("Sua agência é: " + agencia +" Conta: "+ conta);
       System.out.println("Seu saldo de R$ : " + saldo + ", já esta disponível para saque");
     
    }
}
    

