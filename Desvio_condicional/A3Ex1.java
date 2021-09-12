/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.exercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class Aula3Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int valor;    
        
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Digite o seu valor: ");
    valor=buffer.nextInt();
    
    if(valor<=3){
        System.out.println("O seu valor é: "+valor);
    }
    else{
        System.out.println("Não compatível");
    }      
    }
    
}
