package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Generator generator = new Generator(1500, 5);
        generator.printResults("src/main/resources/label_array_data.txt");
    }
}