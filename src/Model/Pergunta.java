package Model;

import java.util.ArrayList;

public class Pergunta {
	String textoPergunta;
	String[] alternativas;
	int resposta;

	public Pergunta(String textoPergunta, String[] alternativas, int resposta) {
		this.textoPergunta = textoPergunta;
		this.alternativas = alternativas;
		this.resposta = resposta;
	}

	public boolean isCerto(int opcao) {
		if (opcao == resposta)
			return true;
		return false;
	}

	public String getTextoPergunta() {
		return textoPergunta;
	}

	public String[] getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
}
