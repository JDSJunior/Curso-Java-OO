package Aula06;

import SuperClasse.ClasseMae;

public class ClassAula06 extends ClasseMae
{
	
	public static void main(String[] args) {
		ClassA CA = new ClassA();
		
		CA.pacote = "pacote A";
		CA.protegido = "protegido A";
		CA.publico = "publico A";
		
	}
}
