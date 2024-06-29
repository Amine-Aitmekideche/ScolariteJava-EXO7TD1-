public class Etudiant {

    private String nom;
    private String prenom;
    private String matricule;
    private double moyMod1;
    private double moyMod2;
    private double moyMod3;

    public Etudiant(String nom,String prenom,String matricule,double moyMod1,double moyMod2,double moyMod3){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.moyMod1 = moyMod1;
        this.moyMod2 = moyMod2;
        this.moyMod3 = moyMod3;
    }

    public Etudiant(String nom,String prenom,String matricule){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public void afficher(){
        System.out.println("Je suis " + nom + " " + prenom + ", mon matricule est : " + matricule + ". Mes notes dans les 3 modules sont : " + moyMod1 + ", " + moyMod2 + ", " + moyMod3 + ".");
    }

    public double calculerMoyenne(){
        return (moyMod1+moyMod2+moyMod3) / 3;
    }

}
