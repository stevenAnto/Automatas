
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class StarFin {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String palabraIngresda;
            System.out.println("Ingrese palabra a evaluar o 0 para salir");
            palabraIngresda = sc.next();
            if (palabraIngresda.equals("0")) {
                break;
            }
            automataStartEnd(palabraIngresda);

        }

    }

    public static char[] turnInto(String cadena) {
        char[] arrayChar;
        arrayChar = cadena.toCharArray();
        return arrayChar;
    }

    public static void automataStartEnd(String palabra) {
        String estado = "e1";
        char[] arrayChar;
        arrayChar = turnInto(palabra);
        if (verificarLenguaje(palabra)) {
            for (int i = 0; i < arrayChar.length; i++) {

                if (estado.equals("e1") && arrayChar[i] == 'a') {
                    estado = "e2";
                } else if (estado.equals("e2") && arrayChar[i] == 'b') {
                    estado = "e3";
                } else if (estado.equals("e3") && arrayChar[i] == 'a') {
                    estado = "e4";
                } else if (estado.equals("e4") && arrayChar[i] == 'a') {
                    estado = "e5";
                }
            }
        }

        if (estado.equals("e5")) {
            System.out.println("Acepto");
        } else {
            System.out.println("No acepto");
        }
    }

    public static boolean verificarLenguaje(String palabra) {
        char[] arrayChar;
        arrayChar = turnInto(palabra);
        int contador = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == 'a' || arrayChar[i] == 'b') {

            } else {
                contador++;
            }
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }

    }

}
