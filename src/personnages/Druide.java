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
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + "."); 
	} 
	
	public String getNom() { 
		return nom; 
	}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "� " + texte + "�"); 
	} 
	
	private String prendreParole() { 
		return "Le druide " + nom + " : "; 
	} 
		
	public void preparePotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax-effetPotionMin+1)+effetPotionMin;
		if (forcePotion > 7) {
			System.out.println("j'ai préparé une super potion de force" + forcePotion);
		}
		else {
			System.out.println("je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force forcePotion" + forcePotion);
		}
	}
	
	public int getForcePotion() {
        return forcePotion;
	}
	
	public static void main(String[] args) { 
		Druide panoramix;
		panoramix = new Druide("Panoramix", 5, 10);
		System.out.println(panoramix);
		panoramix.preparePotion();
	
	}
}
