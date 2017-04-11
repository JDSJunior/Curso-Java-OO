package Aula14;

public class RMV implements PlayerVideo {

	@Override
	public void taxadeQuadros() {
		System.out.println("24 fps");

	}
	@Override
	public void Play() {
		System.out.println("Play...");
		
	}

	@Override
	public void Stop() {
		System.out.println("Stop!");
		
	}

	@Override
	public void Pause() {
		System.out.println("Pause");
		
	}

	@Override
	public void Volume(int volume) {
		System.out.println("Volume" + volume);
		
	}

	@Override
	public void taxadeBits() {
		System.out.println("128 Kb/s");
		
	}
	@Override
	public void nomeArquivo(String nomeArquivo) {
		System.out.println("Nome do Arquivo : "+ nomeArquivo);
	}

}
