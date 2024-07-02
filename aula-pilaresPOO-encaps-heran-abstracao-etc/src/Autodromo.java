
public class Autodromo {
    public static void main(String[] args) {
    	Carro jeep = new Carro();
    	jeep.setChassi("2342342"); // conceito de herança
    	//jeep.ligar();
    	
    	Moto z400 = new Moto();
    	z400.setChassi("898777"); // coneceito de herança
    	//z400.ligar();
    	
    	System.out.println("Chassi da Moto é: " + z400.getChassi());
    	System.out.println("Chassi do Carro é: " + jeep.getChassi());
    	
    	Veiculo coringa = jeep;
    	coringa.ligar();
    	
    	// abstração e polimorfismo
    	// polimorfismo = usar a mesma funcao de forma diferente
    	
    	// por exemplo na classe veiculo foi publicado abstrato o metodo ligar
    	
    	// tambem foi criado a funcao ligar na classe moto e carro
    	// aqui nesta classe quando eu uso objeot carro mais ligar
    	// ele chama o metodo ligar criado na casse carro
    	// quando eu chamo o metodo ligar no objeto moto ele
    	// chama a funcao de ligar a moto criado na classe moto que eh diferente da do carro
    }  
}

