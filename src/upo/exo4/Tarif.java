package upo.exo4;

public enum Tarif {

    ILLIMITE(38.50f), ILLIMITE5(28.50f), REDUIT(ILLIMITE.getValeur()*0.70f), REDUIT5(ILLIMITE5.getValeur()*0.70f);

    private Tarif(float valeur) {
        this.valeur = valeur;
    }

    public float getValeur() {
        return valeur;
    }

    private final float valeur;
}


