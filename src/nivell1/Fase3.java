package nivell1;

import java.util.Arrays;
import java.util.Scanner;

public class Fase3 {
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
        //INTRODUIM LES VARIABLES EN UN ARRAY DE TIPUS STRING I L'ORDENEM
        String[] arrayCiutats = {bcn,mad,vlc,mlg,cdz,san};
        Arrays.sort(arrayCiutats);
        //CREEM UN NOU ARRAY ON GUARDAREM LES CIUTATS MODIFICADES. HO FAREM MITJANÇANT UN BUCLE FOR
        String[] arrayCiutatsModificades = new String[arrayCiutats.length];
        for (int i = 0; i < arrayCiutats.length; i++){
            arrayCiutatsModificades[i] = arrayCiutats[i].replaceAll("a","4");
        }
        //MOSTREM PER PANTALLA LES CIUTATS MODIFICADES MITJANÇANT UN FOR-EACH
        for (String ciutat : arrayCiutatsModificades){
            System.out.println(ciutat);
        }
    }
}
