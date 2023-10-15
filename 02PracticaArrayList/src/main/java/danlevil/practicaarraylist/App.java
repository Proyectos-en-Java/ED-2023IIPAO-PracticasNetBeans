/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package danlevil.practicaarraylist;

import java.util.List;

/**
 *
 * @author danlevil
 */
public class App {

    public static void main(String[] args) {
        System.out.println("02practicaRecursion");
        List <String> l1 = new ArrayList();
        
        l1.add( "0nuevoPal");
        l1.add( "1nuevoPaal");        
        l1.add( "2nuevoPal");
        l1.add( "3nuevoaaaaPal");
        l1.add( "4nuevoaaaaPal");
        l1.add( "5nuevoaaaaPal");
        l1.add( "6nuevoaaaaPal");
        l1.add( "7nuevoaaaaPal");
        l1.add( "8nuevoaaaaPal");
        l1.add( "9nuevoaaaaPal");//aqui se corta
       l1.add( "10nuevoaaaaPal");
       l1.add( "12nuevoaaaaPal");
       l1.add( "10nuevoaaaaPal");
       l1.add( "12nuevoaaaaPal");
       l1.add( "10nuevoaaaaPal");
       l1.add( "12nuevoaaaaPal");
       l1.add( "10nuevoaaaaPal");
       l1.add( "12nuevoaaaaPal");
       l1.add( "10nuevoaaaaPal");
       l1.add( "12nuevoaaaaPal");


        System.out.println("\n");

        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        
        
        
    }
}
