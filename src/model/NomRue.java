package model;

import java.util.regex.*;
import java.lang.Character;

public class NomRue extends Object{

	String nom;
	
	// Format d�finissant les routes non ville ( A36, E54 etc...)
	Pattern autoroutePattern = Pattern.compile(".*A(\\d)+.*");
	Pattern europeennePattern = Pattern.compile(".*E(\\d)+.*");
	Pattern nationalePattern = Pattern.compile(".*N(\\d)+.*");
	Pattern departementalePattern = Pattern.compile(".*D(\\d)+.*");
	
	
	public NomRue(Object oNom){
		super();
		nom = oNom.toString();
	}
	
	public boolean estUneAutoroute(){
		Matcher m = autoroutePattern.matcher(nom);
		return m.matches();
	}
	
	public boolean estUneEuropeenne(){
		Matcher m = europeennePattern.matcher(nom);
		return m.matches();
	}
	
	public boolean estUneNationale(){
		Matcher m = nationalePattern.matcher(nom);
		return m.matches();
	}
	
	public boolean estUneDepartementale(){
		Matcher m = departementalePattern.matcher(nom);
		return m.matches();
	}
	
	public boolean estUneVille(){
		return (!estUneAutoroute() && !estUneEuropeenne() && !estUneNationale() && !estUneDepartementale());
	}
	
	// Extrait la ville du nom de la route ( "ville - nomRoute" )
	public String extraireNomVille(){
		String nomVille = new String(nom);
		int indice = nomVille.indexOf('-');			
			
		// Si un '-' est trouv�, on ne prend que ce qui viens avant
		if(indice > -1){
		 	
			// Prend le nom de la ville
			nomVille = nomVille.substring(0, indice);
			
			// Retire les eventuels espaces apr�s le nom de ville
			while(Character.isWhitespace(nomVille.charAt(indice-1))  ){
				nomVille = nomVille.substring(0, indice-=1);
			}
		}
		// Sinon on garde tout le nom, donc pas de changements
		return nomVille;
	}
}
