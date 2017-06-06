/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.*;
import java.awt.List;
import java.io.*;
import java.util.*;

/**
 *
 * @author dabri
 */
public class MovieData {

    private ArrayList<Movie> list = new ArrayList<Movie>();

    public MovieData() {
    }

    public void readFile() throws FileNotFoundException, IOException {

        String[] row = null;
        String csvFilename = "C:\\work\\sample.csv";

        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
        List content = csvReader.readAll();

        for (Object object : content) {
            row = (String[]) object;

            System.out.println(row[0]
                    + " # " + row[1]
                    + " #  " + row[2]);
        }
//...
        csvReader.close();
    }

}
