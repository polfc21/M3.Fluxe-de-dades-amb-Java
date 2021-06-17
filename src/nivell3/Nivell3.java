package nivell3;

import java.util.Scanner;

public class Nivell3 {
    public static void main(String[] args) {
        //INICIALITZEM LES VARIABLES QUE UTILITZAREM
        Scanner sc = new Scanner(System.in);
        int numA = 0, numB = 1, numC, numeros;
        //DEMANEM A L'USUARI ELS NÚMEROS DE LA SEQÜÈNCIA DE FIBONACCI QUE ES VOLEN VEURE
        System.out.println("Quants números vols veure de la seqüència de Fibonacci");
        numeros = sc.nextInt();
        //BUCLE FOR QUE MOSTRA ELS NÚMEROS DE LA SEQÜÈNCIA FIBONACCI I CALCULA EL VALOR QUE HAN DE TENIR AQUESTS
        for (int i = 0; i < numeros; i++){
            System.out.print(numA + " ");
            numC = numA + numB;
            numA = numB;
            numB = numC;
        }
    }
}
