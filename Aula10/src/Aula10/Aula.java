//Herança em Java
package Aula10;

import java.time.LocalDate;

public class Aula {
	public static void main(String[] args){
		
		Aluno a1 = new Aluno();
		
		a1.setDataNascimento(LocalDate.of(1991, 10, 25));
		a1.setNome("Júnior");
		a1.setSobrenome("Silva");
		a1.setSexo('M');
		a1.setTurno(Turno.MANHA);
		System.out.println(a1.toString());
		
		Professor p1 = new Professor();
		p1.setDataNascimento(LocalDate.of(1994, 10, 18));
		p1.setNome("Dariana");
		p1.setSobrenome("Neumann");
		p1.setSexo('F');
		p1.setHoras(Horas.VINTE_HORAS);
		System.out.println(p1.toString());
		
		Professor p2 = new Professor("José Júnior", "Silva", LocalDate.of(1991, 10, 25), 'M', Horas.TRINTA_HORAS);
		System.out.println(p2.toString());
	}
}
