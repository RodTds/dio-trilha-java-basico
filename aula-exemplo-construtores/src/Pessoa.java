
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
		
	// método construtor
	// o nome deverá ser igual ao nome da classe
	// Declaração do MÉTODO CONTRUTOR é digerente
	// ele tambem contrói o objeto já com os valores informados
	// digerente do método GET e SET
	
	// metodo contrutor ja cria objeto, com os parametro recebidos passados da chamada em outra classe
	//? diferente do GET e SET comum que cria o objeto e depois recebe os valores
   
	//  *** OBS: Isso é usado por exemplo que na criação de um objeto Aluno por exemplo
	// é necessário informar o nome é o cpf, os outros atributos podem ser passados depois
	// ou  seja é passado os atributos relevantes para a existência de um objeto
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		}
		//...
		//getters
		//setters
	
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
