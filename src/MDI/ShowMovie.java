/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import MDI.Principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author dabri
 */
public class ShowMovie extends JInternalFrame implements ActionListener, ItemListener {

    private JComboBox jcomboListado;
    private JTextArea TextAreaMovies;
    private JComboBox jcomboMovieSearching;
    private JLabel jlbSearching;
    private JLabel jlbShowMovies;
    private JLabel jlbLabelGenero;
    private JButton jbtnLoadMovies;
    private JButton jbtnLoadFiles;
    private JFileChooser jFileChooser;

    public ShowMovie() {
        super();
        this.setSize(new Dimension(800, 600));
        this.setLayout(null);
        this.setClosable(true);
        init();
    }

    public void init() {
        this.jcomboListado = new JComboBox();
        this.jcomboListado.setBounds(134, 100, 200, 30);
        this.jcomboListado.addActionListener(this);
        this.jcomboListado.setEditable(true);
        this.add(this.jcomboListado);

        this.jcomboMovieSearching = new JComboBox();
        this.jcomboMovieSearching.setBounds(100, 40, 100, 30);
        this.jcomboMovieSearching.setEnabled(false);
        this.jcomboMovieSearching.setEditable(false);
        jcomboMovieSearching.addItem("Drama");
        jcomboMovieSearching.addItem("Comedy");
        jcomboMovieSearching.addItem("Childish");
        jcomboMovieSearching.addItem("Action");
        jcomboMovieSearching.addItem("Romance");
        jcomboMovieSearching.addItem("Fiction");
        jcomboMovieSearching.addItemListener(this);
        this.add(jcomboMovieSearching);

        this.jlbLabelGenero = new JLabel("Genre:");
        this.jlbLabelGenero.setBounds(30, 40, 100, 30);
        this.add(jlbLabelGenero);

        this.TextAreaMovies = new JTextArea();
        this.TextAreaMovies.setBounds(30, 200, 300, 400);
        this.add(this.TextAreaMovies);

        this.jbtnLoadMovies = new JButton("Load Movie");
        this.jbtnLoadMovies.setBounds(200, 40, 130, 30);
        this.jbtnLoadMovies.setEnabled(false);
        this.jbtnLoadMovies.addActionListener(this);
        this.add(this.jbtnLoadMovies);
        
        this.jbtnLoadFiles=new JButton("Load File");
        this.jbtnLoadFiles.setBounds(500, 100, 130, 30);
        this.jbtnLoadFiles.addActionListener(this);
        this.add(this.jbtnLoadFiles);

        this.jlbSearching = new JLabel("Search Movie:");
        this.jlbSearching.setBounds(30, 100, 120, 30);
        this.add(jlbSearching);

        this.jlbShowMovies = new JLabel("Movie List");
        this.jlbShowMovies.setBounds(30, 170, 120, 30);
        this.add(this.jlbShowMovies);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnLoadFiles) {
            this.jFileChooser = new JFileChooser();
            this.jFileChooser.showOpenDialog(null);
            this.jbtnLoadMovies.setEnabled(true);
            this.jcomboMovieSearching.setEnabled(true);
            File file = jFileChooser.getSelectedFile();
            this.jcomboMovieSearching.setEditable(true);

        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource()==jcomboMovieSearching){
            String selected=(String)jcomboMovieSearching.getSelectedItem();
//            this.setTitle(selected);
        }
    }
}
