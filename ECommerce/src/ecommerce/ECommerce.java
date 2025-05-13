/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alunno
 */
public class ECommerce {

    public ECommerce(){
        JFrame frame = new JFrame(); //crea la finestra
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(10, 10));
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ECommerce");
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         new ECommerce();
        
        
        
        
        
        
        
        
        
        
        
        /*
        ArrayList<Prodotto> carrello = new ArrayList();
        ArrayList<Prodotto> prodotti = new ArrayList();
        Prodotto dvd = new Prodotto("dvd", "eletronica", 15);
        Prodotto cellulare = new Prodotto("cellulare", "eletronica", 100);
        Prodotto maglietta = new Prodotto("maglietta", "indumenti", 5);
        Prodotto scarpe = new Prodotto("scarpe", "indumenti", 50);

        prodotti.add(dvd);
        prodotti.add(scarpe);
        prodotti.add(cellulare);
        prodotti.add(maglietta);
        

        Scanner scelta = new Scanner(System.in);
        int h = 0;

        while (h == 0) {
            menu();
            switch (scelta.nextLine()) {
                case "1":
                    //  System.out.println(DVD.getNome()+" "+ DVD.getCategoria()+" "+ DVD.getPrezzo()+"€");
              //    System.out.println(CELLULARE.getNome()+" "+ CELLULARE.getCategoria()+" "+ CELLULARE.getPrezzo()+"€");
             //     System.out.println(MAGLIETTA.getNome()+" "+ MAGLIETTA.getCategoria()+" "+ MAGLIETTA.getPrezzo()+"€");
            //      System.out.println(SCARPE.getNome()+" "+ SCARPE.getCategoria()+" "+ SCARPE.getPrezzo()+"€");
                     
                    for (int i = 0; i < prodotti.size(); i++) {
                        System.out.print(prodotti.get(i).getNome() + " ");
                        System.out.print(prodotti.get(i).getCategoria() + " ");
                        System.out.print(prodotti.get(i).getPrezzo() + "€");
                        System.out.println();
                    }
                    break;
                case "2":
                    int c = 0;
                    while (c == 0) {

                        System.out.println("quale prodotto desideri aggiungere?");

                        for (int i = 0; i < 4; i++) {
                            System.out.print(prodotti.get(i).getNome() + " ");
                            System.out.print(prodotti.get(i).getCategoria() + " ");
                            System.out.print(prodotti.get(i).getPrezzo() + "€");
                            System.out.println();

                        }
                        
                            String input = scelta.nextLine();
                            for (Prodotto i : prodotti) {
                                if (i.getNome().equals(input)) {
                                    carrello.add(i);
                                }

                            }

                        
                        System.out.println("vuoi acquistare altro? si o no");
                        String replay = scelta.nextLine();
                        if ("si".equals(replay)) {
                            c = 0;
                        } else {
                            c = 1;
                        }

                    }
                    if (c == 1) {
                        break;
                    }

                case "3":
                    System.out.println("in base a quale categoria vuole ricercare i prodotti??");
                    Scanner ricerca = new Scanner(System.in);
                    String cate = ricerca.nextLine();
                    System.out.println("i prodotti appartenenti alla categoria "+cate+" sono :");
                    for (Prodotto i : prodotti) {
                                if (i.getCategoria().equals(cate)) {
                                    System.out.println(i.getNome() +" "+ i.getPrezzo()+ "€");
                                }

                            }

                    break;

                case "4":
                    for (int i = 0; i < carrello.size(); i++) {
                        System.out.print(carrello.get(i).getNome() + " ");
                        System.out.print(carrello.get(i).getCategoria() + " ");
                        System.out.print(carrello.get(i).getPrezzo() + "€");
                        System.out.println();
                    }
                    break;
                case "5":
                    return;
            }
        }

    }

    public static void menu() {

        System.out.println("------MENU------");
        System.out.println("1. VISUALIZZA PRODOTTI");
        System.out.println("2. AGGIUNGI PRODOTTI AL CARELLO");
        System.out.println("3. RICERCA PRODOTTI PER CATEGORIA");
        System.out.println("4. STAMPA CONTENUTO CARRELLO");
        System.out.println("5. CHIUDI PROGRAMMA");
    }
 */
}
}
