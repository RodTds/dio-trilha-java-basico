// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo",1),// constante de objeto denominado sao paula, onde o nome é SAO PAULO e sigla é SP
	RIO_JANEIRO ("RJ", "Rio de Janeiro",2),
	PIAUI ("PI", "Piauí",3),
	MARANHAO ("MA","Maranhão",4),
	CEARA("CE","Ceará",5)
	;
	
	private String nome;
	private String sigla;
	private int num;
	
	private EstadoBrasileiro(String sigla, String nome, int num) {
		this.sigla = sigla;
		this.nome = nome;
		this.num = num;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getNum() {
		return num;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}

