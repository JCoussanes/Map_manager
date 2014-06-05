package controller;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import model.Application;

public class ControlleurScrollBar implements AdjustmentListener{

	private Application app;
	public ControlleurScrollBar(Application application) {
		app=application;
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Object source = e.getSource();
		
		
	}

}
