package view;

import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSlider;

import controller.ControlleurBoutons;
import controller.ControlleurComboBox;
import controller.ControlleurSlider;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class PanelControles extends JPanel {

	public enum jcbFlag {BOTH, DEPART, ARRIVEE}

	private JButton boutonMoins = new JButton("-");
	private JSlider slider = new JSlider();
	private JButton boutonPlus = new JButton("+");
	private JComboBox rueDepart = new JComboBox();
	private JComboBox rueArrive = new JComboBox();
	private JButton boutonOk = new JButton("OK");
	private JButton boutonReel = new JButton("Vue Réelle");
	private JButton boutonGlobal = new JButton("Vue Globale");
	private JButton boutonGrosPlan = new JButton("Gros plan");
	private JComboBox villeDepart = new JComboBox();
	private JComboBox villeArrive = new JComboBox();
	private JLabel lblZoom = new JLabel("Zoom");
	private JLabel lblVilleDeDpart = new JLabel("Ville de départ");
	private JLabel lblRueDeDpart = new JLabel("Rue de départ");
	private JLabel lblVilleDarrve = new JLabel("Ville d'arrvée");
	private JLabel lblRueDarrive = new JLabel("Rue d'arrivée");
	
	private Vector<Integer> stPoints, enPoints; 

	public PanelControles(){
		boutonMoins.setName("boutonMoins");
		slider.setName("slider");
		boutonPlus.setName("boutonPlus");
		rueDepart.setName("rueDepart");
		rueArrive.setName("rueArrive");
		boutonOk.setName("boutonOk");
		boutonReel.setName("boutonReel");
		boutonGlobal.setName("boutonGlobal");
		boutonGrosPlan.setName("boutonGrosPlan");
		villeDepart.setName("villeDepart");
		villeArrive.setName("villeArrive");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(boutonMoins)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(boutonPlus))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(boutonReel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(boutonGlobal)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(boutonGrosPlan))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(161)
							.addComponent(lblZoom)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(villeDepart, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblVilleDeDpart)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(boutonOk, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
									.addComponent(villeArrive, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
							.addGap(0)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRueDeDpart)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(rueDepart, 0, 161, Short.MAX_VALUE)
											.addComponent(lblRueDarrive, Alignment.LEADING))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(rueArrive, 0, 168, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblVilleDarrve)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVilleDeDpart)
								.addComponent(lblRueDeDpart))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(villeDepart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(rueDepart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblRueDarrive)
							.addGap(5))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblZoom)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(boutonPlus)
									.addComponent(lblVilleDarrve))
								.addComponent(boutonMoins)
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(boutonReel)
								.addComponent(boutonGlobal)
								.addComponent(boutonGrosPlan)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(villeArrive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(rueArrive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(boutonOk)))
					.addGap(27))
		);
		setLayout(groupLayout);	
	

	}

	public void setIconZoomMoins(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}

	public void setIconZoomPlus(ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		
	}

	public void ajouterVilleDansCombobox(String ville) {
		
		villeDepart.addItem(ville);
		villeArrive.addItem(ville);
	}

	public boolean villeDejaPresente(String str) {
		boolean res=false;
		String tmp;
		for(int i=0; i<villeDepart.getItemCount(); i++){
			tmp=(String) villeDepart.getItemAt(i);
			if(str.equalsIgnoreCase(tmp))
				res=true;
		}
		return res;
	}

	public void setSliderValue(int i) {

		slider.setValue(i);
	}

	public void ajouterEcouteurAuBoutonOk(ControlleurBoutons controlleur_boutons) {

		boutonOk.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomMoins(
			ControlleurBoutons controlleur_boutons) {

		boutonMoins.addActionListener(controlleur_boutons);
		
	}

	public void ajouterEcouteurAuBoutonZoomPlus(
			ControlleurBoutons controlleur_boutons) {

		boutonPlus.addActionListener(controlleur_boutons);
		
	}

	public void ajouterEcouteurAuBoutonZoomReel(
			ControlleurBoutons controlleur_boutons) {

		boutonReel.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomGlobal(
			ControlleurBoutons controlleur_boutons) {

		boutonGlobal.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomGrosPlan(
			ControlleurBoutons controlleur_boutons) {

		boutonGrosPlan.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuSlider(ControlleurSlider controlleur_slider) {

		slider.addChangeListener(controlleur_slider);
	}

	public void ajouterEcouteurVilleDepart(
			ControlleurComboBox controlleur_combo_box) {

		villeDepart.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurVilleArrivee(
			ControlleurComboBox controlleur_combo_box) {

		villeArrive.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurRueDepart(
			ControlleurComboBox controlleur_combo_box) {

		rueDepart.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurRueArrivee(
			ControlleurComboBox controlleur_combo_box) {

		rueArrive.addActionListener(controlleur_combo_box);
	}

	public int getNumPoint(jcbFlag flag) {

		if(flag==jcbFlag.DEPART)
			return stPoints.get(0);
		else if(flag==jcbFlag.ARRIVEE)
			return enPoints.get(1);
		return 0;
	}

	public String getNomVille(jcbFlag flag) {

		if(flag==jcbFlag.DEPART)
			return (String) villeDepart.getSelectedItem();
		else if(flag==jcbFlag.ARRIVEE)
			return (String)villeArrive.getSelectedItem();
		return null;
	}

	public void setPoints(jcbFlag flag, Vector<Integer> liste_points) {

		if(flag==jcbFlag.DEPART)
			stPoints=liste_points;
		else if(flag==jcbFlag.ARRIVEE)
			enPoints=liste_points;
	}

	public String getNomRoute(jcbFlag flag) {

		switch(flag){
		case DEPART:
			return (String) rueDepart.getSelectedItem();
		case ARRIVEE:
			return (String) rueArrive.getSelectedItem();
		default:
			return null;
		}
	}

	public void ajouterRouteDansCombobox(String rue, jcbFlag flag) {
		
		switch(flag){
			case DEPART:
				rueDepart.addItem(rue);
				
				break;
			case ARRIVEE:
				rueArrive.addItem(rue);
				break;
			case BOTH:
				rueDepart.addItem(rue);
				rueArrive.addItem(rue);
				break;
		}
	}

	public void viderRueComboBox(jcbFlag flag) {
		
		switch(flag){
		case DEPART:
			rueDepart.removeAllItems();			
			break;
		case ARRIVEE:
			rueArrive.removeAllItems();
			break;
		case BOTH:
			rueDepart.removeAllItems();
			rueArrive.removeAllItems();
			break;
		}
	}
	
	
}
