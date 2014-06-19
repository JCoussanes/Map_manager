package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelView extends JPanel{
	
	private Carte carteRegion;
	private viewPort espaceVue;
	
	public PanelView(String lienCarte)
	{
		espaceVue=new viewPort();
		carteRegion=new Carte(lienCarte);
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

}
