package GameLogic;

import java.util.Random;
import java.util.Scanner;

public class SortingHat {

    public void assignHouse(String houseName, Player player) {
        String name = askForName();
        switch (houseName.toLowerCase()) {
            case "gryffondor":
                System.out.println("Vous êtes courageux et déterminé, " + name + "! Bienvenue à Gryffondor !");
                player.setDefense(player.getDefense() + 10);
                break;
            case "poufsouffle":
                System.out.println("Vous êtes loyal et honnête, " + name + "! Bienvenue à Poufsouffle !");
                player.setBonusPotion(20);
                break;
            case "serdaigle":
                System.out.println("Vous êtes intelligent et curieux, " + name + "! Bienvenue à Serdaigle !");
                player.setAccuracy(player.getAccuracy() + 10);
                break;
            case "serpentard":
                System.out.println("Vous êtes ambitieux et rusé, " + name + "! Bienvenue à Serpentard !");
                player.setStrength(player.getStrength() + 10);
                break;
            default:
                System.out.println("La maison que vous avez choisie n'existe pas.");
                System.out.println("Réessayez avec Gryffondor, Poufsouffle, Serdaigle, ou Serpentard.");
                String newHouseName = new Scanner(System.in).nextLine();
                assignHouse(newHouseName, player);
        }
    }

    private String askForName() {
        System.out.println("Comment vous appelez-vous ?");
        return new Scanner(System.in).nextLine();
    }

    public String randomHouse() {
        Random random = new Random();
        String[] houses = {"Gryffondor", "Poufsouffle", "Serdaigle", "Serpentard"};
        int index = random.nextInt(houses.length);
        return houses[index];
    }

}


