/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;

/**
 *
 * @author wadii
 */
public class frame extends JFrame {

    private JTextArea area = new JTextArea();
    private JButton p1 = new JButton("1. VISUALIZZA PRODOTTI");
    private JButton p2 = new JButton("2. AGGIUNGI PRODOTTI AL CARELLO");
    private JButton p3 = new JButton("3. RICERCA PRODOTTI PER CATEGORIA");
    private JButton p4 = new JButton("4. STAMPA CONTENUTO CARRELLO");
    

    public frame() {
        super();

        setLayout(new BorderLayout());

        JFrame pagina = new JFrame("PAGINA E COMMERCE");
        
        

        add(p1, BorderLayout.PAGE_START);
        p1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                

            }
        });
        
        
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
        add(p4, BorderLayout.EAST);

        setSize(1000, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
