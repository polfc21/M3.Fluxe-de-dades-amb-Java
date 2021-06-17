package nivell1;

import java.util.Scanner;

public class Fase1 {
    public static void main(String[] args) {
        //INICIALITZEM LES VARIABLES QUE UTILITZAREM
        Scanner sc = new Scanner(System.in);
        String bcn, mad, vlc, mlg, cdz, san;
        //MOSTREM PER PANTALLA LES CIUTATS QUE HAURÀ D'INTRODUIR L'USUARI PER CONSOLA
        System.out.println("Introdueix les següents ciutats (Barcelona,Madrid,Valencia,Malaga,Cadis,Santander)");
        System.out.println("*Introdueix la ciutat i prem intro*");
        bcn = sc.nextLine();
        mad = sc.nextLine();
        vlc = sc.nextLine();
        mlg = sc.nextLine();
        cdz = sc.nextLine();
        san = sc.nextLine();
        //MOSTREM PER PANTALLA LES CIUTATS INTRODUIDES PER L'USUARI
        System.out.println(bcn + ", " + mad + ", " + vlc + ", " + mlg + ", " + cdz + ", " + san);
    }
}
