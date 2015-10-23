package upo.exo1;

public final class Main {

    public static void main(String[] args) {

        SalleCinema salleCinema = new SalleCinema("Star Wars 7", 1000, 7.5);

        int nbDeVente = 933;
        for(int i = 0; i < nbDeVente; i++) {
            salleCinema.vendrePlace();
        }
        System.out.println("Le nombres de places disponible est : " + salleCinema.nbPlacesDisponibles() + ".");
        if(salleCinema.estPleine() == true) {
            System.out.println("SALLE PLEINE !!!\n");
        } else {
            System.out.println("La salle n'est pas pleine.\n");
        }

        System.out.println(salleCinema.versChaine());
        //System.out.println(salleCinema);
    }
}
