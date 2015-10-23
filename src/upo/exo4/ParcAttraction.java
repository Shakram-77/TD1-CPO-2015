package upo.exo4;

public class ParcAttraction {

    private final String nom;
    private final int capacite;
    private final Tarif tarifIllimite, tarifIllimite5, tarifReduit, tarifReduit5;
    private int nbBilletVenteIllimite = 0, nbBilletVenteIllimite5 = 0, nbBilletVenteReduit = 0, nbBilletVenteReduit5 = 0;


    public ParcAttraction(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.tarifIllimite = Tarif.ILLIMITE;
        this.tarifIllimite5 = Tarif.ILLIMITE5;
        this.tarifReduit = Tarif.REDUIT;
        this.tarifReduit5 = Tarif.REDUIT5;
    }

    public int nbPlacesDispo() {
        int nbPlacesDispo = capacite - (nbBilletVenteIllimite + nbBilletVenteIllimite5 + nbBilletVenteReduit + nbBilletVenteReduit5);
        return nbPlacesDispo;
    }

    void vendreBillets(int nb, Tarif tarif) {
        if(nbPlacesDispo() - nb < 0) {
            System.out.println("Le nombre de billet a vendre depasse la capacite total du parc. VENTE IMPOSSIBLE !!!");
        } else {
            if(tarif.equals(tarifIllimite)) {
                nbBilletVenteIllimite+=nb;
            } else if(tarif.equals(tarifIllimite5)) {
                nbBilletVenteIllimite5+=nb;
            } else if(tarif.equals(tarifReduit))  {
                nbBilletVenteReduit+=nb;
            } else if(tarif.equals(tarifReduit5)) {
                nbBilletVenteReduit5+=nb;
            }
        }
    }

    void reinitialiser() {
        int reset = 0;
        nbBilletVenteIllimite = reset;
        nbBilletVenteIllimite5 = reset;
        nbBilletVenteReduit = reset;
        nbBilletVenteReduit5 = reset;
    }

    double chiffreAffaires() {
        double caIllimite = (double)tarifIllimite.getValeur() * (double)nbBilletVenteIllimite;
        double caIllimite5 = (double)tarifIllimite5.getValeur() * (double)nbBilletVenteIllimite5;
        double caReduit = (double)tarifReduit.getValeur() * (double)nbBilletVenteReduit;
        double caReduit5 = (double)tarifReduit5.getValeur() * (double)nbBilletVenteReduit5;
        return caIllimite + caIllimite5 + caReduit + caReduit5;
    }

    double tauxRemplissage() {
        return ((double)nbBilletVenteIllimite + (double)nbBilletVenteIllimite5 + (double)nbBilletVenteReduit + (double)nbBilletVenteReduit5) / (double)capacite;
    }

    @Override
    public String toString() {
        String chaine;
        chaine = "Parc " + nom +
                "\nCapacite d'accueil : " + capacite +
                "\nTarif normal illimitee : " + tarifIllimite.getValeur() +
                "\nTarif normal illimitee 5 : " + tarifIllimite5.getValeur() +
                "\n" + nbBilletVenteIllimite + " billets vendues au tarif illimitee, " +
                "\n" + nbBilletVenteIllimite5 + " billets vendues au tarif illimitee," +
                "\n" + nbBilletVenteReduit + " billets vendues au tarif reduit," +
                "\n" + nbBilletVenteReduit5 + " billets vendues au tarif reduit 5." +
                "\nChiffre d'affaires : " + chiffreAffaires() +
                "\nTaux de remplissage : " + tauxRemplissage();
        return chaine;
    }
}