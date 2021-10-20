package boletin3;

import java.util.Scanner;

public class Boletin3 {
    public Boletin3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio tarifa:");
        double tarifa = (double)sc.nextFloat();
        System.out.println("Introduce el precio original:");
        double precio = (double)sc.nextFloat();
        System.out.println("El descuento é de " + tarifa / precio * 100.0D + " %");
    }
}
