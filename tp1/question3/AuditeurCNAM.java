package question3;
import java.text.Normalizer;
/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String name = this.nom;
        String lastName = this.prenom;
        
        //Pour enlever les accents des caracteres accentués
        name = Normalizer.normalize(name, Normalizer.Form.NFD);
        lastName = Normalizer.normalize(lastName, Normalizer.Form.NFD);
        name = name.replaceAll("[^\\p{ASCII}]", "");
        lastName = lastName.replaceAll("[^\\p{ASCII}]", "");
        
        //Remplacer les caracteres qui ne sont pas des lettres par _
        String nouveauNom = name.replaceAll("[^a-zA-Z]", "_");
        String nouveauPrenom = lastName.replaceAll("[^a-zA-Z]", "_");
        
        //concatener le nom avec _ puis avec le prenom et a la fin retourner tout String en minuscule
        String result;
        if(nouveauNom.length() <6)
            result = nouveauNom + "_" + nouveauPrenom.substring(0,1);
        else
            result = nouveauNom.substring(0,6) + "_" + nouveauPrenom.substring(0,1);
            
        return result.toLowerCase();
        // à compléter
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;// à compléter
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return this.prenom;// à compléter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule ;// à compléter
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
