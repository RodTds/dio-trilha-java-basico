import java.util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class processoSeletivo {
      public static void main(String[] args) {
         String [] cand = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

         int opcao = menu(); // chamando o menu e seu valor pela primeira vez
         while(opcao < 5 && opcao > 0){
            if(opcao == 1){
            System.out.println("Função Seleção de candidatos\n ");
            selecaoCandidatos(cand);
            }
            else if (opcao == 2){
            System.out.println("Função analisa o candidato\n ");
            analisarCandidato(2001);
            }
            else if(opcao == 3){
            System.out.println("Função Imprime candidatos Simplificado FOREACH \n");
            imprimirSelecionados(cand); // chamar procedimento que imprime candidatos selecionados, passado por parametro 
            }
            // opcao 4 eh de tentativas de ligacao, fiz um foreach para mandar candidatos 1 por 1 por passagem de
            // parametro no metodo entrendoEmContato()
            else if( opcao == 4){ 
               for(String candidato:cand){
                   entrandoEmContato(candidato);
               }
            }
            opcao = menu(); // chamndo o menu para próxima escolha do usuario, ou sair do laço

         }// while

         System.out.println("SISTEMA FINALIZADO");
         
      } // main
       
      static int menu(){ // Menuzinho do sistema
         System.out.println("\n\nMenu do Sistema \n\n");
         System.out.println("1- Para seleção de candidatos");
         System.out.println("2- Para Análise de Candidatos ");
         System.out.println("3- Imprimir Candidatos ");
         System.out.println("4- Ligar para Candidatos ");
         System.out.println("5- Para Sair ");
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         int scan = scanner.nextInt();
         return scan;

        }// menu

      // CASE 1
      static void selecaoCandidatos(String [] candidatos ){  // procedimento que seleciona os candidatos 
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBAse  = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
          String candidato = candidatos[candidatoAtual];
          double salarioPretendido = valorPretendido(); // chamando a função de velores aletórios e recebendo valores aletórios
          System.out.println("O candidato " + candidato + " solicitou este valor de salário R$: " +  salarioPretendido);
          if (salarioBAse >= salarioPretendido ) { // caso valor pretendido for menos que o valor ase o candidato é selecionado
             System.out.println("O candidato "+ candidato + " Foi selecionado para a vaga");
             
             candidatosSelecionados++;
          }// if
          candidatoAtual++;
        }// while
      }// fim função

       // função auxiliar  que cria valores aletórios 
      static double valorPretendido(){ 
         return ThreadLocalRandom.current().nextDouble(1800,2200);
      }//fim função
      
      // CASE 2
      static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
         if( salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato \n");
         }
         else if(salarioBase == salarioPretendido){
            System.out.println(" Ligar para o candidato com contra-proposta\n ");
         }  
         else {
            System.out.println(" Aguardando o resultado dos demais candidatos\n");

         }
      }// fim função 

      // CASE 3
      static void imprimirSelecionados(String [] candidatos){  // foreach imprimir candidados simplificado
         for(String candidato:candidatos){
            System.out.println("O candidado selecionado foi: " + candidato);
         }
      }// fim função 

     static boolean atender(){ // metodo auxiliar para ligações
            return new Random().nextInt(3)==1;
     }
     
     // CASE 4
     static void entrandoEmContato(String candidato){
      
       int tentativasRealizadas = 1;
       boolean continuarTentando = true;
       boolean atendeu = false;
       do{
          atendeu = atender();
          continuarTentando = !atendeu;
          if(continuarTentando){
             tentativasRealizadas++;
          }
          else{
              System.out.println("Contato realizado com sucesso ");
          }
       }while(continuarTentando && tentativasRealizadas <3);
       if(atendeu){
          System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " Tentativa ");
       }
       else{
         System.out.println("Não conseguimos entrar em contato com "+ candidato +" número máximo de tentativas "+ tentativasRealizadas + " Tentativas" );
       }
       
     }// fim função
   
} // fim class 
