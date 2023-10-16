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
        System.out.println("02practicaArrayList");
        List <String> l1 = new ArrayList();
        
        System.out.println("cE antes :"+l1.size()+'\n');

        l1.add("1");
        l1.add("2");

        l1.add( "3");        
        l1.add( "4");
        l1.add( "5");
        
        
        
        
        l1.add( "6");
        l1.add( "7");
        l1.add( "8");
        l1.add( "9");
        l1.add( "10");
        l1.add("11");        
        l1.add( "12");
        
        l1.add(0,"desplazamiento");
        l1.add(3,"desplazamiento2");
        l1.add(5,"desplazamiento3");

        System.out.println("\n");

        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        
        System.out.println("\ncE despues "+l1.size());

        
    }
}
