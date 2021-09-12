/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex3;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A4Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String resposta,resposta1,resposta2;
   
   Scanner buffer = new Scanner(System.in);
   
   System.out.println("Casar ou comprar uma bicicleta?");
   
   System.out.println("Voce esta gordo?");
   resposta=buffer.nextLine();
   
   if("sim".equals(resposta)){
       System.out.println("Quer emagrecer?");
        resposta1 = buffer.nextLine();
   if ("sim".equals(resposta1)){
       System.out.println("Compre uma bicicleta");
   
   }else{
       System.out.println("Case");
   }
       
   }else{
       System.out.println("Quer engordar?");
       resposta2 = buffer.nextLine();
       if("sim".equals(resposta2)){
           System.out.println("Case");
       }else{
           System.out.println("compre uma bicicleta");
       }
       
   }
    }
}
           
           
