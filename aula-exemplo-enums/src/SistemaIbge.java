
// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro e: EstadoBrasileiro.values() ) {
		   System.out.println(e.getSigla() + "-" + e.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO ;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNum());
	}
	
}
