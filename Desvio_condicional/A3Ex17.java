/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex17;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a,b,c;
     
     Scanner buffer = new Scanner(System.in);
     
     System.out.println("Digite um número (a): ");
     a=buffer.nextInt();
     
     System.out.println("Digite um número (b): ");
     b=buffer.nextInt();
     
     System.out.println("Digite um número (c): ");
     c=buffer.nextInt(); 
     
     if(a>b && a>c){
         System.out.println(+a);
     }
     else if(b>a && b>c){
         System.out.println(+b);
     }
     else if(c>a && c>b){
         System.out.println(+c);
     }
     else if(a==b && b==c){
         System.out.println("Os números são iguais.");
     }


// TODO code application logic here
    }
    
}
