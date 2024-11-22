public class fiscalite {
    public static void main(String[] args) {

        personne p1=new personne(15351096,"mohamed","amine");
        personne p2 =new personne(15351097,"ahmed","jdidi");
        personne p3=new personne(15351095,"eya","allel");
        propriete a=new villa(2, p2,"dar  chaabene",400,6,true);
        propriete b=new appartement(3, p2,"hammamet",1200,8,3);
        propriete c=new proprieteProfessionnelle(4,p3,"korba",1000,true,50);
        propriete d=new proprieteProfessionnelle(5,p1,"tunis",2500,false,400);
        propriete e=new proprietePrivee(1,p1,"corniche",350,4);
        lotissement p=new lotissement(10);
        p.ajouter(e);
        p.ajouter(a);
        p.ajouter(b);
        p.ajouter(c);
        p.ajouter(d);
        p.supprimer(c);
        p.afficherPropriete();
        System.out.println(p.getNBPiece());
        System.out.println(p.getproprietebyindice(2));
    }
}
