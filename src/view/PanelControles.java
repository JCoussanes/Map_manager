package view;

import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

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

import view.PanelControles.jcbFlag;

public class PanelControles extends JPanel {
	public enum jcbFlag {BOTH, DEPART, ARRIVEE}

	JButton boutonMoins = new JButton("-");
	
	JSlider slider = new JSlider();
	
	JButton boutonPlus = new JButton("+");
	
	JComboBox rueDepart = new JComboBox();
	
	JComboBox rueArrive = new JComboBox();
	
	JButton boutonOk = new JButton("OK");
	
	JButton boutonReel = new JButton("Vue Réelle");
	
	JButton boutonGlobal = new JButton("Vue Globale");
	
	JButton boutonGrosPlan = new JButton("Gros plan");
	
	JComboBox villeDepart = new JComboBox();
	
	JComboBox villeArrive = new JComboBox();
	
	JLabel lblZoom = new JLabel("Zoom");
	
	JLabel lblVilleDeDpart = new JLabel("Ville de départ");
	
	JLabel lblRueDeDpart = new JLabel("Rue de départ");
	
	JLabel lblVilleDarrve = new JLabel("Ville d'arrvée");
	
	JLabel lblRueDarrive = new JLabel("Rue d'arrivée");
	public PanelControles(){
		
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

	public void ajouterVilleDansCombobox(String toutes) {
		// TODO Auto-generated method stub
		
	}

	public boolean villeDejaPresente(String ville) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSliderValue(int i) {
		// TODO Auto-generated method stub
		slider.setValue(i);
	}

	public void ajouterEcouteurAuBoutonOk(ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonOk.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomMoins(
			ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonMoins.addActionListener(controlleur_boutons);
		
	}

	public void ajouterEcouteurAuBoutonZoomPlus(
			ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonPlus.addActionListener(controlleur_boutons);
		
	}

	public void ajouterEcouteurAuBoutonZoomReel(
			ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonReel.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomGlobal(
			ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonGlobal.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuBoutonZoomGrosPlan(
			ControlleurBoutons controlleur_boutons) {
		// TODO Auto-generated method stub
		boutonGrosPlan.addActionListener(controlleur_boutons);
	}

	public void ajouterEcouteurAuSlider(ControlleurSlider controlleur_slider) {
		// TODO Auto-generated method stub
		slider.addChangeListener(controlleur_slider);
	}

	public void ajouterEcouteurVilleDepart(
			ControlleurComboBox controlleur_combo_box) {
		// TODO Auto-generated method stub
		villeDepart.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurVilleArrivee(
			ControlleurComboBox controlleur_combo_box) {
		// TODO Auto-generated method stub
		villeArrive.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurRueDepart(
			ControlleurComboBox controlleur_combo_box) {
		// TODO Auto-generated method stub
		rueDepart.addActionListener(controlleur_combo_box);
	}

	public void ajouterEcouteurRueArrivee(
			ControlleurComboBox controlleur_combo_box) {
		// TODO Auto-generated method stub
		rueArrive.addActionListener(controlleur_combo_box);
	}

	public int getNumPoint(jcbFlag depart) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNomVille(jcbFlag flag) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPoints(jcbFlag flag, Vector<Integer> liste_points) {
		// TODO Auto-generated method stub
		
	}

	public String getNomRoute(jcbFlag flag) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterRouteDansCombobox(String string, jcbFlag flag) {
		// TODO Auto-generated method stub
		
	}

	public void viderRueComboBox(jcbFlag flag) {
		// TODO Auto-generated method stub
		
	}

}
