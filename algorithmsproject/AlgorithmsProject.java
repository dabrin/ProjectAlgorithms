/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsproject;

<<<<<<< HEAD
import Domain.Genre;
import Domain.ListCircular;
import Domain.Movie;
import MDI.Principal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
=======
import MDI.Principal;
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff

/**
 *
 * @author dabri
 */
public class AlgorithmsProject {
<<<<<<< HEAD

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ListCircular list=new ListCircular();
        Genre genre=new Genre();
        genre=new Genre("Accion","4000");
        
        list.insertarInicio(new Movie("12",genre,2.00,2,1,1));
        list.insertarInicio(new Movie("123",genre,2.00,2,1,1));
        list.insertarInicio(new Movie("124",genre,2.00,2,1,1));
       list.insertarInicio(new Movie("125",genre,2.00,2,1,1));
       list.searchNode(new Movie("125",genre,2.00,2,1,1));
//        
        list.printList();
        Principal principal = new Principal();
        principal.setVisible(true);

    }

=======
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Principal principal=new Principal();
       principal.setVisible(true);
       
    }
    
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
}
