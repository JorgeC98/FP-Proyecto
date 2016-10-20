/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.*;
/**
 * Este programa sirve para comprobar si un año es bisiesto
 * @author JorgeRicardo
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a;
    a=pedirDato(); //pedimos el año
    comprobar(a); //comprobamos si es bisiesto e imprime el resultado
    }
    public static int pedirDato(){
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el año que deseas probar: ");
        a=teclado.nextInt(); //Es el año
        return a;
    }
    public static void comprobar (int a){
        if (a%4!=0)//aqui compruebo si es multiplo de 4
        System.out.println("No es un año bisiesto");//si no lo es digo que no es bisiesto
        else if (a%100!=0) //compruebo si es multiplo de 100
            System.out.println("Es un año bisiesto");//si no es multiplo de 100 digo que es bisiesto
            else if (a%400==0)//aqui compruebo si es multiplo de 400
                System.out.println("Es un año bisiesto");//Si si lo es digo que es bisiesto
                else System.out.println("No es un año bisiesto");//si no lo es digo que no es bisiesto
            }
        
           
    }
    


