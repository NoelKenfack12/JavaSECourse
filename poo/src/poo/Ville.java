package poo;

public class Ville{   
  //Stocke le nom de notre ville
  private String nomVille;
  //Stocke le nom du pays de notre ville
  private String nomPays;
  //Stocke le nombre d'habitants de notre ville
  private int nbreHabitants;

  //Constructeur par défaut
  public Ville(){
    System.out.println("Création d'une ville !");      
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  } 
  
  public Ville(String pNom, int pNbre, String pPays)
  {
    System.out.println("Création d'une ville:" + pNom);
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }

	public String getNomVille() {
		return nomVille;
	}
	
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public int getNbreHabitants() {
		return nbreHabitants;
	}
	
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}   
  
  
}
