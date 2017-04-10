package Aula12;

public class Programador extends Funcionario{

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return (getSalario() * 0.2) + getSalario();
	}

}
