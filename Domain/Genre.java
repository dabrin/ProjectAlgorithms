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

<<<<<<< HEAD
    public Genre(String name, String code) {
        this.name = name;
        this.code=code;
=======
<<<<<<< HEAD
    public Genre(String name, String code) {
        this.name = name;
        this.code=code;
=======
    public Genre(String name) {
        this.name = name;
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
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
<<<<<<< HEAD
        return this.name + " code=" + this.code + " ";
    }//toString   
}
=======
<<<<<<< HEAD
        return this.name + " code=" + this.code + " ";
    }//toString   
}
=======
        return this.name + ", genre code=" + this.code + "\n";
    }//toString
}//END
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
