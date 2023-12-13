/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package g10.heapdv;

import java.util.Comparator;

/**
 *
 * @author danlevil
 */
public class TestHeap {

    public static void main(String[] args) {
        Comparator<Integer> comparador = Comparator.naturalOrder();
        HeapDV<Integer> maxHeap = new HeapDV<>(comparador);

        maxHeap.encolar(1);
        maxHeap.encolar(18);
        maxHeap.encolar(2);
        maxHeap.encolar(36);
        maxHeap.encolar(7);
        maxHeap.encolar(4);

        System.out.println("Nodes: " + maxHeap);
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.desencolar());
        }
        
    }
}
