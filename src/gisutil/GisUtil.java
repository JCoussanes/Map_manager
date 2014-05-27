package gisutil;

import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import application.*;

/**
 * Permet le calcul d'itin�raires optimises
 * @author
 * @version
 */
public class GisUtil {

  private Dijkstra dij;

  public GisUtil(Application a) {
    // R�f�rence sur les donn�es de l'application
    app = a;
    // SoS (Set of Streets) est le graphe des rues ou lignes de bus construit dans    
    // l'application
    SoS = app.ClDonne.ClDtSetOfStreets;
    // On construit une copie (optimis�e) du graphe dans Dijkstra
    dij = new Dijkstra();
    dij.init(SoS);
  }

  // Renvoie un vecteur des sommets (MyState) d�finissant le + court chemin
  // les id des sommets sont encapsul�s dans des objets MyState 
  // l'id est �gal � ((MyState)chemin.elementAt(i)).n
  public Vector chercheChemin(int p1, int p2) {
    Vector chemin;

    chemin = dij.solve(p1, p2);

    return chemin;
  }

  // Exemple de recherche des noms de rues ou noms de lignes de bus emprunt�es
  public Vector chercheCheminAndFindPlannifiedRoutes(int p1, int p2) {
    Vector chemin;

    chemin = chercheChemin(p1, p2);
    Vector streetsNames = new Vector(); // vecteur des noms de rues/lignes de bus
    String prec = new String();
    String current = new String();

    for (int i = 0; i < (chemin.size() - 1); i++) { // -1
      current = SoS.getStreetNameUsingEdge(((MyState) chemin.elementAt(i)).n,
                                               ((MyState) chemin.elementAt(i + 1)).n);

      if (current.length() > 0) {
        if (current.compareToIgnoreCase(prec) != 0)
          streetsNames.addElement(current);
      }
      prec = new String(current);
    }
    if (chemin.isEmpty()) {
      JOptionPane.showMessageDialog(app.ClGraph.ClBur,
                                    " Aucun chemin n'a pu etre trouve... ",
                                    "Chemin introuvable",
                                    JOptionPane.INFORMATION_MESSAGE);
    }
    else {
      app.ClGraph.ClBur.ClFrPlannifiedRoutes.addPlannifiedRoutes(streetsNames);
    }
    return chemin;
  }


}//GisUtil