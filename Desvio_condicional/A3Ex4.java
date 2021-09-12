/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex4;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a,b;
    
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Digite um valor: ");
    a = buffer.nextDouble();
    
    System.out.println("Digite um valor: ");
    b= buffer.nextDouble();
    
    if(a>b){
        System.out.println("O valores são "+b+" e "+a);
    }
    else{
        System.out.println("Os valores são "+a+" e "+b);
    }
    }
    
}
