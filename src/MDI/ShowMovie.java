/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;
import MDI.Principal;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dabri
 */
public class ShowMovie extends JInternalFrame implements ActionListener{
    
    private JComboBox jcomboListado;
    private JTextArea TextAreaMovies;
    private JTextField jtfMovieSearching;
    private JLabel jlbSearching;
    private JLabel jlbShowMovies;
    private JLabel jlbLabelGenero; 
    private JButton jbtnSearch;
    
    public ShowMovie (){
        super();
         this.setSize(new Dimension(800, 600));
        this.setLayout(null);
        this.setClosable(true);
        init();
    }
    public void init(){
        this.jcomboListado=new JComboBox();
        this.jcomboListado.setBounds(134, 100, 200, 30);
        this.jcomboListado.addActionListener(this);
        this.jcomboListado.setEditable(true);
        this.add(this.jcomboListado);
        
        this.jtfMovieSearching=new JTextField();
        this.jtfMovieSearching.setBounds(100,40,100 ,30);
        this.jtfMovieSearching.setEditable(true);
        this.add(jtfMovieSearching);
        
        this.jlbLabelGenero=new JLabel("Genero:");
        this.jlbLabelGenero.setBounds(30, 40, 100, 30);
        this.add(jlbLabelGenero);
        
        this.TextAreaMovies=new JTextArea();
        this.TextAreaMovies.setBounds(30, 200, 300,400);
        this.add(this.TextAreaMovies);
        
        this.jbtnSearch=new JButton("Cargar Peliculas");
        this.jbtnSearch.setBounds(200, 40, 130, 30);
        this.jbtnSearch.addActionListener(this);
        this.add(this.jbtnSearch);
        
        this.jlbSearching=new JLabel("Buscar la pelicula:");
        this.jlbSearching.setBounds(30, 100, 120, 30);
        this.add(jlbSearching);
        
        this.jlbShowMovies=new JLabel("Listado de peliculas");
        this.jlbShowMovies.setBounds(30,170,120,30);
        this.add(this.jlbShowMovies);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
