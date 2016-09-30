package io.zipcoder.pets;

/**
 * Created by jahmellcrawford on 9/26/16.
 */
public class Bird extends Pets {

    public Bird(String names, String types) {
        super(names, types);
    }

    @Override
    public void petSpeak() {
        super.petSpeak();
        System.out.println("Chirp, chirp");
    }
}
