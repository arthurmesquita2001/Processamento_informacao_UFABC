/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex5;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int idade;
    
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Qual a sua idade: ");
    idade = buffer.nextInt();
    
    if(idade>=18){
        System.out.println(idade+" ,voce é maior de idade");
    }
    else{
        System.out.println(idade+" ,voce ainda é juvenil");
    }
    }
    
}
