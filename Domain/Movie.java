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
    private int total;
    private int subtitle;
    private int premier;

    public Movie() {
        this.title="";
        this.genre=new Genre(this.genre.getName(),this.genre.getCode());
        this.duration=0.0;
    }//constructor

    public Movie(String title, Genre genre, double duration, int total, int subtitle, int premier) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.total = total;
        this.subtitle = subtitle;
        this.premier = premier;
    }

   //constructor title genre duration

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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(int subtitle) {
        this.subtitle = subtitle;
    }

    public int getPremier() {
        return premier;
    }
    public void setPremier(int premier) {
        this.premier = premier;
    }
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", genre=" + genre + ", duration=" + duration + ", total=" + total + ", subtitle=" + subtitle + ", premier=" + premier + '}';
    }
}//END Movie
