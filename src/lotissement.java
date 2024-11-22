public class lotissement implements gestionPropriete {
    protected propriete []tab;
    protected static int nb;
    public lotissement(int capacite){
        if(capacite > 0 && capacite < max_propriete){
            tab = new propriete[capacite];
        }
        else return;
    }
    public propriete getproprietebyindice(int i){
        if (i<0 || i>nb){
            return null;
        }
        return tab[i];
    }
    public int getNBPiece(){
        int s=0;
        for (int i=0; i<tab.length; i++){
            if(tab[i] instanceof proprietePrivee){
                s=s+((proprietePrivee) tab[i]).getNbpiece();
            }
        }
        return s;
    }

    @Override
    public void afficherPropriete() {
        for (int i=0; i<nb; i++){
            System.out.println(tab[i]+" impot = " +tab[i].calculImpot());
        }
    }

    @Override
    public boolean ajouter(propriete p) {
        tab[nb] = p;
        nb++;
        if (tab[nb]!=null){
            return false;
        }
        return true;
    }
    public boolean supprimer(propriete p) {
        for (int i=0; i<nb; i++){
            if (tab[i].equals(p)){
                for (int j=i; j<nb-1; j++){
                    tab[j] = tab[j+1];
                }
                tab[nb-1] = null;
                nb--;
                return true;
            }
        }
        return false;
    }

}
