/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;


public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int contador=0;
       Libro []libros = new Libro[2];   
      Libro lista[]= new Libro[10];
       int opcion=0; 
        
       do {
            System.out.println("\tBIBLIOTECA PERSONAL");
        System.out.println("1.Ingresar nuevo libro");
        System.out.println("2.Imprimir lista de todos los libros");
        System.out.println("3.Contar libors de autor");
         System.out.println("4.Salir");
        System.out.print("Selecione la opcion que desee:");
        opcion=scan.nextInt();
       
        switch(opcion){
           case 1:
    contador ++;
    if(contador<11){
         
        for(int i=1 ; i<libros.length; i++){
           
         System.out.println("Libro #"+contador);  
       System.out.print("Ingrese el titulo del libro:");
      scan.nextLine();
       String titulos= scan.nextLine();
       
        System.out.print("Ingrese el nombre del autor del libro:");
       String autores= scan.nextLine();
       
        System.out.print("Ingrese el año:");
        int anios=scan.nextInt();
        
          
   
      Libro guardar= new Libro(titulos, anios);
      Autor nombre= new Autor(autores);
       
         System.out.print("Si es un favorito escriba TRUE y si no escriba FALSE:");
    
       boolean favorito=scan.nextBoolean();
    
        if(favorito){
            
            System.out.println("El libro se guardo en FAVORITOS");
             
        }else{
             System.out.println("No Es favorito");
        }       
        }
       

                     
    }else{
         System.out.println("\tLA BIBLIOTECA YA ESTA LLENA");
          System.out.println("\t No puede ingresar mas\n");
    
    
 }     
               break;
           case 2:
               
               System.out.println("\nLista de libros:");
              /* for(int i=0; i<lista.length; i++){
                   if( lista!=null){
                           
                      System.out.println((i+1)+","+lista[i].getAutor());
                      
                              }
                   
               }*/
                
               break;
           case 3:
               System.out.println("\nContar libros de autor:"); 
               System.out.println(contador);
              
               break;
               case 4:
                   System.out.println("Adios");
               break;
           default:
              System.out.println("ERROR!! Esa opcion no existe");
               break;
               
       }
     
       }while(opcion != 4);
        
        
      
       
        
    }
    
}
