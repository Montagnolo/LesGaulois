package personnages;

public class Village { 
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom,int nbVillageoisMaximum) { 
		this.nom = nom;  
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}
	
	public void trouverHabitant(int numeroVillageois) {
	}	
		
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() { 
		return nom; 
	}
	
}
