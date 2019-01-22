package fr.gns.xdq;

/** La classe Pion représente un pion du jeu XouDouQi
 * @author gns
 * @since 0.1
 * @version 0.4
 *
 */
public class Pion {
	
	private String couleur ;
	private String animal ;
	private boolean capture = false ;
	
	
	/** Créer un Pion
	 * @param couleur La couleur ("Blanc" ou "Noir")
	 * @param animal Le nom de l'animal représenté sur le pion
	 * @param capture true si le point a été capturé par l'adversaire
	 */
	public Pion(String couleur, String animal, boolean capture) {
		super();
		this.couleur = couleur;
		this.animal = animal;
		this.capture = capture;
	}

	/** Créer un Pion
	 * @param couleur La couleur ("Blanc" ou "Noir")
	 * @param animal Le nom de l'animal représenté sur le pion
	 */
	public Pion(String couleur, String animal) {
		super();
		this.couleur = couleur;
		this.animal = animal;
	}

	/** Obtenir la couleur du pion
	 * @return La couleur du poin ("Blanc" ou "Noir")
	 */
	public String getCouleur() {
		return couleur;
	}

	
	/** Modifier la couleur du pion
	 * @param couleur La nouvelle couleur du pion
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/** Obtenir le nom de l'animal représenté sur le pion
	 * @return Le nom de l'animal représenté sur le pion
	 */
	public String getAnimal() {
		return animal;
	}

	/** Modifier le nom de l'animal représenté par le pion
	 * @param animal Le nom du nouvel animal représenté sur le pion
	 */
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	/** Savoir si le pion a été capturé par l'adversaire
	 * @return true si le point a été capturé par l'adversaire
	 */
	public boolean isCapture() {
		return capture;
	}

	/** Modifier l'état du pion (capturé ou encore dans le jeu)
	 * @param capture true si le point a été capturé par l'adversaire
	 */
	public void setCapture(boolean capture) {
		this.capture = capture;
	}

	@Override
	public String toString() {
		return "Pion [couleur=" + couleur + ", animal=" + animal + ", capture=" + capture + "]";
	}

}
