package uap.mains;

import uap.models.*;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // header, nama nim
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Angeliani Junitaviana Herman");
        System.out.println("245150700111021");
        
        // torus 
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double major = scan.nextDouble();
        System.out.print("Isikan radius   : ");
        double minor = scan.nextDouble();

        Torus torus = new Torus(major, minor); // membuat objek torus
        torus.printInfo();

        // sphere
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rad = scan.nextDouble();

        Sphere bola = new Sphere(rad); // membuat objek sphere
        bola.printInfo();

        System.out.println("=============================================");
    }
}
