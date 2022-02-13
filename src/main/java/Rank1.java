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
public class Rank1 {

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(10);
        ar.add(11);
        System.out.println(ar);
        System.out.println(simpleArraySum(ar));
        

    }

    public static int simpleArraySum(List<Integer> ar) {
        int suma = 0;
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

            suma += ar.get(i);
            System.out.println(suma);
        }
        return suma;

    }

}
