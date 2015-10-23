package upo.exo2;

public class Employe {

    private String nom;
    private double salaireHoraireBase;
    private double nbHeureTravailleesHebdomadaire;

    public Employe(String nom, double salaireHoraireBase, double nbHeureTravailleesHebdomadaire) throws GestionException {

        if(salaireHoraireBase < 13 || nbHeureTravailleesHebdomadaire > 60) {
            throw new GestionException("Erreur : Regle(s) de gestion non respectee(s) !!! Employe ne peut etre employe dans ces conditions !!") {
                // RIEN
            };
        }

        this.nom = nom;
        this.salaireHoraireBase = salaireHoraireBase;
        this.nbHeureTravailleesHebdomadaire = nbHeureTravailleesHebdomadaire;
    }

    public String getNom() {
        return this.nom;
    }

    public double getSalaireHoraireBase() {
        return salaireHoraireBase;
    }

    public double getNbHeureTravailleesHebdomadaire() {
        return nbHeureTravailleesHebdomadaire;
    }
}
