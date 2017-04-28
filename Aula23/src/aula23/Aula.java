package aula23;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

import  aula23.Aula20.*;

public class Aula {

	public static void main(String[] args) {
		
		//List implementa Collection que implementa ITerable
		//ITerable é interface funcional que que contem um metodo foreach
		List<String> nomes = Arrays.asList("Júnior", "Dariana", "Júlia", "José", "Lore");
		
		//teste01();
		//teste02();
		//teste03(nomes);
		nome04(nomes);
	}

	//percorrendo e exibindo nomes com filtro
	//metodo classico 
	//java 7
	private static void nome04(List<String> nomes) {
		for(String nome : nomes){
			if(nome.startsWith("J")){
				System.out.println(nome);
			}
		}
		
		System.out.println("------------------------------");
		
		//percorrendo e exinbindo os nomes com filtro
		//usando funça lambda
		nomes.stream().filter((String nome) -> nome.startsWith("J"))
		.forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		//Usando a classe Consumer para exibir mensagem antes do nome
		Consumer<String> mensagem = (String n) -> System.out.print("Meu nome é ");
		
		Consumer<String> nome = (String n) -> System.out.println(n);
		
		nomes.forEach(mensagem.andThen(nome));
						
	}


	//metodo classico  de percorrer uma lista java 7
	private static void teste03(List<String> nomes) {
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		System.out.println("--------------------------");
		
		//usando lambda para exibir o conteudo
		//vai usar a variavel nome para percorrer o array
		//e mostar com o system.out
		//o metodo usa um parametro do tipo consumer 
		//quando utilizamos a interface ela é automaticamente tranformada em um 
		//consumer
		//java 8
		nomes.forEach((nome) -> {System.out.println(nome); } );
		
		System.out.println("--------------------------");
		
		nomes.forEach(System.out::println);
		
	}


	private static void teste02() {
		
		//usando a interface da aula 20
		//Adicao ad = (int a ,int  b) -> { return a + b; };
		//no caso de uma linha podemos escrever a instrução sem chaves e sem
		//keyword return
		Adicao ad = (a , b) -> a + b;
		System.out.println("Soma = "+ad.Somar(500, 200));
	}

	private static void teste01() {
		
		//usando uma classe anonima java 7
		Funcionario f1 = new Funcionario() {
			
			@Override
			public double remuneracao() {
				
				return 800 + 900;
			}
		};
		//acessando metodo remuneracao da classe anonima
		System.out.println(f1.remuneracao());
		
		System.out.println("------------------------------");
		
		//expressao lambda
		//codigo que será injetado no metodo
		//abstrato da interface
		//java 8
		Funcionario f2 = () -> { return 800 + 900; };
		f2.imprime();
		
	}
}
