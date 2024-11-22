import java.util.Objects;

public class proprietePrivee  extends propriete{
    protected int nbpiece;

    public proprietePrivee(int id, personne responsable, String adresse, double surface, int nbpiece) {
        super(id, responsable, adresse, surface);
        this.nbpiece = nbpiece;
    }

    @Override
    public String toString() {
        return super.toString()+" nbpiece=" + nbpiece ;
    }

    public int getNbpiece() {
        return nbpiece;
    }

    public void setNbpiece(int nbpiece) {
        this.nbpiece = nbpiece;
    }
    @Override
    public double calculImpot() {
        return (surface/100)*50 +nbpiece*10;
    }

}
