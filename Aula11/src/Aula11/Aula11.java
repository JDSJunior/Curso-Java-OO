package Aula11;

public class Aula11 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("José Júnior");
		pessoa.setMatricula("123456");
		System.out.println("Nome:" + pessoa.getNome() + ", " + "Matricula:" + pessoa.getMatricula());
		
		Aluno aluno = new Aluno();
		aluno.setNome("Dariana");
		aluno.setMatricula("123456789");
		System.out.println("Nome:" + aluno.getNome() + ", " + "Matricula:" + aluno.getMatricula());
		
	}
}
