package Aula08;

public class Livro 
{	
	private String titulo;
	private String autor;
	private int paginas;
	private boolean lancamento;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isLancamento() {
		return lancamento;
	}

	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	
	//subescrevendo metodo toString
	@Override
	public String toString()
	{
		return "Titulo - "+this.titulo+"\nAutor - "+this.autor+"\nPáginas - "+this.paginas+"\nLançamento - "+this.lancamento;
	}

	
	//construtur padrao implicito das classe Java
	//não será criado implicitamnete se for criado outro construtur
	public Livro()
	{
		super();
	}
	
	public Livro(String titulo)
	{
		//super() fica implicito
		this.titulo = titulo;
	}

	public Livro(String titulo, String autor, int paginas, boolean lancamento) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lancamento = lancamento;
	}
	
	
}
