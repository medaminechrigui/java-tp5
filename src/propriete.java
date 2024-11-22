import java.util.Objects;

public abstract class propriete {
    protected int id;
    protected personne responsable;
    protected String adresse;
    protected double surface;

    public propriete(int id, personne responsable, String adresse, double surface) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        propriete propriete = (propriete) o;
        return id == propriete.id;
    }
    @Override
    public String toString() {
        return "id=" + id +
                ", responsable=" + responsable +
                ", adresse='" + adresse + '\'' +
                ", surface=" + surface;
    }
    public abstract double calculImpot();
}

