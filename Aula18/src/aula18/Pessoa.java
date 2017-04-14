package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private String sobrenome;	
	private LocalDate dtNascimento;

	//instancia a classe interna Idade()
	//para ser usada em objetos que do tipo pessoa
	public CalculaIdade getIdade(){
		return new Idade();
	}
	
	//classe interna que impementa a interface CalculaIdade
	private class Idade implements CalculaIdade{
		
		//metodo que retorna o numero de anos
		@Override
		public int getAnos() {
			
			//period classe nao estatica que contem o metodo between
			//para obtermos a quantidae de tempo entre as duas datas
			Period p = Period.between(dtNascimento, LocalDate.now());;
			
			//retorna a quantidade de anos que foi calculada atraves
			//do metodo between da classe period
			return p.getYears();
			
		}

		@Override
		public int getMeses() {
			
			Period p = Period.between(dtNascimento, LocalDate.now());
			return p.getMonths();
			
		}

		@Override
		public int getDias() {
			
			Period p = Period.between(dtNascimento, LocalDate.now());
			return p.getDays();
			
		}
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
}
