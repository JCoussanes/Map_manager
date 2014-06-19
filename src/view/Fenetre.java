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
	
	private PanelControles panneauControl;
	private PanelView panneauVue;
	private PanelInfo panneauInfo;

	public Fenetre(String lienCarte, String SYSTEME_UNITE)  {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		panneauControl = new PanelControles();
		getContentPane().add(panneauControl, BorderLayout.WEST);
		panneauControl.setLayout(new GridLayout(0, 1, 50, 0));
		
		panneauVue = new PanelView(lienCarte);
		getContentPane().add(panneauVue, BorderLayout.CENTER);
		
		panneauInfo = new PanelInfo();
		getContentPane().add(panneauInfo, BorderLayout.EAST);
		
		
	}

	public PanelControles getPanneauControles() 
	{
		return panneauControl ;
		
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
		String lienCarte = "toto";
		Fenetre fenetre = new Fenetre(lienCarte, SYSTEME_UNITE);
		fenetre.setVisible(true);
	}
}
