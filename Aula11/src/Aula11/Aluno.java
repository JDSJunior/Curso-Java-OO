package Aula11;

public class Aluno extends Pessoa {
	//metodo subescrito
	@Override
	public void setMatricula(String matricula){
		if(matricula.length() < 6){
			super.setMatricula(matricula);
		}else{
			super.setMatricula("Matricula Invalida");
		}
	}
}
