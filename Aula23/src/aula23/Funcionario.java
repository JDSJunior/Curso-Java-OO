package aula23;

@FunctionalInterface
public interface Funcionario {
	
	//interfaces funcionais devem sempre ter 
	//apenas um metodo abstratc
	//podemos ter varios metodos default
	abstract double remuneracao();
	
	default void imprime(){
		System.out.println(remuneracao());
	}
}
