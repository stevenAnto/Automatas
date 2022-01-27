/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author TOSHIBA
 */
public class TablaLogica {
    
    public static void main(String[] args) {
        tablaAnd3();
        System.out.println("\nOtro");
        tablaOr3();
        TableroLogico preuba = new TableroLogico();
        preuba.mostrarTodos();
        TableroLogico.andL(preuba.y, preuba.z);
        TableroLogico.andL(preuba.x, preuba.negacio(preuba.z));
        System.out.println("Resultado primero" + TableroLogico.orL(TableroLogico.andL(preuba.y, preuba.z), TableroLogico.andL(preuba.x, preuba.negacio(preuba.z))));
        ArrayList<Integer> primero = TableroLogico.orL(TableroLogico.andL(preuba.y, preuba.z), TableroLogico.andL(preuba.x, preuba.negacio(preuba.z)));
        SalidaOperador x = new SalidaOperador(preuba.x);
        SalidaOperador y = new SalidaOperador(preuba.y);
        SalidaOperador z = new SalidaOperador(preuba.z);
        System.out.println("salida cadena" + y.andC(z).orC(z.negarC()).getSalida());
        System.out.println("prueba20"+y.andC(z).andC(x).getSalida());
        
        
        
        
        System.out.println("primero " + primero);
        ArrayList<Integer> segundo = preuba.negacio(TableroLogico.orL(TableroLogico.andL(preuba.x, preuba.negacio(preuba.y)), preuba.z));
        System.out.println("segundo " + segundo);
        System.out.println("Final" + TableroLogico.andL(primero, segundo));
        System.out.println("Forma normal disyutiva"
                + TableroLogico.andL(TableroLogico.andL(preuba.x, preuba.y), preuba.negacio(preuba.z)));
        
    }
    
    public static void tablaAnd2() {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(i);
                System.out.print(j);
                if (i == 1 && j == 1) {
                    System.out.print(" " + 1);
                } else {
                    System.out.print(" " + 0);
                    
                }
                System.out.print("\n");
            }
            
        }
    }
    
    public static void tablaAnd3() {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 1; k >= 0; k--) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    
                    if (i == 1 && j == 1 && k == 1) {
                        System.out.print(" " + 1);
                    } else {
                        System.out.print(" " + 0);
                        
                    }
                    System.out.print("\n");
                }
                
            }
            
        }
    }
    
    public static void tablaOr3() {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 1; k >= 0; k--) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    
                    if (i == 0 && j == 0 && k == 0) {
                        System.out.print(" " + 0);
                    } else {
                        System.out.print(" " + 1);
                        
                    }
                    System.out.print("\n");
                }
                
            }
            
        }
    }
    
    public static void forc(int a) {
        if (a != 0) {
            for (int i = 1; i >= 0; i--) {
                System.out.print(i);
                
            }
            a--;
            forc(a);
            
        } else {
            System.out.println("termino");
            
        }
        System.out.println("\n");
        
    }
}
