/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package danlevil.recursionpracticadv;

/**
 *
 * @author CltControl
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println(App.esPalindromo("ana"));
    }
    static boolean esPalindromo(String s){ //ana
        if(s.length()==1){
            return true;
        }else{
            
            if(s.charAt(0)==s.charAt(s.length()-1)){
  
                esPalindromo(s.substring(inicioS, finalS));

            }
            return false;
        }
    }
    /*static int potencial(int base, int exponente){
        
    }
    static String revertir(String s){
        
    }*/
}
