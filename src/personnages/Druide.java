package personnages;
import java.util.Random;


public class Druide { 
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax; 
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		this.nom = nom; 
		this.effetPotionMin = effetPotionMin; 
		this.effetPotionMax = effetPotionMax; 
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " ï¿½ " + effetPotionMax + "."); 
	} 
	
	public String getNom() { 
		return nom; 
	}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "ï¿½ " + texte + "ï¿½"); 
	} 
	
	private String prendreParole() { 
		return "Le druide " + nom + " : "; 
	} 
	
	public void preparePotion(Random random) {
		Random random1 = new Random();
		forcePotion = random1.nextInt(effetPotionMax);
		if (forcePotion > 7) {
			Druid.parler("j'ai préparé une super potion de force");
		}
		else {
			Druid.parler("je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force forcePotion");
		}
	}
}
