/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alunno
 */
public class Frame extends JFrame implements ActionListener {

    JFrame frame = new JFrame(); //crea la finestra
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton pulsante = new JButton();
    JButton pulsante2 = new JButton();

    
    JLabel label= new JLabel();

    
    
    public Frame() {
        pulsante.setBounds( 100,100,100,100);
        pulsante.addActionListener(new ActionListener(){
        
         public void  actionPerformed(ActionEvent e){
         setContentPane(panel2);
                validate(); // Rinfresca il frame
    }
        });
        pulsante.setText("START");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(pulsante);
        
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setVisible(true);
        
        
        
        JMenu menuFile = new JMenu("MENU");
        menuFile.setVisible(true);
        
        
        JMenuItem itemVisualizza = new JMenuItem(" VISUALIZZA PRODOTTI");
        JMenuItem itemCarrello = new JMenuItem("AGGIUNGI PRODOTTI AL CARELLO");
        JMenuItem itemRicercaCategoria = new JMenuItem("RICERCA PRODOTTI PER CATEGORIA");
        JMenuItem itemStampaCarrello = new JMenuItem("STAMPA CONTENUTO CARRELLO");
        JMenuItem itemEsci = new JMenuItem("CHIUDI PROGRAMMA");
        menuFile.add(itemVisualizza);menuFile.addSeparator();
        menuFile.add(itemCarrello);menuFile.addSeparator();
        menuFile.add(itemRicercaCategoria);
        menuFile.addSeparator(); // Separatore visivo
        menuFile.add(itemStampaCarrello);menuFile.addSeparator();
         menuFile.add(itemEsci);
        menuBar.add(menuFile);
        panel2.add(menuBar);
        
        
        itemVisualizza.addActionListener( e -> JOptionPane.showMessageDialog(frame, "Nuovo file") );
       /*  itemCarrello.addActionListener();
        itemRicercaCategoria.addActionListener();
        itemStampaCarrello.addActionListener();*/
        itemEsci.addActionListener(e -> System.exit(0));
        
        
    }

    public static void menu() {

        System.out.println("------MENU------");
        System.out.println("1. VISUALIZZA PRODOTTI");
        System.out.println("2. AGGIUNGI PRODOTTI AL CARELLO");
        System.out.println("3. RICERCA PRODOTTI PER CATEGORIA");
        System.out.println("4. STAMPA CONTENUTO CARRELLO");
        System.out.println("5. CHIUDI PROGRAMMA");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


