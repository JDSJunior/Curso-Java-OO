package Aula14;

public class Aula14 {
	
	private PlayerVideo video;
	
	void Video(){
		
		//classes que implementam as interfaces usando o polimorfismo
		
		video = new WMV();
		video.nomeArquivo("video_aula.wmv");
		video.Play();
		video.Pause();
		video.Volume(10);
		video.taxadeBits();
		video.taxadeQuadros();
		video.Stop();
		
		System.out.println();
		
		video = new RMV();
		video.nomeArquivo("video_aula.rmv");
		video.Play();
		video.Pause();
		video.Volume(10);
		video.taxadeBits();
		video.taxadeQuadros();
		video.Stop();
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		new Aula14().Video();
		
		MP3 mp3 = new MP3();
		mp3.Play();
		mp3.Pause();
		mp3.taxadeBits();
		mp3.Volume(10);
		mp3.Stop();
		
		System.out.println();
		
		AVI avi = new AVI();
		avi.Play();
		avi.Pause();
		avi.taxadeBits();
		avi.taxadeQuadros();
		avi.Volume(5);
		avi.Stop();
		
		System.out.println();

	}

}
