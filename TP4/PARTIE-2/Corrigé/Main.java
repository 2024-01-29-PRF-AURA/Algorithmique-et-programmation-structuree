public class Main {
    
    // Programme main = fil principal, là ou les instructions débutent
    public static void main(String[] args) {

          // Création des auteurs
          Auteur auteur1 = new Auteur("Hemingway", "Ernest");
          Auteur auteur2 = new Auteur("Tolkien", "J.R.R.");
          Auteur auteur3 = new Auteur("Rowling", "J.K.");
  
          // Création des livres
          Livre livre1 = new Livre(1, "Le Vieil Homme et la Mer", auteur1, false);
          Livre livre2 = new Livre(2, "Le Seigneur des Anneaux", auteur2, false);
          Livre livre3 = new Livre(3, "Harry Potter a l'ecole des sorciers", auteur3, false);
          Livre livre4 = new Livre(4, "Le Vieil Homme et les Enfants", auteur1, false);
          Livre livre5 = new Livre(5, "Le Hobbit", auteur2, false);
          Livre livre6 = new Livre(6, "Harry Potter et la Chambre des Secrets", auteur3, false);
          Livre livre7 = new Livre(7, "Pour qui sonne le glas", auteur1, false);
          Livre livre8 = new Livre(8, "Le Silmarillion", auteur2, false);
          Livre livre9 = new Livre(9, "Harry Potter et le Prisonnier d'Azkaban", auteur3, false);
          Livre livre10 = new Livre(10, "Le Soleil se leve aussi", auteur1, false);
  
          // Création de la liste de livres
          Livre[] listeLivres = {livre1, livre2, livre3, livre4, livre5, livre6, livre7, livre8, livre9, livre10};
  
          // Création de la bibliothèque
          Bibliotheque bibliotheque = new Bibliotheque(listeLivres);
  
          // Affichage de certains auteurs
          livre1.afficherAuteur();
          livre5.afficherAuteur();
          livre10.afficherAuteur();

          System.out.println('\n'); // On saut des lignes pour la visibilité dans le terminal
  
          // Emprunt de certains livres
          bibliotheque.emprunterLivre(livre1);
          bibliotheque.emprunterLivre(livre1);
          bibliotheque.emprunterLivre(livre5);
          bibliotheque.emprunterLivre(livre10);

          System.out.println('\n'); // On saut des lignes pour la visibilité dans le terminal
  
          // Rendu de certains livres
          bibliotheque.rendreLivre(livre1);
          bibliotheque.rendreLivre(livre2);
          bibliotheque.rendreLivre(livre5);

          System.out.println('\n');
    }
    
}
