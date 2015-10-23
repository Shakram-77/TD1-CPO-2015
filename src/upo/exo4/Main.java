package upo.exo4;

public class Main {

    public static void main(String[] args) {

        ParcAttraction parcAttraction = new ParcAttraction("MiageWonderland", 180);
        System.out.println("INIT\n" + parcAttraction.toString() + '\n');

        parcAttraction.vendreBillets(24, Tarif.ILLIMITE);
        System.out.println("UNE VENTE\n" + parcAttraction.toString() + '\n');

        parcAttraction.reinitialiser();
        System.out.println("RESET\n" + parcAttraction.toString() + '\n');

        parcAttraction.vendreBillets(24, Tarif.ILLIMITE);
        parcAttraction.vendreBillets(19, Tarif.ILLIMITE5);
        parcAttraction.vendreBillets(32, Tarif.REDUIT);
        parcAttraction.vendreBillets(23, Tarif.REDUIT5);
        System.out.println("VENTE BANAL\n" + parcAttraction.toString() + '\n');

        parcAttraction.reinitialiser();
        parcAttraction.vendreBillets(181, Tarif.REDUIT5);
        System.out.println("RESET ET VENTE FULL\n" + parcAttraction.toString() + '\n');
    }
}