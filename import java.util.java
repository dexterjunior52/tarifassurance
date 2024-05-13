 import java.util.Scanner;

public class CategorieAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir l'âge : ");
        int age = scanner.nextInt();

        String categorie;

        if (age < 5) {
            categorie = "Trop jeune";
        } else if (age >= 5 && age <= 6) {
            categorie = "Débutant";
        } else if (age >= 7 && age <= 8) {
            categorie = "Poussin";
        } else if (age >= 9 && age <= 10) {
            categorie = "Benjamin";
        } else if (age >= 11 && age <= 12) {
            categorie = "Pupille";
        } else if (age >= 13 && age <= 14) {
            categorie = "Minime";
        } else if (age >= 15 && age <= 16) {
            categorie = "Cadet";
        } else if (age >= 17 && age <= 18) {
            categorie = "Junior";
        } else if (age >= 19 && age <= 34) {
            categorie = "Sénior";
        } else {
            categorie = "Vétéran";
        }

        System.out.println("Catégorie : " + categorie);
    }
}