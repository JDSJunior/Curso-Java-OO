package Aula15;

public class PessoaFisica extends Pessoa{
	
	public PessoaFisica(){
		
		super();
		System.out.println("PessoaFisica");
		
	}
	
	public PessoaFisica(String nome) {
		
		//acessa o ctor sem parametros da classe base
		//super();
		
		//acessa o ctor da classe base e passa o paramentro nome
		//para o contrutor sobrecarregado
		super(nome);
		System.out.println("PessoaFisica(String nome)");
		
	}
}
