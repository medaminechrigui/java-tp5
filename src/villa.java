import java.util.Objects;

public class villa extends proprietePrivee{
    private boolean avecPiscine;

    public villa(int id, personne responsable, String adresse, double surface, int nbpiece, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbpiece);
        this.avecPiscine = avecPiscine;
    }

    public boolean isAvecPiscine() {
        return avecPiscine;
    }

    public void setAvecPiscine(boolean avecPiscine) {
        this.avecPiscine = avecPiscine;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "avecPiscine=" + avecPiscine ;
    }
    @Override
    public double calculImpot() {
        int s=0;
        if (avecPiscine){
            s=200;
        }
        return super.calculImpot()+s;
    }
}
