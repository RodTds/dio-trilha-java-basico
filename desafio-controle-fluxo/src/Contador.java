import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println(" Digite o Primeiro Número ");
        int inicial = scanner.nextInt();

        System.out.println(" Digite o Segundo número ");
        int finnal = scanner.nextInt();
        try{
            calcular(inicial,finnal);
        }
        catch(sequenciaInvalida e){
           System.out.println("O Segundo Parâmetro deve ser menor que o primeiro ");
        }
    }

    static void calcular(int ini,int fin) throws sequenciaInvalida{
         int contador = fin - ini;
         if(fin < ini){
            throw new sequenciaInvalida();
            // tem a lógica de criar uma terceira variavel e trocar o
            // valor menor da segunda variável e jogar na primera o valor menor da segunda na primeira 
            // **** mas entendi que é pra treinar a criação de exceções, LEGAL ****
            // int auxiliar = ini " 12 por exemplo"
            // ini = fin "3 por exemplo "
            //fin = auxiliar
         }
         else{
         System.out.println(" Sequência de Números Impressos");
         System.err.println("Quantidade de Números " + contador);
         for(int x=1; x <= contador;x++){
            System.out.println(x);
         }
        }
    }
    
}
