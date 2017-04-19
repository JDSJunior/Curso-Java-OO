package aula19;

public class Aula {
	
	public static void main(String[] args) {
		
		System.out.println("Multiplicação = " + new Aula().getCalculo(10, 45));
		
	}
	
	//metodo que contem uma classe interna
	int getCalculo(int x, int y){
		
		System.out.println("Valor de x = " + x);
		System.out.println("Valor de y = " + y);
		
		//versoes anteriores ao java 1.8 não aceitam variaveis
		//que nao sejam final em classes internas
		//versoes anteriores do java 1.8
		//nao gerenciam a stack 
		final int z;
		
		class Calculo{
			
			//variaveis de instancia da classe calculo
			private int a;
			private int b;
			
			Calculo(){
			}
			
			//metodo construtor setando as variaveis
			//da classe
			Calculo(int a, int b){
				this.a = a;
				this.b = b;
			}
			
			int Multipliacar(){
				return a * b;
			}
			
			//metodo de soma dentro da classe interna
			int Soma(){
				//retorno da metodo da classe interna
				return x + y;
			}
		}
		//retorno do metodo da classe Aula
		System.out.println("Soma = " + new Calculo().Soma());
		
		return new Calculo(10, 2).Multipliacar();
	}
}
