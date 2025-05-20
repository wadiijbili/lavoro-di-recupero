/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunno   
 */
public class Gestione extends Prodotto{
     File file = new File("tabella.csv");

    public Gestione(String nome, String categoria, float prezzo) {
        super(nome, categoria, prezzo);
    }
     
     public ArrayList<String> nome() throws FileNotFoundException, IOException{
         ArrayList<String> arr = new ArrayList<>();
         BufferedReader br = new BufferedReader(new FileReader(file));
         String line;
         while((line = br.readLine())!= null){
             arr.add(line);
         }
         return arr;
     } 
     public void scrivi() throws IOException{
         BufferedWriter wr = new BufferedWriter(new FileWriter(file));
         wr.write("ciao");
     }
}
