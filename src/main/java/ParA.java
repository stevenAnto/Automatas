/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
import java.util.*;

public class ParA {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String palabraIngresda;
        System.out.println("Ingrese palabra a evaluar");
        palabraIngresda = sc.next();
        AutomatPar(palabraIngresda);
        
    }
    
    public static char[] turnInto(String cadena) {
        char[] arrayChar;
        arrayChar = cadena.toCharArray();
        return arrayChar;
    }
    
    public static void AutomatPar(String palabra) {
        String estado = "p";
        char[] arrayChar;
        arrayChar = turnInto(palabra);
        for (int i = 0; i < arrayChar.length; i++) {
            if (estado.equals("p") && arrayChar[i] == 'a') {
                estado = "np";
            } else if (estado.equals("np") && arrayChar[i] == 'a') {
                estado = "p";
            }
        }
        if (estado.equals("p")) {
            System.out.println("Acepto");
        } else {
            System.out.println("No acepto");
        }
        
    }
    
}
