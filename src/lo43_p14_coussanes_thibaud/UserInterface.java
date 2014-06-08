package lo43_p14_coussanes_thibaud;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class UserInterface extends JFrame{
	private JTextField strStart;
	private JTextField strEnd;
	private JPanel container;
	
	public UserInterface() {
		
		//Initialization relative to the window
		container=new JPanel();
		this.setTitle("Map manager");
	    this.setSize(720, 520);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setContentPane(container);
	    container.setLayout(new BorderLayout(0, 0));
	    
	    //Creation of every part of the user interface
	    	//Menu bar
	    JMenuBar menuBar = new JMenuBar();
	    JMenu mnFile = new JMenu("Fichier");
	    JMenuItem importXML = new JMenuItem("Importer XML");
	    JMenuItem exportXML = new JMenuItem("Exporter XML");
	    JMenuItem quit = new JMenuItem("Quiter");
	    JMenu mnHelp = new JMenu("Aide");
	    JMenuItem help = new JMenuItem("Aide à l'utilistation");
	    	//Information panel
	    JPanel infoPanel = new JPanel();
	    JLabel lStart = new JLabel("Départ");
	    JLabel lEnd = new JLabel("Arrivée");
	    strStart = new JTextField();
	    strEnd = new JTextField();
	    JButton btnCalculate = new JButton("Calculer");
	    JTextArea mapInformation = new JTextArea();
	    JLabel lZoom = new JLabel("100%");
	    JSlider slidZoom = new JSlider();
	    JButton btnTrue = new JButton("Réelle");
	    JButton btnGlobal = new JButton("Globale");
	    	//Map view panel
	    MapView mapPanel = new MapView();
	    
	    
	    //Graphic interface element settings
	    	//Menu bar
	    container.add(menuBar, BorderLayout.NORTH);  
	    menuBar.add(mnFile);	    
	    mnFile.add(importXML);	    
	    mnFile.add(exportXML);
	    mnFile.add(quit);
	    menuBar.add(mnHelp);
	    mnHelp.add(help);
	    	//Information panel
		container.add(infoPanel, BorderLayout.WEST);
		infoPanel.setLayout(new MigLayout("", "[31.00px][78.00px]", "[27.00px][27.00px][29.00px][26.00px][27.00px][201.00px,grow][26.00px][20.00px][33.00px]"));
		infoPanel.add(lStart, "cell 0 0 2 1");
		infoPanel.add(strStart, "cell 0 1 2 1,growx,aligny center");
		strStart.setColumns(10);
		infoPanel.add(lEnd, "cell 0 2 2 1");
		infoPanel.add(strEnd, "cell 0 3 2 1,growx,aligny center");
		strEnd.setColumns(10);
		infoPanel.add(btnCalculate, "cell 0 4 2 1,alignx center,aligny center");
		mapInformation.setEditable(false);
		infoPanel.add(mapInformation, "cell 0 5 2 1,grow");
		infoPanel.add(lZoom, "cell 0 6 2 1");	
		infoPanel.add(slidZoom, "cell 0 7 2 1");
		infoPanel.add(btnTrue, "cell 0 8,alignx center,aligny center");
		infoPanel.add(btnGlobal, "cell 1 8,alignx center,aligny center");
			//Map view panel
		container.add(mapPanel);
		mapPanel.setLayout(new GridLayout(0, 1, 0, 0));

		//Set the full interface visible
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui=new UserInterface();
	}
}
