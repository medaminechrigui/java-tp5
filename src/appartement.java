import java.util.Objects;

public class appartement extends proprietePrivee{
    private int numEtage;

    public appartement(int id, personne responsable, String adresse, double surface, int nbpiece, int numEtage) {
        super(id, responsable, adresse, surface, nbpiece);
        this.numEtage = numEtage;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        appartement that = (appartement) o;
        return numEtage == that.numEtage;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEtage);
    }
    @Override
    public String toString() {
        return super.toString()+
                "numEtage=" + numEtage ;
    }

}
