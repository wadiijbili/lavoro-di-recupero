/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alunno
 */
public class ECommerce {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Prodotto> carrello = new ArrayList();
        ArrayList <Prodotto> prodotti = new ArrayList();
        Prodotto DVD = new Prodotto("dvd","eletronica",15);
        Prodotto CELLULARE = new Prodotto("cellulare","eletronica",100);
        Prodotto MAGLIETTA = new Prodotto("maglietta","indumenti",5);
        Prodotto SCARPE = new Prodotto("scarpe","indumenti",50);
        
        prodotti.add(DVD);
        prodotti.add(SCARPE);
        prodotti.add(CELLULARE);
        prodotti.add(MAGLIETTA);
        
        Scanner scelta = new Scanner(System.in);
        
        System.out.println("------MENU------");
        System.out.println("1. VISUALIZZA PRODOTTI");
        System.out.println("2. AGGIUNGI PRODOTTI AL CARELLO");
        System.out.println("3. RICERCA PRODOTTI PER CATEGORIA");
        System.out.println("4. STAMPA CONTENUTO CARRELLO");
    
        switch(scelta.nextLine()){
            case "1":
             /*   System.out.println(DVD.getNome()+" "+ DVD.getCategoria()+" "+ DVD.getPrezzo()+"€");
                System.out.println(CELLULARE.getNome()+" "+ CELLULARE.getCategoria()+" "+ CELLULARE.getPrezzo()+"€");
                System.out.println(MAGLIETTA.getNome()+" "+ MAGLIETTA.getCategoria()+" "+ MAGLIETTA.getPrezzo()+"€");
                System.out.println(SCARPE.getNome()+" "+ SCARPE.getCategoria()+" "+ SCARPE.getPrezzo()+"€");
            */
                for(int i=0; i < prodotti.size(); i++){
                System.out.print(prodotti.get(i).getNome()+" ");
                System.out.print(prodotti.get(i).getCategoria()+" ");
                System.out.print(prodotti.get(i).getPrezzo()+"€");
                System.out.println();
                }
                break;
            case "2":
                for(int c = 0;c != 0;){
                    
                System.out.println("quale prodotto desideri aggiungere?");
                
                for(int i=0; i < prodotti.size(); i++){
                System.out.print(prodotti.get(i).getNome()+" ");
                System.out.print(prodotti.get(i).getCategoria()+" ");
                System.out.print(prodotti.get(i).getPrezzo()+"€");
                System.out.println();
                }
                
                carrello.add();
                
                
                }
        }
        
        

                
    }

    
    
    
    
}
