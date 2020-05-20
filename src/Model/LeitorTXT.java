package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LeitorTXT {
	public final static int NUMERO_DE_ALTERNATIVAS = 3;

	public static ArrayList<Pergunta> leitor() {
		ArrayList<Pergunta> perguntaTemporaria = new ArrayList<Pergunta>();

		try {
			BufferedReader arquivo = new BufferedReader(new FileReader(new File("perguntas.txt")));

			String textoPergunta = arquivo.readLine();// =br.readLine();
			int resposta;

			while (textoPergunta != null) {
				String[] alternativas = new String[NUMERO_DE_ALTERNATIVAS];
				for (int i = 0; i < NUMERO_DE_ALTERNATIVAS; i++)
					alternativas[i] = arquivo.readLine();

				resposta = Integer.parseInt(arquivo.readLine());

				perguntaTemporaria.add(new Pergunta(textoPergunta, alternativas, resposta));

				arquivo.readLine(); // PULA LINHA
				textoPergunta = arquivo.readLine();
			}

			arquivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return perguntaTemporaria;
	}
}
