package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import view.PanelControles.jcbFlag;
import model.Application;
import model.Application.rueFlag;

public class ControlleurComboBox implements ActionListener{
	
	private Application app;

	public ControlleurComboBox(Application application) {
		app=application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox source=(JComboBox) e.getSource();
		
		if(source.getName()=="villeDepart")
			app.remplirListesRoutes((String) source.getSelectedItem(), jcbFlag.DEPART);
		else if(source.getName()=="villeArrive")
			app.remplirListesRoutes((String) source.getSelectedItem(), jcbFlag.ARRIVEE);
		else if(source.getName()=="rueDepart")
			app.remplirListePoints(jcbFlag.DEPART);
		else if(source.getName()=="rueArrive")
			app.remplirListePoints(jcbFlag.ARRIVEE);
		
	}

}
