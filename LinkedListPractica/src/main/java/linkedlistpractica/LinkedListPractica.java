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
        l1.add("4");
        System.out.println("agregados...");
        
        System.out.println("\n\tPrueba de size");
        System.out.println( l1.size());
        
        System.out.println("\n\tPrueba Imprimir lista");
        l1.imprimirLinked();
        System.out.println("\n\tPrueba Unir listas");
        LinkedList<String> l2= new LinkedList<String>();
        l2.add("p1");
        l2.add("p2");
        l2.add("p3");
        l1.unirLista(l2);
        l1.imprimirLinked();
        
        
        
    }
}
