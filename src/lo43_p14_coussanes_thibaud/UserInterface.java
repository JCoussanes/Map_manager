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

public class UserInterface extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	public UserInterface() {
		
		this.setTitle("Games Collection");
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
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("200px"),},
			new RowSpec[] {
				FormFactory.NARROW_LINE_GAP_ROWSPEC,
				RowSpec.decode("22px"),
				RowSpec.decode("25px"),
				RowSpec.decode("27px"),
				RowSpec.decode("25px"),
				RowSpec.decode("25px"),
				RowSpec.decode("42px"),
				RowSpec.decode("121px:grow"),
				RowSpec.decode("23px"),
				RowSpec.decode("21px"),}));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel, "1, 3, fill, fill");
		
		textField = new JTextField();
		panel.add(textField, "1, 4, fill, fill");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1, "1, 5, fill, fill");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "1, 6, fill, fill");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, "1, 7, center, center");
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		panel.add(textArea, "1, 8, fill, fill");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2, "1, 9, fill, fill");
		
		JSlider slider = new JSlider();
		panel.add(slider, "1, 10, fill, fill");
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui=new UserInterface();
	}

}
