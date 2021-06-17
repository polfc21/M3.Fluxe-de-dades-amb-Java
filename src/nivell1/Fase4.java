package nivell1;

import java.util.Arrays;
import java.util.Scanner;

public class Fase4 {
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
        //CREEM L'ARRAY DE CARÀCTERS CORRESPONENT A CADA CIUTAT
        char[] arrayBcn = Fase4.omplirArray(bcn);
        char[] arrayMad = Fase4.omplirArray(mad);
        char[] arrayVlc = Fase4.omplirArray(vlc);
        char[] arrayMlg = Fase4.omplirArray(mlg);
        char[] arrayCdz = Fase4.omplirArray(cdz);
        char[] arraySan = Fase4.omplirArray(san);
        //MOSTREM LES CIUTATS AMB ELS NOMS ORDENATS I INVERTITS
        Fase4.mostrarCiutat(arrayBcn);
        Fase4.mostrarCiutat(arrayMad);
        Fase4.mostrarCiutat(arrayVlc);
        Fase4.mostrarCiutat(arrayMlg);
        Fase4.mostrarCiutat(arrayCdz);
        Fase4.mostrarCiutat(arraySan);
    }
    //Mètode que s'encarrega d'omplir i retornar l'array de caràcters de la ciutat que es passa per paràmetre
    public static char[] omplirArray(String ciutat){
        char[] arrayCiutat = new char[ciutat.length()];
        for (int i = 0; i < ciutat.length(); i++){
            arrayCiutat[i] = ciutat.charAt(i);
        }
        return arrayCiutat;
    }
    //Mètode que crida als dos mètodes que mostren la seqüència de caràcters d'una ciutat (tant ordenada, com invertida) que s'ha passat per paràmetre
    public static void mostrarCiutat(char[] arrayCiutat){
        mostrarLletresCiutatOrdenades(arrayCiutat);
        mostrarLletresCiutatInvertides(arrayCiutat);
    }
    //Mètode que mostra les lletres d'una ciutat passada per paràmetre de manera ordenada
    public static void mostrarLletresCiutatOrdenades(char[] arrayCiutat){
        for (char lletra : arrayCiutat){
            System.out.print(lletra);
        }
        System.out.print(" - ");
    }
    //Mètode que mostra les lletres d'una ciutat passada per paràmetre de manera invertida
    public static void mostrarLletresCiutatInvertides(char[] arrayCiutat){
        for (int i = arrayCiutat.length-1; i >= 0;i--){
            System.out.print(arrayCiutat[i]);
        }
        System.out.println();
    }
}
