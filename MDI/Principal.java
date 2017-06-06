/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author dabri
 */
public class Principal extends JFrame implements ActionListener{
    private JMenuBar jmenuBar;
    private JMenuItem subMenu;
    private JMenuItem jmItemAgregarPelicula;
    JDesktopPane desktopPane;
    
    public Principal(){
     super();
        this.setSize(1100, 900);
        this.desktopPane = new JDesktopPane();
        this.desktopPane.setLayout(null);

        init();
        this.getContentPane().add(this.desktopPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
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
        }
    }
}
