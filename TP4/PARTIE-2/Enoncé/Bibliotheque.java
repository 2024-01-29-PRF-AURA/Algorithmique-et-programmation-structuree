public class Bibliotheque {

    // Création de ma liste de livres dans un tableau
    public Livre[] listeLivres;

    // Passage en paramètre d'une liste de livres pour créer ma bibliotheque
    public Bibliotheque(Livre[] pListeLivres) {

        System.out.println("\n\n#CREATION DE LA BIBLIOTHEQUE\n");
        
        // Initialisation OBLIGATOIRE de la taille de mon tableau à 10 
        listeLivres = new Livre[10];

        // Parcourt des deux tableaux pour copier les données de pListeLivres vers pListeLivres
        for(int i = 0; i < pListeLivres.length; i ++) {
            listeLivres[i] = pListeLivres[i];
            System.out.println("Le livre " + listeLivres[i].titre + " a bien ete ajoute a la bibliotheque");
        }
        System.out.println("\n#BIBLIOTHEQUE CREE AVEC SUCCES\n");
    }

   // Ici methode emprunterLivre

   // Ensuite methode rendreLivre

}