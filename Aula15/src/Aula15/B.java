package Aula15;

public class B {

	//recursividade
	
	//B chama go
	//go chama uma nova instancia de b
	//onde chama o ctor padrao novamente
	
	public B(){
		Go();
	}
	
	public B(String b){
		this();
	}
	
	public void Go(){
		new B("b");
	}
}
