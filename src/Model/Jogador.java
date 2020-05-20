package Model;

public class Jogador {

	private String nome;
	private int pontos;
	
	public Jogador(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}	
}
