package edu.ntudp.fit;

import edu.ntudp.fit.controller.UniversityCreator;
import edu.ntudp.fit.model.Structure;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Beginning work");
        UniversityCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.create();
        System.out.println(university);
    }
}