package Aula12;

public class Analista extends Funcionario{

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return (getSalario() * 0.5) + getSalario();
	}

}
