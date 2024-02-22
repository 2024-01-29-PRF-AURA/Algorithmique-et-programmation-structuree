import java.util.Scanner;
import java.util.Random;

//Ma classe TP4 sert simplement à exécuter le code et les fonctions de mes autres classes 
//Dans le main (c'est à dire le programme principale executé), je peux créer des objets Exercice1, Exercice2 ...

public class TP4 {
    // Fonction main = Début de mon programme
    public static void main(String[] args) {

        // ########################################################################
        // EXERCICE 1
        // ########################################################################

        System.out.println("\nEXERCICE 1");

        // Je crée mon objet de type "Exercice1" et je l'appelle e1
        Exercice1 e1 = new Exercice1();
        // resultatFonction prend la valeur de la somme de 1 et 2
        int resultatFonction = e1.somme(1,2);
        
        // On affiche la variable
        System.out.println(resultatFonction);

        // ########################################################################
        // EXERCICE 2
        // ########################################################################

        System.out.println("\nEXERCICE 2");
        Exercice2 e2 = new Exercice2();
        e2.choisirMois(5);

        // ########################################################################
        // EXERCICE 3
        // ########################################################################

        System.out.println("\nEXERCICE 3");
        Exercice3 e3 = new Exercice3();
        e3.afficherPhrase();

        // ########################################################################
        // EXERCICE 4
        // ########################################################################

        System.out.println("\nEXERCICE 4");
        Exercice4 e4 = new Exercice4();
        e4.demanderAge(15);

        // ########################################################################
        // EXERCICE 5
        // ########################################################################

        System.out.println("\nEXERCICE 5");
        Exercice5 e5 = new Exercice5();
        int somme5 = e5.sommeNombres(5);
        System.out.println(somme5);
        int somme15 = e5.sommeNombres(15);
        System.out.println(somme15);
        // Ici instructions

        // ########################################################################
        // EXERCICE 6
        // ########################################################################


        System.out.println("\nEXERCICE 6");
        Exercice6 e6 = new Exercice6();
        int[] tab = {0,8,9,10,12,15};
        e6.afficherTableau(tab);
        // Ici instructions

        // ########################################################################
        // EXERCICE 7
        // ########################################################################
    
        System.out.println("\n\nEXERCICE 7");
        Exercice7 e7 = new Exercice7();
        e7.nombreAleatoire();
    }
}


class Exercice1 {
    // Création de la ou des fonctions de mon exercice
    public int somme(int nombre1, int nombre2) {
        int resultat = nombre1 + nombre2;
        return resultat;
    }
}
class Exercice2 {
    public void choisirMois(int nombre) {
        if (nombre == 1) {
            System.out.println("Janvier");
        } else if (nombre == 2) {
            System.out.println("Février");
        } else if (nombre == 3) {
            System.out.println("Mars");
        } else if (nombre == 4) {
            System.out.println("Avril");
        } else if (nombre == 5) {
            System.out.println("Mai");
        } else if (nombre == 6) {
            System.out.println("Juin");
        } else if (nombre == 7) {
            System.out.println("Juillet");
        } else if (nombre == 8) {
            System.out.println("Août");
        } else if (nombre == 9) {
            System.out.println("Septembre");
        } else if (nombre == 10) {
            System.out.println("Octobre");
        } else if (nombre == 11) {
            System.out.println("Novembre");
        } else if (nombre == 12) {
            System.out.println("Décembre");
        } else {
            System.out.println("Nombre incorrect");
        }
    }
}

class Exercice3 {
    public void afficherPhrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir du texte : ");
        String texteSaisi = scanner.nextLine();
        System.out.println("Votre phrase est " + texteSaisi);
        scanner.close();
    }
    
}
class Exercice4 {
    public void demanderAge(int age) {
        if(age < 18) {
            System.out.println("Vous etes mineur");
        }
        else if (age == 18) {
            System.out.println("Vous avez exactement 18 ans");
        } 
        else {
            System.out.println("Vous etes majeur");
        }
    }
  
}
class Exercice5 {
    public int sommeNombres(int n) {
        int resultat = 0;
        for(int i = 1; i <= n; i++) {
            resultat = i + resultat;
        }
        return resultat;
    }
}
class Exercice6 {
    public void afficherTableau(int[] tab) {
        for(int i = 0; i < tab.length; i++) {
            if(i == tab.length-1) {
                System.out.print(tab[i]);
            } 
            else {
                System.out.print(tab[i] + "-");
            }
        }
    }
}
class Exercice7 {
    public void nombreAleatoire() {
        Random rand = new Random();
        int nombreChoisi = 0; // Initialisation du nombre choisi
        int essais = 0;

        // Boucle tant que le nombre choisi n'est pas égal à 10
        while (nombreChoisi != 10) {
            // Choix d'un nombre aléatoire entre 1 et 10
            nombreChoisi = rand.nextInt(10) + 1;
            essais++; // Incrémente le nombre d'essais à chaque itération
        }

        System.out.println("Le nombre 10 a ete choisi apres " + essais + " essais.");
    }
}