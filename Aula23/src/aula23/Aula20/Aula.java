package aula23.Aula20;

public class Aula {
	
	//classes do tipo anonima são usadas para ter a nescessidade
	//de instanciar varias classes concretas para implementar metodos
	//de interface, instanciando-a diretamente
	public static void main(String[] args) {
		
		//implementando normalmente
		Calculo c = new Calculo();
		System.out.println("Soma = " + c.Somar(10, 5));
		System.out.println("Multiplicação = " + c.Multiplicar(100, 5));
		
		Aula a = new Aula();
		System.out.println("MySoma = " + a.MySoma(10, 10));
		
		//para passar a classe anonima como parametro devemos instancia-la
		//primeiro na chamada do metodo
		a.Imprime(new Executa() {
			
			@Override
			public void Executar() {
				
				System.out.println("Metodo Executa");
			}
		});
	}
	
	int MySoma(int a, int b){
		
		//classe do tipo anonima
		//instanciando a interface
		//nao temos a keyword class
		Adicao adicao = new Adicao() {
			
			//implemantacao direta na interface
			//sem a nescessidade de uma classe concreta
			@Override
			public int Somar(int a, int b) {
				return a + b + 1;
			}
		};
		//retorno a interface.metodo
		return adicao.Somar(a, b);
	}
	
	//passando a classe anonima por parametro de um metodo
	void Imprime(Executa executa){
		
		executa.Executar();
		
	}
}
