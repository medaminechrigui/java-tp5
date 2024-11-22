import java.util.Objects;

public class proprieteProfessionnelle extends propriete{
    private int nbEmployes;
    private boolean estEtatique;

    public proprieteProfessionnelle(int id, personne responsable, String adresse, double surface, boolean estEtatique, int nbEmployes) {
        super(id, responsable, adresse, surface);
        this.estEtatique = estEtatique;
        this.nbEmployes = nbEmployes;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    public boolean isEstEtatique() {
        return estEtatique;
    }

    public void setEstEtatique(boolean estEtatique) {
        this.estEtatique = estEtatique;
    }

    @Override
    public String toString() {
        return super.toString()+" nbEmployes=" + nbEmployes +
                ", estEtatique=" + estEtatique ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        proprieteProfessionnelle that = (proprieteProfessionnelle) o;
        return nbEmployes == that.nbEmployes && estEtatique == that.estEtatique;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nbEmployes, estEtatique);
    }

    @Override
    public double calculImpot() {
        if(!estEtatique){
            return (surface/100)*100+30*nbEmployes;
        }
        return 0;
    }
}
