package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

public class Carte extends JLabel {

	private int echelleTaille;
	private int hauteur;
	private int largeur;
	
	private float zoom;
	private float coefZoom;
	
	private String uniteDistance;
	private String doneePointProche;
	
	private Cursor curseur;
	
	private Color couleurItineraire;
	
	private JPopupMenu menu;
	
	private Point pointProche;
	
	private ArrayList<Point> ensemblePoint;
	
	private boolean pointUnique;
	
	public Carte(ImageIcon lienCarte)
	{
		this.setIcon(lienCarte);
		ensemblePoint=new ArrayList<Point>();
		System.out.println(lienCarte);
		menu=new JPopupMenu();
	
	}
	
	public void setTailleEchelle(int eCHELLE_TAILLE) 
	{
		echelleTaille=eCHELLE_TAILLE;
		
	}

	public void setEchelle(String convertirUniteDistance)
	{
		uniteDistance=convertirUniteDistance;
		
	}
	
	public void ajouterPoint(Point nodeCoords)
	{
		ensemblePoint.add(nodeCoords);
		
	}

	public void viderPoints() 
	{
		ensemblePoint.clear();
		
	}

	public void setTypePointUnique(boolean b) 
	{
		pointUnique=b;
		
	}


	public void setMaxUnitIncrement(float pourcentage_zoom) 
	{
		zoom=pourcentage_zoom;
		
	}

	public void setPointProche(Point point) 
	{
		pointProche=point;		
	}

	public void setCursor(Cursor cursor) 
	{
		curseur=cursor;
	}
	
	public void setItineraireCouleur(Color newColor)
	{
		couleurItineraire=newColor;
	}

	public Color getItineraireCouleur() 
	{
		return couleurItineraire;
	}

	

	public Point getPointProche() 
	{
		return pointProche;
	}



	public void ajouterDonneeAuPointProche(String string)
	{
		doneePointProche=string;
	}

	public void updateZoom(float pourcentage_zoom)
	{
		coefZoom=zoom/pourcentage_zoom;
		hauteur=(int) (this.getHeight()*coefZoom);
		largeur=(int)(this.getWidth()*coefZoom);
		
		this.setSize(largeur,hauteur);
	}

	public void afficherMenu() 
	{
		menu.setVisible(true);
		menu.setLocation(pointProche);
		menu.setLabel(doneePointProche);;
	}
	
	public void cacherMenu() 
	{
		
		menu.setVisible(false);
	}

	/*public void changerAntiAliasing() 
	{
		java.awt.Graphics2D g2 = (java.awt.Graphics2D);
		    RenderingHints rh = new RenderingHints(
		             RenderingHints.KEY_TEXT_ANTIALIASING,
		             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		    g2.setRenderingHints(rh);
	}*/

	public int getLargeur() {
		
		largeur=this.getWidth();
		return largeur;
	}

	public int getHauteur() {
		hauteur=this.getWidth();
		return hauteur;
	}

}
