/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package linkedlistpractica;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class LinkedListPractica {

    public static void main(String[] args) {
        System.out.println("\tPrueba de addLast");
        LinkedList<String> l1= new LinkedList<String>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        System.out.println("añadidos...");
        
        System.out.println("\n\tPrueba de size");
        System.out.println( l1.size());
        
        System.out.println("\n\tPrueba Imprimir lista");
        l1.imprimirLinked();

    }
}
