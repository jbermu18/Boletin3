package boletin3;

import java.util.Scanner;

public class Boletin3_4 {
    public Boletin3_4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dinero para desglosarlo:");
        int dinero = sc.nextInt();
        int billetes100 = dinero / 100;
        int billetes50 = dinero % 100 / 50;
        int billetes20 = dinero % 50 / 20;
        int monedas1 = dinero % 20 / 1;
        System.out.println(billetes100 + " billetes de 100");
        System.out.println(billetes50 + " billetes de 50");
        System.out.println(billetes20 + " billetes de 20");
        System.out.println(monedas1 + " monedas de 1");
    }
}
