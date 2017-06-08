/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

<<<<<<< HEAD
import Domain.Movie;
//import MDI.Principal;
//import java.awt.List;
import java.io.*;
import java.util.*;
=======
import Domain.*;
//import java.awt.List.*;
import java.io.*;
import java.util.*;

>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
/**
 *
 * @author dabri
 */
public class MovieData {
<<<<<<< HEAD
    private ArrayList<Movie> list = new ArrayList<Movie>();
    public MovieData() {
    }
    public void readFile(String path) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "||");
        }
        scanner.close();
        
    }
=======

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

>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
}
