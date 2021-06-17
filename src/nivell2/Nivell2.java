package nivell2;

import java.util.Scanner;

public class Nivell2 {
    public static void main(String[] args) {
        //INICIALITZEM LES VARIABLES QUE UTILITZAREM
        Scanner sc = new Scanner(System.in);
        double[][] arrayNotes = new double[5][3];
        //RECORREM EL PRIMER BUCLE FOR ANIDAT PER INTRODUIR LES NOTES DELS ALUMNES
        for (int alumne = 0; alumne < arrayNotes.length; alumne++){
            for (int nota = 0; nota < arrayNotes[alumne].length; nota++){
                System.out.print("Introdueix la nota " + (nota+1) + " per a l'alumne " + (alumne+1) +":");
                arrayNotes[alumne][nota] = introduirNota();
            }
        }
        //RECORREM EL SEGON BUCLE FOR ANIDAT PER MOSTRAR LA MITJANA ARITMÈTICA DE CADA ALUMNE I DIR SI HA SUSPÈS O APROVAT
        for (int alumne = 0; alumne < arrayNotes.length; alumne++){
            double mitjanaAritmetica = 0;
            for (int nota = 0; nota < arrayNotes[alumne].length; nota++){
                mitjanaAritmetica += arrayNotes[alumne][nota];
            }
            if (mitjanaAritmetica/3 < 5) System.out.println("L'alumne " + (alumne+1) + " ha suspès amb un " + mitjanaAritmetica/3);
            else System.out.println("L'alumne " + (alumne+1) + " ha aprovat amb un " + mitjanaAritmetica/3);

        }
    }
    //Mètode que demana per consola la nota. Controla que sigui un número de 0 a 10, en cas incorrecte, mostra un missatge d'error i segueix demanant
    public static double introduirNota(){
        String missatgeError = "Incorrecte.Introdueix una nota entre 0 i 10.";
        Scanner sc = new Scanner(System.in);
        boolean introduir = true;
        double nota = -1;
        do{
            if (sc.hasNextDouble()){
                nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) introduir = false;
                else{
                    System.out.println(missatgeError);
                    sc.nextLine();
                }
            }else{
                System.out.println(missatgeError);
                sc.nextLine();
            }
        }while(introduir);
        return nota;
    }
}
