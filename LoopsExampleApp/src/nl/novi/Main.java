package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aanmaken van Scanner-object
        Scanner input  = new Scanner(System.in);
        System.out.println("Hoeveel studenten wil je invoeren? ");
        int amountStudents = input.nextInt(); // Gebruiker voert aantal studenten in, we vragen via de nextInt()-methode het getal op
        input.nextLine(); // Deze nextLine() moet je toevoegen als workaround
        // Als de gebruiker tekst invoert in plaats van een getal, dan crasht de applicatie. Zie hier hoe je dat kan oplossen:
        // https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner

        String[] students = new String[amountStudents]; // Aanmaken van een String-verzameling, die we in de for-lus gaan vullen met informatie

        // for-lus waarbij variable amountStudents wordt toegepast voor aantal herhalingen
        for(int i = 0; i < amountStudents; i++ ) {
            System.out.println("Voer studentnaam in: ");
            String studentName = input.nextLine(); // Via de nextLine()-methode vragen we de naam van de student op
            System.out.println("Student ingevoerd: " + studentName);

            students[i] = studentName; // Hier vullen we de String-verzameling, bij de 1e herhaling komt de studentnaam op positie 0, bij de 2e herhaling op positie 1, etc.
        }

        displayStudents(students); // We roepen hier onze eigen displayStudents-methode aan (die onder de main-methode is gedeclareerd), we geven de student-verzameling mee aan de methode als invoer.

        String student = retrieveStudent(students, 1); // We roepen hier onze eigen retrieveStudent-methode aan, deze geeft een String-variabele terug die we opslaan in onze student-String. We geven de students-verzameling mee en een getal.
        System.out.println("Naam van de student:" + student);

        System.out.println("Naam van de student:" + retrieveStudent(students, 1) ); // Hetzelfde als regel 30 & 31 alleen dan gecombineerd. We laten de teruggegeven String-variabele gelijk zien mbv System.out.println().

        System.out.println("Naam van de student:" + retrieveStudent(students, 4) );



        /*
        // Lus om 0 t/m 9 op het scherm te geven mbv for-lus
        for(int i  = 0; i < 10; i++) {
            System.out.println( i );
        }

        // Lus om 0 t/m 9 op het scherm te geven mbv while-lus
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        // Lus om 0 t/m 9 op het scherm te geven mbv do-while lus
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j > 10);  // Vervang > door < om de getallen 0 t/m 9 te zien; nu laat de do-while lus maar 1 keer een getal zien
*/
    }

    // Methode om alle informatie van studenten op het scherm te tonen
    public static void displayStudents(String[] input) {
        // for-lus om alle informatie uit de verzameling op het scherm te tonen
        for(int i = 0; i < input.length; i++) {
            System.out.println("Student in verzameling: " + input[i]);
        }
    }

    // Methode om 1 student op te vragen uit de verzameling
    public static String retrieveStudent(String[] input, int position) {
        if(position > input.length) { // Als de opgegeven positie groter is dan de lengte, dan is het een ongeldige positie. Dit om ArrayIndexOutOfBounds exception te voorkomen.
            System.out.println("Ongeldige positie");
            return "";
        }
        else {
            return input[position]; // Van de verzameling wordt de informatie van de oppgegeven positie teruggegeven.
        }
    }


}
