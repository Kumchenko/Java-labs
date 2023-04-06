package edu.ntudp.fit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ntudp.fit.controller.InterfaceAdapter;
import edu.ntudp.fit.controller.JsonManager;
import edu.ntudp.fit.controller.UniversityCreator;
import edu.ntudp.fit.model.Structure;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world! Beginning work");

        UniversityCreator universityCreator = new UniversityCreator();
        Structure university = universityCreator.create();

        Writer writer = new FileWriter("test.json");
        Reader reader = new FileReader("test.json");

        Gson gson = new GsonBuilder()
                .registerTypeHierarchyAdapter(Structure.class, new InterfaceAdapter<Structure>())
                .setPrettyPrinting()
                .create();

        String uniString = gson.toJson(university);
        Structure universityNew = gson.fromJson(uniString, Structure.class);

        System.out.println(university.equals(universityNew));
    }
}