/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDI;

import Business.MovieBusiness;
import MDI.Principal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private JTextField jtxField;
    public InputStream fondo = this.getClass().getResourceAsStream("/assets/fondo_abstract2.jpg");

    public ShowMovie() {
        super();
        this.setSize(new Dimension(800, 600));
        this.setLayout(null);
        this.setClosable(true);
        init();
    }//constructor

    public void init() {
        this.jtxField = new JTextField();
        this.jtxField.setBounds(500, 200, 130, 30);
        this.setEnabled(false);
        this.add(this.jtxField);

        this.jcomboListado = new JComboBox();
        this.jcomboListado.setBounds(134, 100, 200, 30);
        this.jcomboListado.addActionListener(this);
        this.jcomboListado.setEditable(true);

        for (int i = 0; i < 10; i++) {
            this.jcomboListado.addItem("" + i);
        }//for i

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

        this.jbtnLoadMovies = new JButton("Load Movies");
        this.jbtnLoadMovies.setBounds(200, 40, 130, 30);
        this.jbtnLoadMovies.setEnabled(false);
        this.jbtnLoadMovies.addActionListener(this);
        this.add(this.jbtnLoadMovies);

        this.jbtnLoadFiles = new JButton("Load File");
        this.jbtnLoadFiles.setBounds(500, 100, 130, 30);
        this.jbtnLoadFiles.addActionListener(this);
        this.add(this.jbtnLoadFiles);

        this.jlbSearching = new JLabel("Search Movie:");
        this.jlbSearching.setBounds(30, 100, 120, 30);
        this.add(jlbSearching);

        this.jlbShowMovies = new JLabel("Movie List");
        this.jlbShowMovies.setBounds(30, 170, 120, 30);
        this.add(this.jlbShowMovies);

    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnLoadFiles) {
            this.jFileChooser = new JFileChooser();
            // this.jFileChooser.showOpenDialog(null);
            this.jFileChooser.setCurrentDirectory(new java.io.File("."));
            this.jbtnLoadMovies.setEnabled(true);
            File file = jFileChooser.getSelectedFile();
            this.jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            this.jFileChooser.setAcceptAllFileFilterUsed(false);

            if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                try {
                    System.out.println("getCurrentDirectory(): " + jFileChooser.getCurrentDirectory());
                    jtxField.setText(jFileChooser.getSelectedFile() + "");
                    String path = jFileChooser.getCurrentDirectory().getName();
                    System.err.println(path);

                    MovieBusiness movieB = new MovieBusiness();
                    movieB.readFile(jtxField.getText());
                } catch (IOException ex) {
                    Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                System.out.println("No Selection ");
            }
            this.jcomboMovieSearching.setEnabled(true);
            this.jcomboMovieSearching.setEditable(true);

        }if(e.getSource()==jbtnLoadMovies) {
            String out=this.jcomboMovieSearching.getName();
            JOptionPane.showMessageDialog(null, out);
        }
    }//actionPerformed

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getItem()=="Drama") {
            String selected = (String) jcomboMovieSearching.getSelectedItem();
                JOptionPane.showMessageDialog(null, selected);
//            this.setTitle(selected);
        }
    }
}
