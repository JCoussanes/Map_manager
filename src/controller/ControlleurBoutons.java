package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class ControlleurBoutons implements ActionListener{
	
	private Application app;

	public ControlleurBoutons(Application application) {
		app=application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source==boutonOk){app.lireComboboxPourRechercheItineraire();}
		else if(source==boutonMoins){app.modifierZoom(Application.CRAN_ZOOM_MOINS);}
		else if(source==boutonPlus){app.modifierZoom(Application.CRAN_ZOOM_PLUS);}
		else if(source==boutonReel){app.modifierZoom(Application.RETOUR_ZOOM_INITIAL);}
		else if(source==boutonGlobal){app.determinerZoomGlobal();}
		else if(source==boutonGrosPlan){app.modifierZoom(Application.ZOOM_MAX);}
			
		
	}
}
