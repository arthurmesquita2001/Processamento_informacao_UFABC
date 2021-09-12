/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex6;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    
    Scanner buffer = new Scanner (System.in);
    
    System.out.println("Digite o número: ");
    a = buffer.nextInt();
    
    if(a%2==0){
        System.out.println("O seu número é par.");
    }else{
        System.out.println("O seu número é ímpar.");
    }
    }
    
}
