package Aula09;

public enum TrueOrFalse 
{
	//enum com index e descrição
	FALSE(0 , "false"), TRUE(1, "true");
	
	private int index;
	private String desc;
	
	//construtor que define o index e a descrição
	private TrueOrFalse(int index, String  desc)
	{
		this.index = index;
		this.desc = desc;
	}
	
	//metodos que extraem os valores de indice e descrição
	public int getIndex()
	{
		return index;
	}
	public String getDesc()
	{
		return desc;
	}
}
