
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class SalidaOperador {

    private ArrayList<Integer> salida;

    public SalidaOperador(ArrayList<Integer> a) {
        salida = a;
    }

    public ArrayList<Integer> getSalida() {
        return salida;
    }

    public void setSalida(ArrayList<Integer> salida) {
        this.salida = salida;
    }

    public void negacion() { //operador monoario
        for (int i = 0; i < salida.size(); i++) {
            if (salida.get(i) == 1) {
                salida.add(0);
            } else {
                salida.add(1);
            }
        }
    }

    public SalidaOperador andC(SalidaOperador a) {
        //operador binario
        ArrayList<Integer> salida = new ArrayList<>();
        SalidaOperador salidas = new SalidaOperador(salida);
        for (int i = 0; i < this.salida.size(); i++) {
            if (this.getSalida().get(i) == 1 && a.getSalida().get(i) == 1) {
                salida.add(1);
            } else {
                salida.add(0);
            }
            salidas.setSalida(salida);
        }
        return salidas;
    }

    public SalidaOperador orC(SalidaOperador a) {
        //operador binario
        ArrayList<Integer> salida = new ArrayList<>();
        SalidaOperador salidas = new SalidaOperador(salida);
        for (int i = 0; i < this.salida.size(); i++) {
            if (this.getSalida().get(i) == 0 && a.getSalida().get(i) == 0) {
                salida.add(0);
            } else {
                salida.add(1);
            }
            salidas.setSalida(salida);
        }
        return salidas;
    }

    public SalidaOperador negarC() {
        //operador binario
        ArrayList<Integer> salida = new ArrayList<>();
        SalidaOperador salidas = new SalidaOperador(salida);
        for (int i = 0; i < this.salida.size(); i++) {
            if (this.getSalida().get(i) == 1) {
                salida.add(0);
            } else {
                salida.add(1);
            }
            salidas.setSalida(salida);
        }
        return salidas;
    }

}
