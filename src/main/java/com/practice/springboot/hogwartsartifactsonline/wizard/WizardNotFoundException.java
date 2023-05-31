package com.practice.springboot.hogwartsartifactsonline.wizard;

public class WizardNotFoundException extends RuntimeException{

    public WizardNotFoundException (Integer Id) {
        super("Could not find the artifact with ID: " + Id + " :(");
    }
}
