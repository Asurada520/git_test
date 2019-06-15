package com.test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {

        try {

            char[] test = {'c','h'};

            FileWriter fileWriter = new FileWriter("d:\\test.txt");
            fileWriter.write(test);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
