package view;


import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Fenetre extends JFrame{

	public Fenetre(String lienCarte, String SYSTEME_UNITE)  {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		PanelControles PanneauControl = new PanelControles();
		getContentPane().add(PanneauControl, BorderLayout.WEST);
		PanneauControl.setLayout(new GridLayout(0, 1, 50, 0));
		
		JComboBox comboBox = new JComboBox();
		PanneauControl.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		PanneauControl.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		PanneauControl.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		PanneauControl.add(comboBox_3);
		
		JSlider slider = new JSlider();
		PanneauControl.add(slider);
		
		JButton boutonOk = new JButton("New button");
		PanneauControl.add(boutonOk);
		
		JButton boutonMoins = new JButton("New button");
		PanneauControl.add(boutonMoins);
		
		JButton boutonPlus = new JButton("New button");
		PanneauControl.add(boutonPlus);
		
		JButton boutonReel = new JButton("New button");
		PanneauControl.add(boutonReel);
		
		JButton boutonGlobal = new JButton("New button");
		PanneauControl.add(boutonGlobal);
		
		JButton boutonGrosPlan = new JButton("New button");
		PanneauControl.add(boutonGrosPlan);
		
		JPanel panneauVue = new JPanel();
		getContentPane().add(panneauVue, BorderLayout.CENTER);
		
	}

	public PanelControles getPanneauControles() {
		// TODO Auto-generated method stub
		return null;
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
