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
public class TableroLogico {

    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    ArrayList<Integer> z = new ArrayList<>();

    public TableroLogico() {
        tablaAnd3();
    }

    public void tablaAnd3() {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 1; k >= 0; k--) {
                    x.add(i);
                    y.add(j);
                    z.add(k);
                }

            }

        }
    }

    public ArrayList<Integer> negacio(ArrayList<Integer> a) {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 1) {
                salida.add(0);
            } else {
                salida.add(1);
            }
        }
        return salida;
    }

    public void setX(ArrayList<Integer> x) {
        this.x = x;
    }

    public void setY(ArrayList<Integer> y) {
        this.y = y;
    }

    public void setZ(ArrayList<Integer> z) {
        this.z = z;
    }

    public void mostrarTodos() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public ArrayList<Integer> and() {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) == 1 & y.get(i) == 1 && z.get(i) == 1) {
                salida.add(1);
            } else {
                salida.add(0);
            }

        }
        return salida;
    }

    public ArrayList<Integer> or() {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) == 0 & y.get(i) == 0 && z.get(i) == 0) {
                salida.add(0);
            } else {
                salida.add(1);
            }

        }
        return salida;
    }

    public static ArrayList<Integer> andL(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 1 && b.get(i) == 1) {
                salida.add(1);
            } else {
                salida.add(0);
            }
        }
        return salida;

    }

    public static ArrayList<Integer> orL(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0 && b.get(i) == 0) {
                salida.add(0);
            } else {
                salida.add(1);
            }
        }
        return salida;

    }

}
