/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

<<<<<<< HEAD
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import static javax.swing.JFrame.*;
import javax.swing.*;
import javax.swing.border.*;
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea

/**
 *
 * @author dabri
 */
public class Principal extends JFrame implements ActionListener{
    private JMenuBar jmenuBar;
    private JMenuItem subMenu;
    private JMenuItem jmItemAgregarPelicula;
<<<<<<< HEAD
    public InputStream fondo = this.getClass().getResourceAsStream("/assets/fondo_abstract.jpg");
=======
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
    JDesktopPane desktopPane;
    
    public Principal(){
     super();
        this.setSize(1100, 900);
        this.desktopPane = new JDesktopPane();
        this.desktopPane.setLayout(null);

        init();
<<<<<<< HEAD
        
        loadImage(desktopPane, fondo);
        this.getContentPane().add(this.desktopPane); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//constructor
    
    public void loadImage(JDesktopPane desktopPane, InputStream fileImage) {
        try {
            BufferedImage image = ImageIO.read(fileImage);
            desktopPane.setBorder((Border) new Fondo(image));
        } catch (Exception e) {
        }//catch Exception e
    }//cargarImagen

=======
        this.getContentPane().add(this.desktopPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
<<<<<<< HEAD
    }//constructor
    
=======
    }
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
    public void init(){
         this.jmenuBar = new JMenuBar();
        this.setJMenuBar(this.jmenuBar);

        subMenu = new JMenu("Opciones");
        jmenuBar.add(subMenu);
        this.jmenuBar.setBounds(0, 0, 70, 30);
        
        this.jmItemAgregarPelicula = new JMenuItem("Agregar Pelicula");
        this.jmItemAgregarPelicula.addActionListener(this);
        subMenu.add(jmItemAgregarPelicula);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jmItemAgregarPelicula){
            ShowMovie movie=new ShowMovie();
            desktopPane.add(movie);
            movie.show();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
        }//if (e.getSource()==jmItemAgregarPelicula)
    }//actionPerformed
    
}//END Principal
<<<<<<< HEAD
=======
=======
        }
    }
}
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
