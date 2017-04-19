package aula19;

public class MyClass {
	
	private int a;
	
	private static int valor = 1000;
	
	//construtor que seta o valor 
	//da variavel a
	public MyClass(int a){
		this.a = a;
	}
	
	//metodo que instancia a classe estatica insterna
	//com o valor de a
	public MyStaticClass getMySaticClass(){
		return new MyStaticClass(a);
	}
	
	//classe estatica dentro da classe Myclass
	private static class MyStaticClass{
		
		private int valor;
		
		//construtor que seta o valor
		//da variavel valor
		public MyStaticClass(int valor){
			this.valor = valor;
		}
		
		public void imprime(){
			//sendo uma classe estatica nao pode
			//acessar os membros nao estaticos da classe
			System.out.println(valor);
		}
	}
	
	public static void main(String[] args) {
		
		//acesso a variavel estatica 
		//dentro da classe MyClass
		int valor = MyClass.valor;
		
		
		//mesmo sendo uma classe estatica temos que 
		//instanciar a classe para temos o acesso a seus
		//membros
		MyStaticClass m = new MyClass.MyStaticClass(1200);
		m.imprime();
		
		MyClass mc = new MyClass(200);
		mc.getMySaticClass().imprime();
		
	}
}
