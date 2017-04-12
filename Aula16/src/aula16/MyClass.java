package aula16;

public class MyClass {
	
	void imprime(){
		//acesso de membros estaticos e de instancia
		System.out.println(Aula.nome+" "+ new Aula().sobrenome);
		
		Aula.show();
		
		new Aula().imprime();
	}
}
