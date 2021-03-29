package com.techelevator;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

public class FlowerInput {

    public String[] ImportFlowerInput() {
        String[] flowers = parseInputFileByLine(new File("FlowerInput.csv"));
        populateFlowers(flowers);
        return flowers;
    }

    private void populateFlowers(String[] flowers) {
    }

    private String[] parseInputFileByLine(File file) {
        return new String[0];
    }

}

