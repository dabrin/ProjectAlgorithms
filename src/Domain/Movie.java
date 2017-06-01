/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author dabri
 */
public class Movie {
    
    private String title;
    private Genre genre;
    private double duration;

    public Movie() {
        this.title="";
        this.genre=new Genre(this.genre.getName());
        this.duration=0;
    }//constructor

    public Movie(String title, Genre genre, double duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }//constructor title genre duration

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie: " + "title= " + this.title + ", genre= " + this.genre.toString() + ", duration=" + this.duration + "\n";
    }//toString
    
    
}//END Movie
