package io.zipcoder.pets;

import java.util.Scanner;
import java.util.ArrayList;

public class UserPets {

    Scanner scan = new Scanner(System.in);
    public ArrayList<Pets> listOfPets = new ArrayList<>();

    int petCount;

    public void askNumOfPets() {
        System.out.println("Hello! How many pet/pets do you have?");
        petCount = scan.nextInt();
        if (petCount <= 0) {
            System.out.println("You do not have enough pets");
            askNumOfPets();
        }

    }

    public String askPetNames() {
        System.out.println("What is the name of your pet/pets?");
        return scan.next();
    }

    public String askPetTypes() {
        System.out.println("What type of pet/pets do you have?");
        return scan.next();
    }

    public void petGroup() {

        this.askNumOfPets();

        while (petCount > 0) {
            String name = askPetNames();
            String types = askPetTypes();

            switch (types) {
                case "cat":
                    listOfPets.add(new Cat(name, types));
                    break;

                case "dog":
                    listOfPets.add(new Dog(name, types));
                    break;

                case "bird":
                    listOfPets.add(new Bird(name, types));
                    break;

                default:
                    System.out.println("Sorry, we don't support your animal type");
            }

            petCount--;
        }

    }

    public void printPetList() {
        System.out.println("You have" + " " + listOfPets.size() + " " + "pets");
        for (int i = 0; i < listOfPets.size(); i++) {
            System.out.println("Your pet/pets name is" + " " + listOfPets.get(i).getName());
            System.out.println("Your pet/pets is a " + listOfPets.get(i).getType());


        }
    }

}