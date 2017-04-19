package aula20;

//implementando as interfaces
//se fossemos implementar uma logica diferentes nos metodos
//teriamos que criar outra classe concreta
public class Calculo implements Adicao, Multiplicacao {

	@Override
	public int Multiplicar(int a, int b){
		return a * b;
	}

	@Override
	public int Somar(int a, int b) {
		return a + b;
	}

}
