package personnages;

public class Gaulois { 
	private String nom; 
	private int force; 
	private int effetPotion = 1;

	public Gaulois(String nom, int force) { 
		this.nom = nom; 
		this.force = force; 
	}
	
	public String getNom() { 
		return nom;
	}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "<< " + texte + ">>"); 
	}
	
	private String prendreParole() { 
		return "Le gaulois " + nom + " : "; 
	}
	
	public void frapper(Romain romain) { 
		int forceCoup = this.force / 3 * this.effetPotion;
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom()); 
		romain.recevoirCoup(forceCoup);
	}
 
	public String toString() { 
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; 
	}
	
	public void boirePotion(Druide druide) {
		druide.preparePotion();
		int forcePotion = druide.getForcePotion();
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + this.effetPotion + " fois décuplée");
	}
	
	public static void main(String[] args) { 
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
		Druide panoramix = new Druide("Panoramix", 5, 10);
		asterix.boirePotion(panoramix);
		
		Romain romulus;
		romulus = new Romain("actorius",5);
		asterix.frapper(romulus);
		
		
	}
}