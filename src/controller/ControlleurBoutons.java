package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.*;

public class ControlleurBoutons implements ActionListener{
	
	private Application app;

	public ControlleurBoutons(Application application) {
		app=application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		if(source.getName()=="boutonOk"){
			app.lireComboboxPourRechercheItineraire();
		}
		else if(source.getName()=="boutonMoins"){
			app.modifierZoom(Application.CRAN_ZOOM_MOINS);
		}
		else if(source.getName()=="boutonPlus"){
			app.modifierZoom(Application.CRAN_ZOOM_PLUS);
		}
		else if(source.getName()=="boutonReel"){
			app.modifierZoom(Application.RETOUR_ZOOM_INITIAL);
		}
		else if(source.getName()=="boutonGlobal"){
			app.determinerZoomGlobal();
		}
		else if(source.getName()=="boutonGrosPlan"){
			app.modifierZoom(Application.ZOOM_MAX);
		}
			
		
	}
}
