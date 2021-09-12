/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5ex6;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class A5Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int x,acumulador=1;
   
   Scanner buffer = new Scanner(System.in);
   
   System.out.println("Digite o valor");
   x=buffer.nextInt();
   
   if(x>=0){
       while(x>(acumulador*2)){
           acumulador=acumulador*2;
           System.out.println(acumulador);
       }
   }else{
       System.out.println("Digite o valor maior ou igual a zero");
   }
    }
    
}
