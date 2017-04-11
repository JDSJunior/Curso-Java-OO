package Aula14;

public interface Player {
	
	//todos os metodos da interface sao public abstract
	//aqueles que nao declarrados, sao implicitos
	public abstract void Play();
	
	abstract void Stop();
	
	void Pause();
	
	void Volume(int volume);

}
