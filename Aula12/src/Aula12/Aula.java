package Aula12;

public class Aula {
	public static void main(String[] args) {
		
		//Funcionario f = new Funcionario();
		
		Programador p = new Programador();
		p.setNome("José Júnior");
		p.setSalario(2000.50);
		System.out.printf("Nome: %s - Salario: %.2f", p.getNome(), p.calculaSalario());
		
		System.out.println();
		
		Analista a = new Analista();
		a.setNome("Dariana");
		a.setSalario(2000.50);
		System.out.printf("Nome: %s - Salario: %.2f", a.getNome(), a.calculaSalario());
		
	}
}
