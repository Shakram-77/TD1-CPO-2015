package upo.exo3;

public class Transition {

    private Etat suivant;
    private Object etiquette;

    public Transition(Etat suivant, Object etiquette) throws TransitionException {

        if(etiquette == null || suivant == null) {
            throw new TransitionException("Erreur : l'etiquette et le suivant ne peuvent etre NULL !!!") {
                // RIEN
            };
        }

        this.suivant = suivant;
        this.etiquette = etiquette;
    }

    public Etat franchir() {
        return suivant;
    }

    public Object getEtiquette() {
        return etiquette;
    }
}