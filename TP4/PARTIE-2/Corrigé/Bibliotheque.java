public class Bibliotheque {

    public Livre[] listeLivres;

    public Bibliotheque(Livre[] pListeLivres) {

        System.out.println("\n\n#CREATION DE LA BIBLIOTHEQUE\n");
        
        listeLivres = new Livre[10];

        for(int i = 0; i < pListeLivres.length; i ++) {
            listeLivres[i] = pListeLivres[i];
            System.out.println("Le livre " + listeLivres[i].titre + " a bien ete ajoute a la bibliotheque");
        }
        System.out.println("\n#BIBLIOTHEQUE CREE AVEC SUCCES\n");
    }

    public void emprunterLivre(Livre livre) {
        for(int i = 0; i < listeLivres.length; i ++) {
           if(listeLivres[i] == livre) {
                listeLivres[i].emprunter();
           }
        }
    }

    public void rendreLivre(Livre livre) {
        for(int i = 0; i < listeLivres.length; i ++) {
           if(listeLivres[i] == livre) {
                listeLivres[i].rendre();
           }
        }
    }

}