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
public class Genre {
    

    private String name, code;

    public Genre() {
        this.name="";
        this.code="";
    }//constructor

    public Genre(String name, String code) {
        this.name = name;
        this.code=code;
    }//constructor name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.name + " code=" + this.code + " ";
    }//toString   
}
