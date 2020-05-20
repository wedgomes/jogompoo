package Model;

import java.applet.Applet;
import java.applet.AudioClip;

public class Som {

	private AudioClip abertura;
	private AudioClip porta;
	
	public Som(){
		abertura = Applet.newAudioClip(this.getClass().getResource("abertura.wav"));
		porta = Applet.newAudioClip(this.getClass().getResource("door-1-open.wav"));
	}
	
	public void aberturaSom(){
		abertura.loop();
	}
	
	public void abertuarParar(){
		abertura.stop();
	}
	
	public void portaAbrindo(){
		porta.play();
	}
}
