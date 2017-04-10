package Aula12;

//classes abstratas nao podem ser instanciadas apenas herdadas
//seus metodos sao de implementacao obrigatoria em suas subclasses
public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {

		this.salario = salario;
	}

	public abstract double calculaSalario();
}
