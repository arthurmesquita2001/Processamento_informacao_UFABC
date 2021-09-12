/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5ex8;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class A5Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double item,precototal=0,precounitario;
        int quantidade,totalvolumes=0;
        
        Scanner buffer = new Scanner(System.in);
        
        System.out.println("Quantidade: ");
        quantidade=buffer.nextInt();
        
        while(quantidade!=0){
            System.out.println("preço");
            precounitario=buffer.nextDouble();
            
            item=quantidade*precounitario;
            precototal=item+precototal;
            totalvolumes=totalvolumes+quantidade;
            
            System.out.println("Quantidade");
            quantidade=buffer.nextInt();
            }
        System.out.println("total da compra: "+precototal);
        System.out.println("total de volumes: "+totalvolumes);
        
    }
    
}
