/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3ex9;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A3Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int senha;
    
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Digite a senha: ");
    senha=buffer.nextInt();
    
    if(senha==9238){
        System.out.println("acesso concedido");
    }
    else{
        System.out.println("acesso negado");
    }
    }
    
}
