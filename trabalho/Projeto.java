/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner buffer = new Scanner(System.in);
        Scanner buf= new Scanner(System.in);
        String suges[]= new String [100];
         String sugestao[]= new String[100];
         int contador=0,cont=0;
         int n,m,c,j,d;
         String s,l,p,me,v,dev;
         String mes[]= new String[12];
         mes[0]="janeiro";
         mes[1]="fevereiro";
         mes[2]="março";
         mes[3]="abril";
         mes[4]="maio";
         mes[5]="junho";
         mes[6]="julho";
         mes[7]="agosto";
         mes[8]="setembro";
         mes[9]="outubro";
         mes[10]="novembro";
         mes[11]="dezembro";
         
         
         System.out.println("Qual acervo maximo de livros voce deseja??");
         j=buffer.nextInt();
         
         while(j==0){
         System.out.println("entrada inválida,qual acervo maximo de livros voce deseja??");
         j=buffer.nextInt();
         }
              String a[]= new String[j];
              double aval_livros[][]=new double[j][10];
        do{
        System.out.println("Digite 1 para adicionar um livro,"
                + " Digite 2 para ver repertório,"
                + " Digite 3 para procurar livro,"
                + " Digite 4 para empréstimo, "
                + " Digite 5 para devolução,"
                + " Digite 6 para checar as avaliações"
                + " Digite 7 para avaliar o sistema"
                + " Digite 0 Para Sair.");
        n=buffer.nextInt();
       if(n==1){
           
            a[cont]=adicionar();
            cont++;
           } else if(n==2){
          
         for(c=0;c<j;c++){
             System.out.println(a[c]);
         }
      } else if(n==3){
           System.out.println("Qual livro??");
           l=buf.nextLine();
           
           v=procurar(a,l,cont);
           if("sim".equals(v)){
               System.out.println("Livro encontrado");
           } else {
               System.out.println("Livro não encontrado");
           }
           
      } else if(n==4){
           System.out.println("Qual livro??");     
           l=buf.nextLine();
           v=procurar(a,l,cont);
           if("sim".equals(v)){
           
      System.out.println("dia?");
     d=buffer.nextInt();
           
     
     if (d<=0){
           while(d<=0){
           System.out.println("Insira um dia valido:");
           d=buffer.nextInt();
           }
     
     } else {
           
          System.out.println("Mes?");
           me=buf.nextLine();
      
           
           
           emprestimo(a,l,cont,d,me,mes);
      }
           } else {
               System.out.println("Livro não está disponível");
           }
      }else if(n==5){
           
           System.out.println("Qual livro??");     
           l=buf.nextLine();
           
           System.out.println("Qual é o dia de devolução ?");
           d=buffer.nextInt();
     
           System.out.println("Mes de devolução?");
           me=buf.nextLine();
      
           dev = l +"(em empréstimo até o dia:"+d+" do mes de "+me;
           
           devolução(a,dev,cont,l,aval_livros);
      
      } 
      else if(n==6){
           for (int t=0; t<j;t++){
              System.out.println("livro"+"  "+"avaliação");
              System.out.print(a[t]+"          "); 
              System.out.print(aval_livros[t][0]);
              System.out.println("");          
           }
      }
      else if(n==7){
            sugestao=qualificar(suges,contador);
            System.out.println("");
            contador++;
 
           }
      else{
          System.out.println("Opção inválida");
      }
       
    }while(n!=0);
    System.out.println("Obrigado volte sempre!"); 
    if(n==99){
         for (String sugestao1 : sugestao) {
            System.out.println(sugestao1);
            }
    }
   
    } public static String adicionar(){
        int n,s=0,c;
        Scanner buffer= new Scanner(System.in);
        String ad;
        
        
            System.out.println("Digite o nome do exemplar");
            ad=buffer.nextLine();
            
        return ad;
        
        
    }public static String procurar(String[] a,String l, int cont){
        int c,i=0;
        String v="sim",f="nao";
            
       for(c=0;c<cont;c++){
       if(a[c].equals(l)){
             i++;   
            }
       }
       if(i>0){
               return v;
              
        } else {
           return f;
       }
    } public static void emprestimo(String[] a,String l, int cont,int d,String me,String[] mes){
        int c,i=0,j;
        String aux; 
       for(c=0;c<cont;c++){
          if(a[c].equals(l)){
              for(j=0;j<12;j++){
                  
              
            if(mes[j].equals(me)){
       
       if(d<=23){
       a[c]=(l+"(em empréstimo até o dia:"+(d+7)+" do mes de "+mes[j]);
          
       } else if (d==24){
           a[c]=(l+"(em empréstimo até o dia:"+(1)+" do mes de "+mes[j+1]);
       } else if(d==25){
           a[c]=(l+"(em empréstimo até o dia:"+(2)+" do mes de "+mes[j+1]);
       } else if(d==26){
           a[c]=(l+"(em empréstimo até o dia:"+(3)+" do mes de "+mes[j+1]);
       } else if(d==27){
           a[c]=(l+"(em empréstimo até o dia:"+(4)+" do mes de "+mes[j+1]);
       } else if (d==28){
           a[c]=(l+"(em empréstimo até o dia:"+(5)+" do mes de "+mes[j+1]);
       } else if(d==29){
           a[c]=(l+"(em empréstimo até o dia:"+(6)+" do mes de "+mes[j+1]);
       } else if(d==30){
           a[c]=(l+"(em empréstimo até o dia:"+(7)+" do mes de "+mes[j+1]);
       }
            }
            
          }
              
          }else if((a[c].equals(l+"(em empréstimo até o dia:"+(d+7)+"do mes de "+me))){
 
           System.out.println("Livro indisponivel");
              
               }       
       }
    } public static void devolução(String [] a,String dev,int j,String l,double[][] aval_livros){
        
       Scanner devo = new Scanner(System.in);
       int k=0,c,co=0,i=0,c_aval=1;
       double s=0;
       
       for(c=0;c<j;c++){
          if(a[c].equals(dev)){
             a[c]=l;
              co=c;
               }
       }
       while(aval_livros[co][c_aval] != 0){
           c_aval++;
       }
       do{
       System.out.println("Como você avalia este livro com uma nota maior que 0 e  até 10?");
       aval_livros[co][c_aval] = devo.nextInt();
       }
       while(aval_livros[co][c_aval]>10 || aval_livros[co][c_aval]<=0);
    
       for (i=1;aval_livros[co] [i] != 0;i++){
        k=i;
        }
        for(i=1;i<=k;i++){
        s=s+aval_livros[co][i];
        }
        aval_livros[co][0]=s/k;
}
    
    public static String [] qualificar( String suges[],int cont) { 
        String avaliaçao,resp,sugestao;
        Scanner qual = new Scanner(System.in);
        System.out.println("Como você avalia o sistema:otimo,bom,regular ou ruim");
        avaliaçao = qual.nextLine();
        System.out.println("Muito obrigado,poderia dar sugestões?");
        resp = qual.nextLine();
            
            if("sim".equals(resp)){
                System.out.println("Sugestão: ");
                sugestao=qual.nextLine();
                suges[cont]=sugestao;
                }     
        else {
                System.out.printf("");
            }
            return suges;
            
        }
        
    }                

   
