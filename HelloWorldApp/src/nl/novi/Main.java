package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Voorbeeld van output naar het scherm, tekst tussen aanhalingstekens wordt op het scherm getoond. Let erop dat de aanhalingstekens groen zijn, anders opnieuw typen.
        System.out.println("Hello World!");

        // Het aanmaken van een scanner object die we oponder gebruiken om gebruikers input te verwerken.
        Scanner input = new Scanner(System.in);

        // Het aanmaken van de 3 variabelen met een type, naam en een waarde.
        char currentPlayerToken = 'X';
        String name = "Alex";
        int age = 42;

        // Het weergeven van de 3 bovenstaande variabelen met behulp van System.out.println().
        System.out.println("De naam van de persoon is: " + name + "." );
        System.out.println("De token van deze persoon is: " + currentPlayerToken);
        System.out.println("De leeftijd is: " + age);

        // Het aanpassen van de 3 variabelen; de variabelen krijgen een nieuwe waarde. Deze worden daarna getoond via println();
        // Het is niet nodig om de type van de variabele er bij te plaatsen; dat doe je alleen bij het aanmaken van variabelen.
        name = "Frits";
        currentPlayerToken = 'O';
        age = 36;
        System.out.println("De naam van de persoon is: " + name + "." );
        System.out.println("De token van deze persoon is: " + currentPlayerToken);
        System.out.println("De leeftijd is: " + age);

        // Het aanpassen van de int-variabelen met operators ++, -- en rekenkundige operators.
        age++;
        System.out.println("De leeftijd is: " + age);
        age = (age * 4);
        System.out.println("De leeftijd is: " + age);
        age--;
        System.out.println("De leeftijd is: " + age);

        // Input van gebruiker vragen,  opslaan in een variabelen en daarna tonen op het scherm.
        System.out.print("Voer naam in: ");
        name = input.nextLine(); // Met nextLine()-methode kan je tekst opvragen en opslaan. "input" moet overeenkomen met de naam die je op regel 13 hebt gekozen voor het Scanner object.
        name = name.toUpperCase(); // Met de toUpperCase()-methode wordt de invoer van de gebruiker omgezet naar hoofdletters.
        System.out.println("Je naam is: " + name);
        System.out.println("Het aantal karakters van je naam is: " + name.length());
        System.out.print("Voer leeftijd in: ");
        age = input.nextInt(); // Met de nextInt()-methode kan je een getal opvragen en opslaan.
        System.out.println("Je leeftijd is: " + age);

        // Keuzeconstrcutie. Wanneer iemand ouder dan 18 (of 18 is) dan wordt de tekst "Welkom bij mijn gok app" weergegeven
        if(age >= 18) {
            System.out.println("Welkom bij mijn gok app");
        }
        else { // Wanneer iemand jonger dan 18 is, dan wordt daar tekst over weergegeven en de applicatie afgesloten.
            System.out.println("Je bent te jong, applicatie wordt afgesloten");
            System.exit(0);
        }

    }
}
