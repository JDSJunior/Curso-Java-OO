package Aula10;

public class Aluno extends Pessoa{
	private Turno turno;

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "turno " + turno ;
	}
	
	
	
}
