package com.sydney.lo.read.in.csv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main( String[] args ) {
        Main.readFileUsingBufferedReader("yob2012short.csv");
    }

    /**
     * Reads in a CSV file and stores the data in HashMap where the key is the line number and
     * the value is an ArrayList<String> of the values.
     *
     * @param filename The name of the file to be opened.
     */
    public static HashMap<Integer, ArrayList<String>> readFileUsingBufferedReader(String filename) {
        File file = new File(filename);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        return new HashMap<Integer, ArrayList<String>>();
    }
}
