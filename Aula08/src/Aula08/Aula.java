package Aula08;

public class Aula 
{
	public static void main(String[] args) 
	{
		Livro l1 = new Livro();
		l1.setTitulo("Java1");
		l1.setAutor("Beltrano");
		l1.setPaginas(50);
		l1.setLancamento(false);
		
		System.out.println(l1);
		
		Livro l2 = new Livro("Java l2");
		
		System.out.println(l2);
	}
}
