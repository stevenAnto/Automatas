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

public class Automata {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String palabraIngresada;

        System.out.println("ingrese la palabra");
        palabraIngresada = sc.next();
        automataImpar_a(palabraIngresada);

    }

    public static void mostar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ";");
        }
        System.out.println("\n");

    }

    public static char[] turnInto(String cadena) {
        char[] arrayChar;
        arrayChar = cadena.toCharArray();
        return arrayChar;
    }

    public static void automataImpar_a(String palabra) {
        String estado = "p";

        char[] arrayChar = turnInto(palabra);
        for (int i = 0; i < arrayChar.length; i++) {
            if (estado.equals("p") && arrayChar[i] == 'a') {
                //System.out.print("entro1\t");
                //System.out.print(estado);
                estado = "np";
            } else if (estado.equals("np") && arrayChar[i] == 'a') {
                //System.out.print("entro2\t");
                //System.out.print(estado);
                estado = "p";
            }
           // System.out.println("estado ultimo" + estado + "\n");
        }
        if (estado.equals("np")) {
            System.out.println("aceptar");

        } else {
            System.out.println("rechazar");
        }

    }

}
