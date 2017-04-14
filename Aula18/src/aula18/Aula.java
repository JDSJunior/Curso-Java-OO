package aula18;

import java.time.LocalDate;

public class Aula {
	
	//Classe interna que implementa a interface com a assinatura do metodo
	public class MyInnerClass implements Iexercicio{
		
		//metodo subestrico
		@Override
		public void Hello() {
			System.out.println("Olá, eu sou uma classe interna regular");
			
		}
		
	}
	
	//metodo que retorna uma instancia da classe interna
	public MyInnerClass getHello(){
		return new MyInnerClass();
	}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Dariana");
		p.setSobrenome("Neumann");
		p.setDtNascimento(LocalDate.of(1994, 10, 18));
		
		System.out.printf("%s %s possui %d anos %d meses %d dias", 
				p.getNome(), 
				p.getSobrenome(), 
				p.getIdade().getAnos(),
				p.getIdade().getMeses(),
				p.getIdade().getDias());
		
		System.out.println();
		
		//instancia da classe Aula
		Aula ex = new Aula();
		
		//acessando o metodo hello atraves do metodo getHello
		//que instancia a classe interna para o uso
		ex.getHello().Hello();
		
		//instancia da classe sem o uso do metodo que getHello para 
		//instanciar a classe
		MyInnerClass ex2 = new Aula().new MyInnerClass();
		
		ex2.Hello();
		
		
		
		
				
				
	}
}
