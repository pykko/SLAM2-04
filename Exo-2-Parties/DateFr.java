import java.util.Calendar;
import java.util.GregorianCalendar;

/** Dates au format français
 * @author xilim
 * @since 0.1
 * @version 0.1
 */
public class DateFr {

	int jour ;
	int mois ;
	int annee ;
	
	/** Créer une date (date courante)
	 * 
	 */
	public DateFr() {
		super();
		GregorianCalendar aujourdhui = new GregorianCalendar() ;
		this.jour = aujourdhui.get( Calendar.DAY_OF_MONTH ) ;
		this.mois = aujourdhui.get( Calendar.MONTH ) + 1 ;
		this.annee = aujourdhui.get( Calendar.YEAR ) ;
	}
	
	/** Créer une date par recopie
	 * @param autre La date
	 */
	public DateFr( DateFr autre ) {
		super();
		this.jour = autre.jour ;
		this.mois = autre.mois ;
		this.annee = autre.annee ;
	}

	/** Créer une date
	 * @param jour Le numéro du jour dans le mois
	 * @param mois Le numéro du mois
	 * @param annee L'année
	 */
	public DateFr(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	/** Obtenir le numéro du jour dans le mois
	 * @return Le numéro du jour dans le mois
	 */
	public int getJour() {
		return jour;
	}

	/** Modifier le numéro du jour dans le mois
	 * @param jour Le nouveau numéro du jour dans le mois
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/** Obtenir le numéro du mois
	 * @return Le numéro du mois
	 */
	public int getMois() {
		return mois;
	}

	/** Modifier le numéro du mois
	 * @param mois Le nouveau numéro du mois
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/** Obtenir l'année
	 * @return L'année
	 */
	public int getAnnee() {
		return annee;
	}

	/** Modifier l'année
	 * @param annee La nouvelle année
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/** Tester si la date est indentique à une autre date
	 * @param autre L'autre date
	 * @return true si la date est identique à l'autre date, et false dans le cas contraire
	 */
	public boolean estIdentique( DateFr autre ){
		
		if( this.jour == autre.jour ){
			if( this.mois == autre.mois ){
				if( this.annee == autre.annee ){
					return true ;
				}
			}
		}
		return false ;
	}
	
	/** Tester si la date est antérieure à une autre date
	 * @param autre L'autre date
	 * @return true si la date est antérieure à l'autre date, et false dans le cas contraire
	 */
	public boolean estAnterieure( DateFr autre ){
		if( this.annee < autre.annee || ( this.annee == autre.annee && this.mois < autre.mois ) || ( this.annee == autre.annee && this.mois == autre.mois && this.jour < autre.jour ) ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Tester si la date est postérieure à une autre date
	 * @param autre L'autre date
	 * @return true si la date est postérieure à l'autre date, et false dans le cas contraire
	 */
	public boolean estPosterieure( DateFr autre ){
		if( this.annee > autre.annee || ( this.annee == autre.annee && this.mois > autre.mois ) || ( this.annee == autre.annee && this.mois == autre.mois && this.jour > autre.jour ) ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Cloner la date
	 * @return Le clone de la date
	 */
	public DateFr cloner(){
		DateFr clone = new DateFr() ;
		clone.jour = this.jour ;
		clone.mois = this.mois ;
		clone.annee = this.annee ;
		return clone ;
	}
	
	/** Obtenir la date du jour précédent
	 * @return La date du jour précédent
	 */
	public DateFr getUnJourAvant(){
		GregorianCalendar uneDate = new GregorianCalendar( this.annee , this.mois - 1 , this.jour ) ;
		uneDate.add( Calendar.DAY_OF_MONTH , -1 ) ;
		int jour = uneDate.get( Calendar.DAY_OF_MONTH ) ;
		int mois = uneDate.get( Calendar.MONTH ) + 1 ;
		int annee = uneDate.get( Calendar.YEAR ) ;
		return new DateFr( jour , mois , annee ) ;
	}
	
	/** Obtenir la date du jour suivant
	 * @return La date du jour suivant
	 */
	public DateFr getUnJourApres(){
		GregorianCalendar uneDate = new GregorianCalendar( this.annee , this.mois - 1 , this.jour ) ;
		uneDate.add( Calendar.DAY_OF_MONTH , 1 ) ;
		int jour = uneDate.get( Calendar.DAY_OF_MONTH ) ;
		int mois = uneDate.get( Calendar.MONTH ) + 1 ;
		int annee = uneDate.get( Calendar.YEAR ) ;
		return new DateFr( jour , mois , annee ) ;
	}
	
	
	/** Avancer la date
	 * @param nbJours Le nombre de jours à déduire
	 */
	public void avancer( int nbJours ){
		GregorianCalendar uneDate = new GregorianCalendar( this.annee , this.mois - 1 , this.jour ) ;
		uneDate.add( Calendar.DAY_OF_MONTH , - nbJours ) ;
		this.jour = uneDate.get( Calendar.DAY_OF_MONTH ) ;
		this.mois = uneDate.get( Calendar.MONTH ) + 1 ;
		this.annee = uneDate.get( Calendar.YEAR ) ;
	}
	
	/** Repousser la date
	 * @param nbJours Le nombre de jours à ajouter
	 */
	public void repousser( int nbJours ){
		GregorianCalendar uneDate = new GregorianCalendar( this.annee , this.mois - 1 , this.jour ) ;
		uneDate.add( Calendar.DAY_OF_MONTH , nbJours ) ;
		this.jour = uneDate.get( Calendar.DAY_OF_MONTH ) ;
		this.mois = uneDate.get( Calendar.MONTH ) + 1 ;
		this.annee = uneDate.get( Calendar.YEAR ) ;
	}
	
	/** Obtenir le numéro du jour dans la semaine 
	 * @return Le numéro du jour dans la semaine
	 */
	public int getNumeroJourDansSemaine(){
		GregorianCalendar uneDate = new GregorianCalendar( this.annee , this.mois - 1 , this.jour ) ;
		int numJourSemaine = uneDate.get( Calendar.DAY_OF_WEEK ) - 1 ;
		if( numJourSemaine == 0 ){
			numJourSemaine = 7 ;
		}
		return numJourSemaine ;
	}
	
	/** Tester si une chaîne respecte le format "JJ/MM/AAAA"
	 * @param source La chaîne
	 * @return true si la chaîne respecte le format "JJ/MM/AAAA", et false dans le cas contraire
	 */
	public static boolean estDate( String source ){
		if( source.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$") ){
			String [] extraits = source.split( "/" ) ;
			int jour = Integer.parseInt( extraits[0] ) ;
			int mois = Integer.parseInt( extraits[1] ) - 1 ;
			int annee = Integer.parseInt( extraits[2] ) ;
			GregorianCalendar uneDate = new GregorianCalendar( annee , mois , jour ) ;
			if( jour == uneDate.get( Calendar.DAY_OF_MONTH ) && mois == uneDate.get( Calendar.MONTH ) && annee == uneDate.get( Calendar.YEAR ) ){
				return true ;
			}
		}
		return false ;
	}
	
	/** Tester si les différents champs d'une date sont corrects
	 * @param jour Le numéro du jour dans le mois
	 * @param mois Le numéro du mois
	 * @param annee L'année
	 * @return true si les différents champs sont corrects, et false dans le cas contraire
	 */
	public static boolean estDate( int jour , int mois , int annee ){
		
		GregorianCalendar uneDate = new GregorianCalendar( annee , mois , jour ) ;
		if( jour == uneDate.get( Calendar.DAY_OF_MONTH ) && mois == uneDate.get( Calendar.MONTH ) && annee == uneDate.get( Calendar.YEAR ) ){
			return true ;
		}
		return false ;
	}
	
	/** Obtenir la date au format "JJ/MM/AAAA"
	 * @return La date au format "JJ/MM/AAAA"
	 */
	public String enChaine() {
		return String.format( "%02d/%02d/%04d", this.jour , this.mois , this.annee ) ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DateFr [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}
	
}
