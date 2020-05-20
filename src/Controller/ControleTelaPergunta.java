package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import Model.Backup;
import Model.LeitorTXT;
import Model.Pergunta;
import View.TelaPergunta;

public class ControleTelaPergunta {

	private static TelaPergunta tela;
//	private static Relogio relogio;
	private String nome = ControleTelaJogador.getTelaJogador().getNomeField().getText();
	private int cont = 0;
	
	
	public ControleTelaPergunta(TelaPergunta tela) {
		this.tela = tela;
		
//		relogio = new Relogio();
//		tela.getTempoLabel().setText("" + relogio);


		for (int i = 0; i < tela.NUMERO_DE_ALTERNATIVAS; i++) {
			auxiliar(i);
		}
		

		tela.getSairLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == tela.getSairLabel()) {
//					System.exit(0);
	//				relogio.suspend();
					tela.setVisible(false);
					ControleCorredor.getCorredor().setVisible(true);
				}
			}
		});
		
		tela.getComprarLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == tela.getComprarLabel() && tela.getAcerto() > 0) {
					getTela().setAcerto(-1);
					cont++;
					
					switch(cont) {
					case 1: ControleInfo1.getInfoStego().setVisible(true);
							break;
					case 2: ControleInfo2.getInfoTita().setVisible(true);
							break;
					case 3: ControleInfo3.getInfoPiter().setVisible(true);
							break;
					case 4: ControleInfo4.getInfoRex().setVisible(true);
							cont=0;
							break;
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Você não tem pontos\nPara trocar por informações!");
				}
			}
		});
	}

	private void auxiliar(int i) {
		getTela().getOpções()[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getTela().getPergunta().isCerto(i + 1)) {

					getTela().setAcerto(1);
					
					int num = (int) (Math.random() * 11);
					ArrayList<Pergunta> perguntas = LeitorTXT.leitor();

					tela.atualizar(perguntas.get(num));
				} else {
					getTela().setErrou(1);
				}
				verificarAcerto();
			}
		});
		
	}

	public void verificarAcerto() {
		if (getTela().getErrou() == 3 && getTela().getErrou() < 7) {
			Backup.salvarXML();
			JOptionPane.showMessageDialog(null, "Que pena! "+nome+"\n Você Perdeu");
//			tela.setVisible(false);
//			tela.dispose();
		//	tela = null;
			
			System.exit(0);
			
			//ControleMenu.getMenu().setVisible(true);
		}
		if (getTela().getAcerto() == 10) {
			Backup.salvarXML();
//			relogio.stop();
			
			JOptionPane.showMessageDialog(null, "PARABÉNS! "+nome+"\n ACERTOU OS "+getTela().getAcerto()+" PONTOS \n");
			System.exit(0);
//			tela.setVisible(false);
//			ControleTelaJogador.getTelaJogador().getNomeField().setText("");
//			ControleTelaJogador.getTelaJogador().getBg().clearSelection();
//			
//			ControleCorredor.getCorredor().getPorta2().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
//			ControleCorredor.getCorredor().getPorta3().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
//			
//			tela.dispose();
		//	tela = null;
	//		tela.setVisible(false);
			ControleMenu.getMenu().setVisible(true);
		}
	}

//	public class Relogio extends Thread {
//		int tempo;
//
//		public void run() {
//			for (tempo = 60; tempo >= 0; tempo--) {
//				getTela().getTempoLabel().setText("" + tempo);
//
//				try {
//					sleep(1000);
//					if (tempo == 0) {
//						JOptionPane.showMessageDialog(null, "Tempo Acabou!");
//						Backup.salvarXML();
//						System.exit(0);
//						break;
//					}
//				} catch (InterruptedException e) {
//					System.out.println("ERRO: " + e.getMessage());
//				}
//			}
//		}
//	}

	public static TelaPergunta getTela() {
		return tela;
	}

//	public static Relogio getRelogio() {
//		return relogio;
//	}
	
	
}