package com.practice.springboot.hogwartsartifactsonline.artifact;

public class ArtifactNotFoundException extends RuntimeException {

    public ArtifactNotFoundException(String Id) {
        super("Could not find the artifact with ID: " + Id + " :(" );
    }
}
