package aula17;

public class aula {
	
	static int vStatic = 1;
	
	int vStance = 1;
	
	static{
		
		//bloco static sao executados antes que outra instru��o
		//antes mesmo dos consrutures da classe
		//
		System.out.println("Bloco statico");
		System.out.println("vStatic");
		System.out.println(new aula().vStance);
		
	}
	
	{
		//blocos de instacia sao executados 
		///quando se � criada uma instancia do objeto
			System.out.println("Bloco de instancia");
			System.out.println(vStatic + vStance);
		
	}
		
	
	public static void main(String[] args) {
		
		aula a = new aula();
		
	}

}
