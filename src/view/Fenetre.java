package view;


import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Fenetre extends JFrame{
	PanelControles panneauControles;
	
	public Fenetre(String lienCarte, String SYSTEME_UNITE)  {
		getContentPane().setLayout(new BorderLayout(0, 0));
		setSize(720, 520);
		panneauControles=new PanelControles();
		getContentPane().add(panneauControles, BorderLayout.CENTER);
		setVisible(true);
		
	}

	public PanelControles getPanneauControles() {
		return panneauControles;
	}

	public PanelView getPanneauVue() {
		// TODO Auto-generated method stub
		return null;
	}

	public PanelInfo getPanneauInfos() {
		// TODO Auto-generated method stub
		return null;
	}

}
