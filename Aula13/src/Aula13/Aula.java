package Aula13;

public class Aula {
	
	//polimorfismo
	//o objeto do tipo yamaha sendo usado como um veiculo 
	private Veiculo veiculo;
	private Yamaha yamaha;
	
	void veiculos(){
	
		//atribuindo uma variavel do tipo superclasse em uma subclasse
		//polimorfismo
		veiculo = new Ford(); //up cast subclasse como um superclasse
		veiculo.setCor("branco");
		veiculo.setPeso(2000);
		System.out.println(veiculo.toString());
	
	}
	
	void carrosEMotos(){
		//down cast superclasse como subclasse
		yamaha = (Yamaha)new Veiculo();
		yamaha.setNome("Fazer 250");
		yamaha.setCor("Azul");
		yamaha.setPeso(500);
		System.out.println(yamaha.toString());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ford f = new Ford();
		f.setCor("preto");
		f.setPeso(1500);
		System.out.println(f.toString());
		
		System.out.println();
		
		Yamaha y = new Yamaha();
		y.setNome("Fazer 250");
		y.setCor("prata");
		y.setPeso(150);
		System.out.println(y.toString());

	}

}
