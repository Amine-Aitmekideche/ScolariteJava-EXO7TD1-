public class Scolarite {
    private final int NOM_MAX = 500;
    private static int nombreEtudiant ;
    private Etudiant[] etudiants ;

    public Scolarite(){
        this.etudiants=new Etudiant[NOM_MAX];
        nombreEtudiant = 0;
    }

    public static int nbEtudiants(){
        return nombreEtudiant;
    }

    public void addEtudiant(Etudiant e){
        if (nombreEtudiant < NOM_MAX) {
            etudiants[nombreEtudiant] = e;
            nombreEtudiant++;
        } else {
            System.out.println("Le tableau est plein, impossible d'ajouter plus d'étudiants.");
        }
    }

    public void addEtudiant(Etudiant[] e){
        int i ;
        for(i =0 ; i < e.length && nombreEtudiant < NOM_MAX ; i++){
            etudiants[nombreEtudiant] = e[i];
            nombreEtudiant++;
        }
        if ( i != e.length){
            System.out.println("Le tableau est plein, impossible d'ajouter plus d'étudiants , on a ajouter seulemt :" + i+1);
        }
    }

    public void afficher(){
        System.out.println("la liste des etudiants est:");
        for (int i = 0; i < nombreEtudiant ; i++){
            System.out.print(i+1+".");
            etudiants[i].afficher();
        }
    }

    public void afficher(double seuil){
        int j = 1;
        System.out.println("la liste des etudiants superieur a " + seuil + "sont:");
        for (int i = 0; i < nombreEtudiant ; i++){
            if(etudiants[i].calculerMoyenne() >= seuil){
                System.out.print(j+".");
                etudiants[i].afficher();
                j++;
            }
        }
    }
}
