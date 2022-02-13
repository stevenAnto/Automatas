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

public class OnlyB {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String palabraIngresda;
            System.out.println("Ingrese palabra a evaluar o 0 para salir");
            palabraIngresda = sc.next();
            if (palabraIngresda.equals("0")) {
                break;
            }
            automataOnlyB(palabraIngresda);

        }

    }

    public static char[] turnInto(String cadena) {
        char[] arrayChar;
        arrayChar = cadena.toCharArray();
        return arrayChar;
    }

    public static void automataOnlyB(String palabra) {
        String estado = "b0";
        char[] arrayChar;
        arrayChar = turnInto(palabra);
        for (int i = 0; i < arrayChar.length; i++) {
            if (estado.equals("b0") && arrayChar[i] == 'b') {
                estado = "b1";
            } else if (estado.equals("b1") && arrayChar[i] == 'b') {
                estado = "b2";
            } else if (estado.equals("b2") && arrayChar[i] == 'b') {
                estado = "b2";
            }
        }
        if (estado.equals("b1")) {
            System.out.println("Acepto");
        } else {
            System.out.println("No acepto");
        }
    }

}
