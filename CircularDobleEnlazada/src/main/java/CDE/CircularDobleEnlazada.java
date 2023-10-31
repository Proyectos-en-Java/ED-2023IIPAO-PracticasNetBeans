/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CDE;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class CircularDobleEnlazada {

    public static void main(String[] args) {
        System.out.println("Inicio");
        LCD<String> lcd1= new LCD<String>();
        lcd1.add("e1");
        lcd1.add("e2");
        lcd1.add("e3");
        lcd1.add("e4");
        lcd1.add("e5");
        lcd1.imprimirLinked();
//        System.out.println(lcd1.getStart().getContenido());
//        System.out.println(lcd1.getStart().getSiguiente().getContenido());
//        System.out.println(lcd1.getStart().getSiguiente().getSiguiente().getContenido());
//        System.out.println(lcd1.getStart().getPrevio().getContenido());
    }
}
