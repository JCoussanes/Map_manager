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
	private JTextField textField;
	private JTextField textField_1;
	public UserInterface() {
		
		this.setTitle("Map manager");
	    this.setSize(720, 520);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JMenuBar menuBar = new JMenuBar();
	    getContentPane().add(menuBar, BorderLayout.NORTH);
	    
	    JMenu mnFichier = new JMenu("Fichier");
	    menuBar.add(mnFichier);
	    
	    JMenuItem mntmNewMenuItem = new JMenuItem("patate");
	    mnFichier.add(mntmNewMenuItem);
	    
	    JMenuItem mntmNewMenuItem_1 = new JMenuItem("tomate");
	    mnFichier.add(mntmNewMenuItem_1);
	    
	    JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
	    mnFichier.add(mntmNewMenuItem_2);
	    
	    JMenu mnAide = new JMenu("Aide");
	    menuBar.add(mnAide);
	    
	    JMenuItem mntmAide = new JMenuItem("aide ");
	    mnAide.add(mntmAide);
		
	    JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[31.00px][78.00px]", "[27.00px][27.00px][29.00px][26.00px][27.00px][201.00px,grow][26.00px][20.00px][33.00px]"));
		
		JLabel lblNewLabel = new JLabel("Départ");
		panel.add(lblNewLabel, "cell 0 0 2 1");
		
		textField = new JTextField();
		panel.add(textField, "cell 0 1 2 1,growx,aligny center");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Arrivée");
		panel.add(lblNewLabel_1, "cell 0 2 2 1");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 0 3 2 1,growx,aligny center");
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calculer");
		panel.add(btnNewButton_1, "cell 0 4 2 1,alignx center,aligny center");
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		panel.add(textArea, "cell 0 5 2 1,grow");
		
		JLabel lblNewLabel_2 = new JLabel("100%");
		panel.add(lblNewLabel_2, "cell 0 6 2 1");
		
		JSlider slider = new JSlider();
		panel.add(slider, "cell 0 7 2 1");
		
		JButton btnNewButton = new JButton("Réelle");
		panel.add(btnNewButton, "cell 0 8,alignx center,aligny center");
		
		JButton btnNewButton_2 = new JButton("Globale");
		panel.add(btnNewButton_2, "cell 1 8,alignx center,aligny center");
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_8 = new JLabel("");
		panel_1.add(label_8);
		
		JLabel label_5 = new JLabel("");
		panel_1.add(label_5);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui=new UserInterface();
	}
}
