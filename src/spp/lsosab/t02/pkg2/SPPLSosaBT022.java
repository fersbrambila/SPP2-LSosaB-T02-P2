/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lsosab.t02.pkg2;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPPLSosaBT022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Problema 2");
        Scanner tec=new Scanner(System.in);
       int i,s; 
       int valinf= pedirD("valor inferior");
       int valsup= pedirD("valor superior");
       boolean esPar, esTercio, esQuinto;
       for( i= valinf;i <= valsup;i++) {
           esPar=true;
            if(i%2==0){System.out.println("El valor " + i +  " es par");}   
            if(i%3==0){System.out.println("El valor " + i + " es divisible entre 3");}
            if(i%5==0){System.out.println("El valor " + i + " es divisible entre 5");}
            }
                
    }
        
      

    static int pedirD(String dato){ 
           Scanner tec= new Scanner(System.in);
       int val;
        System.out.println("Introduce el "+ dato);
       val= tec.nextInt();
       return val; 
    }
}
    
    
    
