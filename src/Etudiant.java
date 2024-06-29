public class Etudiant {

    private String nom;
    private String prenom;
    private String matricule;
    private double[] moyModule;
    private final int NB_MOD = 3;

    public Etudiant(String nom,String prenom,String matricule,double[] moyModule){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.moyModule = new double[NB_MOD];
        for (int i = 0; i < NB_MOD; i++) {
            this.moyModule[i] = moyModule[i];
        }

    }

    public Etudiant(String nom,String prenom,String matricule){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        moyModule = new double[NB_MOD];
    }

    public void afficher(){
        System.out.println("Je suis " + nom + " " + prenom + ", mon matricule est : " + matricule + ".");
    }

    public double calculerMoyenne(){
        int somme = 0;
        for(int i = 0 ; i < NB_MOD ; i++){
            somme += moyModule[i];
        }
        return somme / NB_MOD;
    }

}
