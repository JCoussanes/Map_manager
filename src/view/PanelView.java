package view;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.ControlleurScrollBar;


public class PanelView extends JScrollPane{

	
	private Carte carteRegion;
	
	public PanelView(String lienCarte)
	{
	
		
		carteRegion=new Carte(lienCarte);
		this.getViewport().add(carteRegion);

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


	public void deplacerCarte(int x, int y) {
		this.getViewport().setViewPosition(new Point(x,y));
		
	}

	public void ajouterEcouteurScrollBar(
			ControlleurScrollBar controlleur_scroll_bar) {
		// TODO Auto-generated method stub
		
	}
}
