package Model;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Personagem extends Entidade {

	private BufferedImage[] sprites;
	private int linhas, colunas;
	private int aparencia;
	private int velocidade = 5;
	private int up, left, right;
	private String novaImagem;

	public Personagem(String nomeArquivo, int posiX, int posiY, int largura,
			int altura, int linhas, int colunas, int aparencia) {
		super(nomeArquivo, posiX, posiY, largura, altura);

		this.linhas = linhas;
		this.colunas = colunas;
		this.aparencia = aparencia;
		
		nomeArquivo = getNovaImagem();
		
		try {
			recortarImagem(colunas, linhas, largura, altura);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public void recortarImagem(int colunas, int linhas, int largura, int altura)
			throws IOException {

		sprites = new BufferedImage[colunas * linhas];

		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				sprites[(i * linhas) + j] = getImagemC().getSubimage(
						i * largura, j * altura, largura, altura);
			}
		}
	}

	public void andarLefth() {
		this.setPosiX(this.getPosiX() - velocidade*2);

		switch (left) {
		case 0:
			setAparencia(1);
			break;
		case 1:
			setAparencia(5);
			break;
		case 2:
			setAparencia(9);
			break;
		case 3:
			setAparencia(13);
			break;
		}

		if (this.left == 3) {
			setLeft(0);
		} else {
			setLeft(this.left += 1);
		}
	}

	public void andarRigth() {
		setPosiX(this.getPosiX() + velocidade*2);

		switch (this.right) {
		case 0:
			setAparencia(2);
			break;
		case 1:
			setAparencia(6);
			break;
		case 2:
			setAparencia(10);
			break;
		case 3:
			setAparencia(14);
			break;
		}

		if (this.right == 3) {
			setRight(0);
		} else {
			setRight(this.right += 1);
		}
	}

	public void andarUp() {
		switch (up) {
		case 0:
			setAparencia(3);
			break;
		case 1:
			setAparencia(7);
			break;
		case 2:
			setAparencia(11);
			break;
		case 3:
			setAparencia(15);
			break;
		}
	}

	public BufferedImage[] getSprites() {
		return sprites;
	}

	public void setSprites(BufferedImage[] sprites) {
		this.sprites = sprites;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public int getAparencia() {
		return aparencia;
	}

	public void setAparencia(int aparencia) {
		this.aparencia = aparencia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public String getNovaImagem() {
		return novaImagem;
	}

	public void setNovaImagem(String novaImagem) {
		this.novaImagem = novaImagem;
	}
}