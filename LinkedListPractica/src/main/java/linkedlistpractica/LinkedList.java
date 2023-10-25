/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistpractica;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author CltControl
 */
public class LinkedList<E> implements List<E> {
    Nodo<E> primero;
    Nodo<E> ultimo;
    LinkedList(){
        primero=null;
    }
    


    public class Nodo<E>{
        E contenido;
        Nodo<E> siguiente;
        Nodo(E cont){
            contenido= cont;
            siguiente=null;
        }
        public void setSiguiente(Nodo<E> siguiente) {
            this.siguiente = siguiente;
        }
        public Nodo<E> getSiguiente() {
            return siguiente;
        }
        public E getContenido() {
            return contenido;
        }

    }

    private Nodo<E> getPrimero() {
        return primero;
    }

    private void setPrimero(Nodo<E> primero) {
        this.primero = primero;
    }

    private Nodo<E> getUltimo() {
        return ultimo;
    }

    private void setUltimo(Nodo<E> ultimo) {
        this.ultimo = ultimo;
    }
    
    @Override
    public boolean add(E e) {
        if(primero==null){
            primero= new Nodo(e);
            ultimo=primero;
            return true;
        }
        Nodo<E> nuevoUltimo= new Nodo(e);
        ultimo.setSiguiente(nuevoUltimo);
       
        ultimo= nuevoUltimo;
        ultimo.setSiguiente(null);
        return true;

    }
    @Override
    public int size(){
        int count=0;
//        Nodo<E> n=this.primero;
//        while(n!=null){
//            count++;
//            n= n.getSiguiente();
//        }
        Nodo<E> n;
        for (n=this.primero;n!=null;n= n.getSiguiente()){
            count++;
        }
        return count;
    }
    public void imprimirLinked(){
        Nodo<E> n;
//        while(n!=null){
//            System.out.println(n.getContenido()+"");
//            n= n.getSiguiente();
//        }
        for (n=this.primero;n!=null;n= n.getSiguiente()){
            System.out.println(n.getContenido()+"");
        }
        
    }
    
    public void unirLista(LinkedList<E> l2){
        this.ultimo.setSiguiente(l2.getPrimero());
        this.setUltimo(l2.getUltimo());
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        LinkedList<E> l2=(LinkedList<E>)c;
        this.ultimo.setSiguiente(l2.getPrimero());
        this.setUltimo(l2.getUltimo());
        return true;
    }
    public LinkedList <E> revertir(){
        LinkedList reversedList = new LinkedList();
        Nodo current = this.primero;
        while (current != null) {
            Nodo next = current.siguiente;  
            current.siguiente = reversedList.primero;  
            reversedList.primero = current;  
            current = next;  
        }
        return reversedList;
    }
    @Override
    public boolean isEmpty() {
        if(this.primero==null ){return true;}
        return false;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
