package upo.exo5;

import java.io.*;
import java.util.Properties;

public class FichierUtilisateurs {

    String fichierPropriete = "src/upo/exo5/clients.properties";
    Properties prop;
    File fichierProp;

    public FichierUtilisateurs() {

        prop = new Properties() ;
        fichierProp = new File(fichierPropriete);

        // Charge le contenu du fichier properties dans un objet Properties
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(fichierProp);
        } catch (FileNotFoundException e) {
            System.out.println("Probleme d'ouverture du fichier. Fichier non trouve !");
        }
        try {
            prop.load(stream);
        } catch (IOException e) {
            System.out.println("Probleme d'entree de flux !");
        }

        // Charge le contenu de l'objet Properties dans le fichier properties
        FileOutputStream oStream = null;
        try {
            oStream = new FileOutputStream(fichierProp);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : FileNotFoundException");
        }
        try {
            prop.store(oStream, "Fichier clients");
        } catch (IOException e) {
            System.out.println("Erreur : IOException");
        }
    }

    public void creerClient(String idConnexion, String nomUtilisateur) {
        if(prop.getProperty(idConnexion) == null) {
            prop.setProperty(idConnexion, nomUtilisateur + "; ");
        } else {
            System.out.println("Client deja existant !!!");
        }
    }

    public void ajouterCompte(String idConnexion, String numCompte) {

        String valeurActuelle = prop.getProperty(idConnexion);
        String[] split = valeurActuelle.split("&");
        String nomUtilisateur = recupererNomUtilisateur(idConnexion);
        String[] comptes = split[1].split("#");
        String[] soldes = split[2].split("#");

        int longueurComptes = comptes.length();
        soldes = ;
        String nouvelleValeur = nomUtilisateur + "&" + comptes + "&" + soldes;

        prop.setProperty(idConnexion, );
    }

    public String recupererNomUtilisateur(String idConnexion) {
        String[] split = prop.getProperty(idConnexion).split("&");
        return split[0];
    }
}