/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex2;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A4Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double salario;
    
    Scanner buffer = new Scanner(System.in);
    
    System.out.println("Digite o seu salário: ");
    salario=buffer.nextDouble();
    
    if(salario <= 1495.15){
        System.out.println("IR mensal é "+salario);
        System.out.println("IR anual é "+(salario*12));
    }
    else if(salario <= 2246.75){
        System.out.println("O IR mensal é "+(salario*0.925));
        System.out.println("O IR anual é "+(((salario*0.925)*12)+112.43));
    }
    else if(salario <= 2995.70){
        System.out.println("O seu IR mensal é "+(salario*0.85));
        System.out.println("O IR anual é "+(((salario*0.85)*12)+280.94));
    }
    else if(salario <= 3743.19){
        System.out.println("O seu IR mensal é "+(salario*0.785));
        System.out.println("O IR anual é "+(((salario*0.785)*12)+505.62));
    }
    else{
        System.out.println("O seu IR mensal é "+(salario*0.725)); 
        System.out.println("O IR anual é "+((salario*0.725)*12));
    }
    }
            
            
    }
    

