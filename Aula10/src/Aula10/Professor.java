package Aula10;

import java.time.LocalDate;

public class Professor extends Pessoa{
	
	public Professor(){
		
	}
	
	//Construtur que aceita todos os campos da superclasse
	public Professor(String nome, String sobrenome, LocalDate dataNascimento, char sexo, Horas horas){
		super(nome, sobrenome, dataNascimento, sexo);
		setHoras(horas);
	}
	
	private Horas horas;

	public Horas getHoras() {
		return horas;
	}

	public void setHoras(Horas horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"Horas "+  horas;
	}
	
	
}