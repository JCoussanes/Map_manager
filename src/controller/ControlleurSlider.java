package controller;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Application;

public class ControlleurSlider implements ChangeListener{

	private Application app;
	
	public ControlleurSlider(Application application) {
		app=application;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		JSlider source=(JSlider) e.getSource();	
		
		int value=1;
		float change=0;
		value=source.getValue();
		change=(float) ((value/100.0)-app.getZoom());
	
		if(!source.getValueIsAdjusting() && app.first==false){
			app.modifierZoom(change);
		}
		else
			app.first=false;
	}

}
