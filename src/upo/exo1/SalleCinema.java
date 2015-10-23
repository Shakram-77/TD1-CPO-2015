package upo.exo1;


/**
 * Définit le modèle d'une salle de cinéma.
 */
public final class SalleCinema {

    private String film;
    private final int nbPlaces;
    private double tarif;
    private int nbPlacesVendues = 0;

    public SalleCinema(String film, int nbPlaces, double tarif) {
        this.film = film;
        this.nbPlaces = nbPlaces;
        this.tarif = tarif;
    }

    /* -------- */
    /* METHODES */
    /* -------- */

    public void vendrePlace() {
        this.nbPlacesVendues++;
    }

    public int nbPlacesDisponibles() {
        return nbPlaces - nbPlacesVendues;
    }

    public boolean estPleine() {
        if(nbPlacesVendues == nbPlaces) {
            return true;
        } else {
            return false;
        }
    }

    public double tauxRemplissage() {
        return (double)nbPlacesVendues / (double)nbPlaces;
    }

    public double chiffreAffaires() {
        return (double)nbPlacesVendues * tarif;
    }

    public String versChaine() {

        String chaine;
        chaine = "Film projete : " + film +
                "\nTarif : " + tarif +
                "\nNombre de places : " + nbPlaces +
                "\nTaux remplissage : " + this.tauxRemplissage() +
                "\nChiffre d'affaires : " + this.chiffreAffaires();

        return chaine;
    }

    /* -------- */
    /* -------- */



    /* --------------- */
    /* SETTER & GETTER */
    /* --------------- */

    public String getFilm() {
        return film;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public double getTarif() {
        return tarif;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalleCinema{");
        sb.append("film='").append(film).append('\'');
        sb.append(", nbPlaces=").append(nbPlaces);
        sb.append(", tarif=").append(tarif);
        sb.append('}');
        return sb.toString();
    }

    /* --------------- */
    /* --------------- */
}