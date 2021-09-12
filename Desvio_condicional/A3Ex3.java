/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex2;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a,b;
      
      Scanner buffer = new Scanner (System.in);
      
      System.out.println("Digite um valor: ");
      a = buffer.nextInt();
      
      System.out.println("Digite outro valor: ");
      b = buffer.nextInt();
      
      if(a>b){
          
          System.out.println("O valor: "+a);
      }
      else{
          System.out.println("O valor: "+b);
      }
    }
    
}
