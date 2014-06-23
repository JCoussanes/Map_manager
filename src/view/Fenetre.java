package view;


import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Fenetre extends JFrame{


	private static final String SYSTEME_UNITE = null;
	
	private PanelControles panneauControles;
	private PanelView panneauVue;
	private PanelInfo panneauInfo;

	public Fenetre(String lienCarte, String SYSTEME_UNITE)  {
		getContentPane().setLayout(new BorderLayout(0, 0));
		setSize(720, 520);
		
		panneauControles = new PanelControles();
		getContentPane().add(panneauControles, BorderLayout.SOUTH);
		
		panneauVue = new PanelView(lienCarte);
		getContentPane().add(panneauVue, BorderLayout.CENTER);
		
		panneauInfo = new PanelInfo();
		getContentPane().add(panneauInfo, BorderLayout.EAST);
		
		setVisible(true);
		
		
	}

	public PanelControles getPanneauControles() 
	{
		return panneauControles ;
		
	}

	public PanelView getPanneauVue() 
	{		
		return panneauVue;
	}

	public PanelInfo getPanneauInfos() 
	{
		return panneauInfo;
	}
	
	public static void main(String args[])
	{
		String lienCarte = "region_belfort_routes_fleuves_habitats.gif";
		Fenetre fenetre = new Fenetre(lienCarte, SYSTEME_UNITE);
		fenetre.setVisible(true);
	}
}
