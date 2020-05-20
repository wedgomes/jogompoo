package Controller;

import Model.Som;
import View.InformativoPterodactilo;
import View.InformativoRex;
import View.InformativoStegossauru;
import View.InformativoTitanossauro;

public class ControleGeral {

	private static Som som;

	public ControleGeral() {
		som = new Som();

		new ControleMenu().control1();
		new ControleTelaTutorial1().control2();
		new ControleTelaTutorial2().control2();
		new ControleTelaTutorial3().control2();
		new ControleCredito().controlCredito();
		new ControleTelaJogador();
		
	//	new ControleCriarPergunta();
		
		new ControleCorredor();

		new ControleSala1(ControleCorredor.getCorredor().getPersonagem());
		new ControleInfo1(new InformativoStegossauru()).contInfo1();
		new ControleInfo2(new InformativoTitanossauro()).contInfo2();
		new ControleSala2(ControleCorredor.getCorredor().getPersonagem());
		new ControleInfo3(new InformativoPterodactilo()).contInfo3();
		new ControleInfo4(new InformativoRex()).contInfo4();

		
		
//		int num = (int) (Math.random()*10);
//		ArrayList<Pergunta> perguntas = LeitorTXT.leitor();
//
//		new ControleTelaPergunta(new TelaPergunta(perguntas.get(num)));
	}

	public static Som getSom() {
		return som;
	}
}
