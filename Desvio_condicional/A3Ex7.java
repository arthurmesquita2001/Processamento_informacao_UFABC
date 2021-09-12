/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex7;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a , b;
       
      Scanner buffer = new Scanner(System.in);
      
      System.out.println("Digite um numero: ");
      a = buffer.nextDouble();
      
      System.out.println("Digite um numero: ");
      b = buffer.nextDouble();
      
      if(a>b){
          System.out.println(a);
      }
      else if(a==b){
          System.out.println("Os numeros são iguais");
      }else{
            System.out.println(b);  
              }
    }
    
}
