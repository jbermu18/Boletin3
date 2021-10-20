package boletin3;

import java.util.Scanner;

public class Boletin3_2 {
    public Boletin3_2() {
    }

    public static void main(String[] args) {
        double gradosF = 32.0D;
        double gradosK = 273.15D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados centrigrados");
        double temperaturaC = (double)sc.nextFloat();
        System.out.println("Los grados en Fahrenheit son " + (temperaturaC * 1.8D + 32.0D) + " F");
        System.out.println("Los grados en Kelvin son " + (temperaturaC + gradosK) + " F");
    }
}
