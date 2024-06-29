//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Etudiant etudiant0 = new Etudiant("Ait mekideche","amine","21/0234",new double[]{15.45,13,13.88});
        etudiant0.afficher();
        System.out.println("mon moyenne est: " + etudiant0.calculerMoyenne());
        Etudiant etudiant1 = new Etudiant("Ait mekideche","khaled","21/0233",new double[]{1.45,13,13.88});
        Etudiant etudiant2 = new Etudiant("Ait ","amine","21/0434",new double[]{15.45,10,13.88});
        Etudiant etudiant3 = new Etudiant("Ait","khaled","21/0254",new double[]{18.45,13,13.88});
        Etudiant etudiant4 = new Etudiant("Ait moh","amine","21/0239",new double[]{7.88,13,13.88});
        Etudiant etudiant5 = new Etudiant("Ait moh","roufaida","21/0554",new double[]{15.45,14.56,10.5});
        Etudiant etudiant6 = new Etudiant("Ait moh","hjkk6","21/0664",new double[]{12.56,19,11.96});
        Scolarite scolarite = new Scolarite();
        Etudiant[] etudiants = {etudiant0, etudiant1, etudiant2, etudiant3, etudiant4, etudiant5, etudiant6};
        scolarite.addEtudiant(etudiants);
        System.out.println("le nombre des etudiant est : " + Scolarite.nbEtudiants());
        Etudiant etudiant7 = new Etudiant("Ait moh","66666","21/0674",new double[]{17.56,16,12.96});
        scolarite.addEtudiant(etudiant7);
        System.out.println("le nombre des etudiant est : " + Scolarite.nbEtudiants());
        scolarite.afficher();
        scolarite.afficher(11.12);
    }

}
