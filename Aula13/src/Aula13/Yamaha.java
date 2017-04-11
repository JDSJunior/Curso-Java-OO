package Aula13;

public class Yamaha extends Moto{
	
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	
	@Override
	public String toString() {
		return super.toString() + " Nome=" + Nome + "]";
	}

}
