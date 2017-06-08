/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import static javax.swing.JFrame.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author dabri
 */
public class Principal extends JFrame implements ActionListener{
    private JMenuBar jmenuBar;
    private JMenuItem subMenu;
    private JMenuItem jmItemAgregarPelicula;
    public InputStream fondo = this.getClass().getResourceAsStream("/assets/fondo_abstract.jpg");
    JDesktopPane desktopPane;
    
    public Principal(){
     super();
        this.setSize(1100, 900);
        this.desktopPane = new JDesktopPane();
        this.desktopPane.setLayout(null);

        init();
        
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
        }//if (e.getSource()==jmItemAgregarPelicula)
    }//actionPerformed
    
}//END Principal
