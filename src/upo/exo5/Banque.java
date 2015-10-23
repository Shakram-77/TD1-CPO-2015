package upo.exo5;

import java.util.Scanner;

/**
 * Created by benorocu on 22/10/2015.
 */
public class Banque {

    private String numeroCompte;
    private int motDePasseCompte;

    public Banque(String nom) {

        Scanner sc = new Scanner(System.in);
        String entreeClavierString;
        //int entreeClavierInt;

        System.out.println("Bienvenue \u00e0 " + nom + "\n");

        System.out.println("Veuillez entrer votre num\u00e9ro de compte : ");
        entreeClavierString = sc.nextLine();
        numeroCompte = entreeClavierString;

        //System.out.println("Veuillez entrer votre mot de passe associé : ");
        //entreeClavierInt = sc.nextInt();
        //motDePasseCompte = entreeClavierInt;

        //System.out.println("User : " + numeroCompte + " -- MDP : " + motDePasseCompte);
    }

    public void creeCompte() {

    }
}
