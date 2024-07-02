package escola;
import java.util.Scanner;
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno(); // controi o objeto aluno e depois recebe os parametro(valores) pelo GET e SET
		
		Scanner scanner = new Scanner(System.in);
		
		//Recebendo nome pela digitação
		System.out.print("Digite o Nome ");
		String nome = scanner.nextLine();
		felipe.setNome(nome);
		
		// Recebendo a idade por digitação
		System.out.println("Digite a idade ");
		int idade = scanner.nextInt();
		felipe.setIdade(idade);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	}
}