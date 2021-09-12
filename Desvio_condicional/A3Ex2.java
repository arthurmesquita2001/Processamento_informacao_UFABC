/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a,b,resto;
      
      Scanner buffer = new Scanner (System.in);
      
      System.out.println("Digite um valor: ");
      a = buffer.nextInt();
      
      System.out.println("Digite outro valor: ");
      b = buffer.nextInt();
      
      if(a>b){
          
          resto=a-b;
      }
      else{
          resto=b-a;
    }
      System.out.println("O resultado é: "+resto);
 }
}
