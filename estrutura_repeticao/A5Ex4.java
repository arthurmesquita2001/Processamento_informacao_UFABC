/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5ex1;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A5Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   double a,b,c,d,e;
   
   Scanner buffer=new Scanner(System.in);
   
   System.out.println("Digite 5 numeros");
   a=buffer.nextDouble();
   b=buffer.nextDouble();
   c=buffer.nextDouble();
   d=buffer.nextDouble();
   e=buffer.nextDouble();
   
   System.out.println((a*a)+", "+(b*b)+", "+(c*c)+", "+(d*d)+", "+(e*e));
           
    }
    
}
