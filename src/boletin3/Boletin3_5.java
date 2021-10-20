package boletin3;

import java.util.Scanner;

public class Boletin3_5 {
    public Boletin3_5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo total:");
        double sueldototal = sc.nextDouble();
        double sueldoliquido = sueldototal * 0.18D + 36.0D;
        double sueldoneto = sueldototal - sueldoliquido;
        System.out.println(sueldoneto + " € de sueldo neto");
    }
}
