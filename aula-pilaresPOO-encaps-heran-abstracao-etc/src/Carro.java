// exemplo de encapsulamento e privar o metodo
// ao inves de chmar ele em outra classe principal
// voce pode usar ele chamdno dentro de um metodo da mesma classe 
// que esta sendo chamada em outro formulario classe principal, 
// como o metodo ligar que eh chamado na classe autodromo
// e os metodos privados sao chamsados no metodo ligar e  exibido na classe 
// autodromo

// *** conceito de HERANÇA , extends Veiculo, extendendo outra classe nessa, ou seja , sendo herdado.
// permitindo, quando usar atributos dessa classe em outra principal e chamdno tambem atributos da ckasse extendida
// nessa, por exemplo na CLASSE AUTODROMO foi criado objeto carro e moto e criano atributo que esta atribuido
// na classe veículo no caso CHASSI
public class Carro extends Veiculo {
	public void ligar() {
	   conferindoCombustivel();
	   conferindoCambio();
       System.out.println("Carro Ligado");
     }
	// encapsulando, metodos que só a classe enxerga   private
	private void conferindoCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	private void conferindoCambio() {
		System.out.println("Conferindo cambio em P");
	}
}