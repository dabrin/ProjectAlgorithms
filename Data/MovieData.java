/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Movie;
//import MDI.Principal;
//import java.awt.List;
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
    public void readFile(String path) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "||");
        }
        scanner.close();
        
    }
}
