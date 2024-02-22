public class Livre {
    public int numero;
    public String titre;
    public Auteur auteur;
    public boolean emprunte;

    public Livre(int pNumero, String pTitre, Auteur pAuteur, boolean pEmprunte) {
        numero = pNumero;
        titre = pTitre;
        auteur = pAuteur;
        emprunte = pEmprunte;
        System.out.println("Creation d'un nouveau livre");
    }

    public void emprunter() {
        if(emprunte == true) {
            System.out.println("Le livre " + titre + " a deja ete emprunte");
        }
        else {
            System.out.println("Le livre " + titre + " a bien ete emprunte");
            emprunte = true;
        }
    }

    public void rendre() {
        if(emprunte == true) {
            System.out.println("Le livre " + titre + " a ete rendu");
            emprunte = false;
        }
        else {
            System.out.println("Le livre " + titre + " n'est pas emprunte et ne peut donc pas etre rendu");
        }
    }

    public void afficherAuteur() {
        System.out.println("L'auteur de " + titre + " est " + auteur.prenom + " " + auteur.nom);
    }
}