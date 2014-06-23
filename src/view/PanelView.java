package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import controller.ControlleurScrollBar;


public class PanelView extends JPanel{

	
	private Carte carteRegion;
	private viewPort espaceVue;
	
	public PanelView(String lienCarte)
	{
		espaceVue=new viewPort();
		ImageIcon imgCarte =new ImageIcon(lienCarte);
		carteRegion=new Carte(imgCarte);
		this.add(carteRegion);

	}

	public Carte getCarte() {
		
		return carteRegion;
	}

	public int resituerX(int minx) {
		
		return 0;
	}

	public int resituerY(int miny) {
		// TODO Auto-generated method stub
		return 0;
	}

	public viewPort getViewport() {
		
		return espaceVue;
	}

	public void deplacerCarte(int x, int y) {
		this.setAlignmentX(x);
		this.setAlignmentY(y);
		
	}

	public void ajouterEcouteurScrollBar(
			ControlleurScrollBar controlleur_scroll_bar) {
		// TODO Auto-generated method stub
		
	}
}
