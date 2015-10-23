package upo.exo2;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseJ {

    public static void main(String[] args) {

        List<Employe> employes;
        employes = new ArrayList<>();
        Employe john = null;

        try {
            john = new Employe("John", 7.5, 35);
            employes.add(john);
        } catch (GestionException e) {
            e.printStackTrace();
        }
        try {
            Employe cecile = new Employe("Cecile", 8.2, 47);
            employes.add(cecile);
        } catch (GestionException e) {
            e.printStackTrace();
        }
        try {
            Employe pierre = new Employe("Pierre", 10.00, 73);
            employes.add(pierre);
        } catch (GestionException e) {
            e.printStackTrace();
        }
        try {
            Employe laurent = new Employe("Laurent", 25.00, 60);
            employes.add(laurent);
        } catch (GestionException e) {
            e.printStackTrace();
        }
        try {
            Employe laurent2 = new Employe("Laurent", 14.00, 45);
            employes.add(laurent2);
        } catch (GestionException e) {
            e.printStackTrace();
        }


        for(int i = 0; i < employes.size(); i++) {
            if(employes.get(i).getSalaireHoraireBase() < 13) {
                System.out.println("Erreur : Le salaire horaire de base de " + employes.get(i).getNom() + " est inferieur a 13 euro !!!");
            }
            if(employes.get(i).getNbHeureTravailleesHebdomadaire() > 60) {
                System.out.println("Erreur : Le nombre d'heure travaillees hebdomadaire de " + employes.get(i).getNom() + " est superieure à 60 !!!");
            }
            double salaireHebdomadaire = 0;
            if(employes.get(i).getNbHeureTravailleesHebdomadaire() <= 40) {
                salaireHebdomadaire = employes.get(i).getNbHeureTravailleesHebdomadaire() * employes.get(i).getSalaireHoraireBase();
            } else {
                salaireHebdomadaire = employes.get(i).getNbHeureTravailleesHebdomadaire() * employes.get(i).getSalaireHoraireBase();
            }
            System.out.println("Le salaire hebdomadaire de " + employes.get(i).getNom() + " est de : " + salaireHebdomadaire);
        }
    }
}