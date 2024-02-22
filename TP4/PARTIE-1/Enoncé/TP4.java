//Ma classe TP4 sert simplement à exécuter le code et les fonctions de mes autres classes 
//Dans le main (c'est à dire le programme principale executé), je peux créer des objets Exercice1, Exercice2 ...

public class TP4 {
    // Fonction main = Début de mon programme
    public static void main(String[] args) {

        // ########################################################################
        // EXERCICE 1
        // ########################################################################

        System.out.println("EXERCICE 1");

        // Je crée mon objet de type "Exercice1" et je l'appelle e1
        Exercice1 e1 = new Exercice1();
        // resultatFonction prend la valeur de la somme de 1 et 2
        int resultatFonction = e1.somme(1,2);
        
        // On affiche la variable
        System.out.println(resultatFonction);

        // ########################################################################
        // EXERCICE 2
        // ########################################################################

        System.out.println("EXERCICE 2");
        // Ici instructions
        
        // ########################################################################
        // EXERCICE 3
        // ########################################################################

        System.out.println("EXERCICE 3");
        // Ici instructions

        // ########################################################################
        // EXERCICE 4
        // ########################################################################

        System.out.println("EXERCICE 4");
        // Ici instructions

        // ########################################################################
        // EXERCICE 5
        // ########################################################################

        System.out.println("EXERCICE 5");
        // Ici instructions

        // ########################################################################
        // EXERCICE 6
        // ########################################################################

        System.out.println("EXERCICE 6");
        // Ici instructions

        // ########################################################################
        // EXERCICE 7
        // ########################################################################
    
        System.out.println("EXERCICE 7");
        // Ici instructions
    }
}

class Exercice1 {
    // Création de la ou des fonctions de mon exercice
    public int somme(int nombre1, int nombre2) {
        int resultat = nombre1 + nombre2;
        return resultat;
    }
}
class Exercice3 {
    // Création fonction exercice 2 
}
class Exercice4 {
    // Création fonction exercice 3...
}
class Exercice5 {
    
}
class Exercice6 {
    
}
class Exercice7 {
    
}