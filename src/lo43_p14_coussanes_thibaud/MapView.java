package lo43_p14_coussanes_thibaud;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapView extends JPanel {
	
	public MapView()
	{
		ImageIcon map_image = new ImageIcon(".\\image\\region_belfort_routes_fleuves_habitats.gif");
		JLabel map =new JLabel();
		map.setIcon(map_image);
		
		this.add(map);
		this.setVisible(true);
		this.repaint();
		
		
		
	}

}
