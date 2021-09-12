/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex1;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A4Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int codigo;
    double valor;
    
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Digite o valor: ");
    valor=buffer.nextDouble();
    
    System.out.println("Digite o código: ");
    codigo=buffer.nextInt();
    
    if(codigo == 0){
        System.out.println("Compra a vista."+valor+", com o desconto ficará "+(valor*0.75));
    } 
    else if (codigo == 1){
        System.out.println("Compra em cheque de 30 dias."+valor+", com o desconto ficará "+(valor*0.80));
    }
    else if(codigo == 2){
        System.out.println("Compra em 2x."+valor+", com o desconto ficará "+(valor*0.9));
    }
    else if(codigo == 3){
        System.out.println("Compra em 3x."+valor+", com o desconto ficará "+(valor*0.95));
    }
    else{
        System.out.println("Compra negociada com vendedor."+valor+", sem desconto");
    }
            
    // TODO code application logic here
    }
    
}
