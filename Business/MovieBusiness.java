/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Data.MovieData;
import java.io.IOException;
/**
 *
 * @author dabri
 */
public class MovieBusiness {
      private MovieData movieD;
    public MovieBusiness(){
      this.movieD=new MovieData();
    }
    public void readFile(String path) throws IOException{
        this.movieD.readFile(path);
    }
}
