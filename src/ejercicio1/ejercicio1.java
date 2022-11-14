package ejercicio1;

import java.util.Scanner;
public class ejercicio1 {
    Scanner rellenar = new Scanner(System.in);
    int nElementos=rellenar.nextInt();
    Scanner cubrir = new Scanner(System.in);


    int[] numeros = new int[nElementos];

    public void arreglo() {

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + " Escribe un numero: ");
            numeros[i] = cubrir.nextInt();
        }
        System.out.println("Los numeros del array son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println("En Posicion " + (i + 1));
            System.out.println(numeros[i] + " ");
        }

    }
}