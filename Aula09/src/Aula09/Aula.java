package Aula09;

public class Aula
{
	//constante Global
	public static final String OURO = "ouro";
	public static final String PAUS = "paus";
	public static final String ESPADAS = "espadas";
	public static final String COPAS = "copas";
	
	//se nao declarar como static final a variavel nao podera ser
	//acessade por metodos estaticos
	private static final int VALOR = 0;
	
	public void Valor()
	{
		System.out.println(VALOR);
	}
	
	public static void main(String[] args) 
	{
	
		//recuparando as informações do enum com indice e descrição
		TrueOrFalse t = TrueOrFalse.TRUE;
		System.out.println(t);
		System.out.println(t.getIndex());
		System.out.println(t.getDesc());
		
		//trabalhando com enums
		Carta carta = Carta.COPAS;
		switch(carta)
		{
		case COPAS:
			System.out.println("Sua carta é de espadas");
			break;
		case OURO:
		System.out.println("Sua carta é de ouro");
			break;
		case PAUS:
			System.out.println("Sua carta é de paus");
			break;
		case ESPADAS:
			System.out.println("Sua carta é de espadas");
		default:
			System.out.println("Nenhum naipe identificado");
			break;
		}
		
		
		
		String naipe = Aula.COPAS;
		switch(naipe)
		{
		case Aula.OURO:
			System.out.println("Sua carta é de ouro");
			break;
		case Aula.PAUS:
			System.out.println("Sua carta é de paus");
			break;
		case Aula.ESPADAS:
		System.out.println("Sua carta é de espadas");
			break;
		case Aula.COPAS:
			System.out.println("Sua carta é de copas");
			break;
		default:
			System.out.println("Nenhum naipe está presente");
			break;
		}
		
		System.out.println(VALOR);
	}
}
