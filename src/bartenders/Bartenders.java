/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bartenders;

/**
 *
 * @author AAAA
 */

public class Bartenders {

   
    public static void main(String[] args) {
       System.out.print("**** Bienvenido  ****");
       
       int[] P = {2,3,5,7,11,13,17};//vector entrada P
       int q = 3;
       int[] A = {2,3,4,5,6,7};//vector entrada A
       int k[];
       int u =0;
       k = new int[20];
       int c[];
       c = new int[20];
       int g = 0;
       int t = 0;
       int resultado[];
       boolean rt = false;
       boolean ban = true;
       int f = 0;
       resultado = new int[20];
       int cont = 0;
 //System.out.print(A.length);
 
      for(int b=0;b<q;b++){
 
       for(int i=A.length-1;i>=0;i--){
         System.out.println(" ");
         System.out.println(A[i]);
         System.out.println(P[b]);
         
         if(A[i]%P[b]==0){
             
         rt  = buscarRepetido(resultado,A,i,ban,f);
         if(rt==true){
                   k[t] = A[i];
                  resultado[t] = k[t];
                  t = t+1;
                  cont = t;
                  //System.out.println("esto es k--->"+k[t]);
                 }else{
             System.out.println(" ");
             System.out.println("este valor esta repetido en el resultado--->"+A[i]);
             cont = cont + 1;
         } 
         }else{
           
             c[g]=A[i];
             System.out.println("esto es c--->"+c[g]);
              g = g+1;
         }
        }
       System.out.println("cont--->  "+cont);
      }
      buscarSiesta(resultado,A,cont);
      System.out.println("                        ");
      System.out.println("                        ");
      System.out.println("                        ");
      System.out.println("Esto es el vector resultado ---> ");
      for(int i=0;i<10;i++){
          if(resultado[i]==0){
              break;
          }
          System.out.print(""+resultado[i]+","+" ");   
      }
      
    }
    public static boolean buscarRepetido(int resultado[],int A[],int i,boolean ban,int f){
  
       
  
      // System.out.print("esto es ban--->"+ban);
       for(f = 0;f<resultado.length;f++){
           if(A[i]==resultado[f]){
               ban = false;
               break;
           }else{
               ban = true;
           }
       }
       return ban; 
    }
    
     public static void buscarSiesta(int resultado[],int A[], int cont){
         int contador = 0;
         
          for(int b=0;b<A.length;b++){
              contador = 0;
              for(int i=cont-1;i>=0;i--){
              System.out.println("esto es resultado--->: "+resultado[i]);
              System.out.println("esto es  a--->: "+A[b]);
              if(A[b]==resultado[i]){
                  break;
              }
         contador = contador +1;
         //   System.out.println("contador:---> "+contador);
            if(contador==cont){
                resultado[cont] = A[b];
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Lo que no estaba en A se ingresa en el vector resultado:---> "+A[b]);
            }
          }
           
          }
         
     }
}







             
      
        
