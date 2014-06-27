package view;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;

import controller.ControlleurCarte;
import controller.ControlleurMenuContextuel;

import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

public class Carte extends JLabel {

	private int echelleTaille;
	private int hauteur;
	private int largeur;
	private float x;
	private float y;
	
	
	private float zoom;
	private float coefZoom;
	
	private String uniteDistance;
	private String doneePointProche;
	
	private Cursor curseur;
	
	private Color couleurItineraire;
	
	private JPopupMenu menu;
	
	private Point pointProche;
	
	private ArrayList<Point> trajet;
	
	private boolean pointUnique,drawPath;
	
	private Icon map;
	
	private String lien;
	
	public Carte(String lienCarte)
	{
		zoom=(float) 0.5;
		lien=lienCarte;
		map=new ImageIcon(lien);
		trajet=new ArrayList<Point>();
		menu=new JPopupMenu();
		hauteur=(int) ((float)map.getIconHeight()*zoom);
		largeur=(int)((float)map.getIconWidth()*zoom);
		Icon icon = new ImageIcon(new ImageIcon(lien).getImage().getScaledInstance((int)(largeur), (int)(hauteur), Image.SCALE_DEFAULT));
		this.setIcon(icon);
	
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
		trajet.add(nodeCoords);
		
	}

	public void viderPoints() 
	{
		trajet.clear();
		drawPath=false;
		
	}

	public void setTypePointUnique(boolean b) 
	{
		pointUnique=b;
		
	}


	public void setMaxUnitIncrement(float pourcentage_zoom) 
	{
		coefZoom=pourcentage_zoom;
		
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

	/*public void updateZoom(float pourcentage_zoom)
	{
		hauteur=(int) ((float)map.getIconHeight()*pourcentage_zoom);
		largeur=(int)((float)map.getIconWidth()*pourcentage_zoom);
		Icon icon = new ImageIcon(new ImageIcon(lien).getImage().getScaledInstance((int)(largeur), (int)(hauteur), Image.SCALE_DEFAULT));
		this.setIcon(icon);
		this.repaint();
		
	}*/

	public int getLargeur() {
		
		largeur=this.getWidth();
		return largeur;
	}

	public int getHauteur() {
		hauteur=this.getWidth();
		return hauteur;
	}

	public void ajouterEcouteurMenu(
			ControlleurMenuContextuel controlleur_menu_contextuel) {
		// TODO Auto-generated method stub
		
	}

	public void ajouterEcouteurCarte(ControlleurCarte controlleur_carte) {
		// TODO Auto-generated method stub
		
	}
	
	//surcharge de la fonction paint pour dessiner tous les elements de la carte
		public void paint(Graphics g){
			Graphics2D graph = (Graphics2D)g;

			//appliquer le zoom sur le graphique
			graph.scale(zoom, zoom);
			
			//dessiner la carte
			map.paintIcon(this, graph, 0, 0);
			//graph.drawImage(map.getImage(), 0, 0, this);
			if(drawPath)
				dessinerTrajet(graph);
		
		}
		
		public void drawPath(){
			drawPath=true;
		}

		//dessiner le trajet sur un graphic
		private void dessinerTrajet(Graphics2D graph){
			for(int i=1;i<trajet.size();i++){
				Point pt1=trajet.get(i-1);
				Point pt2=trajet.get(i);
				graph.setStroke(new BasicStroke(5));
				graph.setColor(Color.RED);
				graph.drawLine((int)pt1.getX(), (int)pt1.getY(), (int)pt2.getX(), (int)pt2.getY());
			}
			
		}
		
		//changer le zoom sur la carte
		public void updateZoom(float _zoom) {
			zoom=(float) _zoom;
			largeur=(int)(map.getIconWidth()*zoom);
			hauteur=(int)(map.getIconHeight()*zoom);
			this.setSize(largeur, hauteur);
			this.setPreferredSize(new Dimension(largeur, hauteur));
			repaint();
		}

		public float getZoom() {
			// TODO Auto-generated method stub
			return zoom;
		}

}
