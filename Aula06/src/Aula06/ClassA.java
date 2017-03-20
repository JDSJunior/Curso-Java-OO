package Aula06;


public class ClassA {
	
	 private String privado;
	 
	 protected String protegido;
	 
	 public String publico;
	 
	 String pacote;
	 
	 public static void main(String[] args) {
			ClassA CA = new ClassA();
			
			CA.pacote = "pacote A";
			CA.protegido = "protegido A";
			CA.publico = "publico A";
			//unico atributo que nao pode ser visivel em outras classes
			CA.privado = "privado A";
		}
}