package Model;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Entidade {

	private int posiX;
	private int posiY;
	private int largura;
	private int altura;
	private BufferedImage imagemC;

	public Entidade(String nomeArquivo, int posiX, int posiY, int largura, int altura) {
		this.posiX = posiX;
		this.posiY = posiY;
		this.largura = largura;
		this.altura = altura;

		try {
			imagemC = ImageIO.read(getURL(nomeArquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private URL getURL(String nomeArquivo) {
		URL url = null;

		try {
			url = this.getClass().getResource(nomeArquivo);
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		return url;
	}

	public Rectangle getBounds() {
		return new Rectangle(getPosiX(), getPosiY(), getLargura(), getAltura());
	}

	public int getPosiX() {
		return posiX;
	}

	public void setPosiX(int posiX) {
		this.posiX = posiX;
	}

	public int getPosiY() {
		return posiY;
	}

	public void setPosiY(int posiY) {
		this.posiY = posiY;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public BufferedImage getImagemC() {
		return imagemC;
	}

	public void setImagemC(BufferedImage imagemC) {
		this.imagemC = imagemC;
	}
}
