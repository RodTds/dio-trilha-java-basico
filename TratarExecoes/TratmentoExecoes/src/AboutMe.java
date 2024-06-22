import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
    // try quando tudo ocorre normal, casoi digite algo errado vai para o catch
    try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println(" Digite o Nome ");
        String nome = scanner.next();

        System.out.println(" Digite seu Sobrenome ");
        String sobrenome = scanner.next();

        System.out.println(" Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println(" Digite sua Altura");
        double altura = scanner.nextDouble();
        
        // imprimir dados capturados
        System.out.println("Ola meu nome é " + nome.toUpperCase());
        System.out.println("Tenho ");
        System.out.println("Tenho " + idade + " anos de idade");
        System.out.println("Tenho " + altura + " de altura");
        scanner.close();
        }// TRY
        catch (InputMismatchException e) { // exeção sobre input de double e int caso digite com vírgula pou texto ele exibe a mensagem
            System.out.println("Altura precisa ser numericos");
        }

    }  
}