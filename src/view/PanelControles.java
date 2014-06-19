package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class PanelControles extends JPanel {
	
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	
	private JSlider slider;
	
	private JButton boutonOk;
	private JButton boutonMoins;
	private JButton boutonPlus;
	private JButton boutonReel;
	private JButton boutonGlobal;
	private JButton boutonGrosPlan;
	
	public PanelControles()
	{
		comboBox= new JComboBox();
		this.add(comboBox);
		
		comboBox_1 = new JComboBox();
		this.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		this.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		this.add(comboBox_3);
		
		slider = new JSlider();
		this.add(slider);
		
		boutonOk = new JButton("New button");
		this.add(boutonOk);
		
		boutonMoins = new JButton("New button");
		this.add(boutonMoins);
		
		boutonPlus = new JButton("New button");
		this.add(boutonPlus);
		
		boutonReel = new JButton("New button");
		this.add(boutonReel);
		
		boutonGlobal = new JButton("New button");
		this.add(boutonGlobal);
		
		boutonGrosPlan = new JButton("New button");
		this.add(boutonGrosPlan);
		
	}

	public void setIconZoomMoins(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}

	public void setIconZoomPlus(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}

	public void ajouterVilleDansCombobox(String toutes) {
		// TODO Auto-generated method stub
		
	}

	public boolean villeDejaPresente(String ville) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSliderValue(int i) {
		// TODO Auto-generated method stub
		
	}

}
