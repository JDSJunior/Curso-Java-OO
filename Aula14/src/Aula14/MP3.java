package Aula14;

public class MP3 implements Player, Audio {

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

}
