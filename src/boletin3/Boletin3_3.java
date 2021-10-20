package boletin3;

import java.util.Scanner;

public class Boletin3_3 {
    public Boletin3_3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los billetes de 100:");
        int billete100 = sc.nextInt();
        System.out.println("Introduce los billetes de 50:");
        int billete50 = sc.nextInt();
        System.out.println("Introduce los billetes de 20:");
        int billete20 = sc.nextInt();
        System.out.println("Introduce las monedas de 1:");
        int moneda1 = sc.nextInt();
        System.out.println("El total del dinero introducido es de: " + (billete100 * 100 + billete50 * 50 + billete20 * 20 + moneda1 * 1));
    }
}
