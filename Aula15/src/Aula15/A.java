package Aula15;

public class A {

		//exemplo de recursividade
		
		//construtor A() chama o construtor A("")
		public A(){
			this("");
		}
		
		//construtor A("") chama novamente o contrutorA()
		//looping 
		public A(String b){
			//this();
		}
}