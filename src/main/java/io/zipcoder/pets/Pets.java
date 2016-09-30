package io.zipcoder.pets;

/**
 * Created by jahmellcrawford on 9/26/16.
 */

public abstract class Pets {

    private String name;
    private String type;

    public Pets(String names, String types) {

        name = names;
        type = types;

    }


    public void petSpeak() {

        System.out.println("generic sounds");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}






