package ejercicio5;

import java.util.Random;
import java.util.Scanner;


    public class juego {
        Random al = new Random();
        int aleatorio = al.nextInt(10);
        int numero;

        public void operacion() {
            for (int i = 0; ; i++) {
                Scanner cubrir = new Scanner(System.in);
                numero = cubrir.nextInt();
                if (aleatorio < numero) {
                    System.out.println("El numero es menor");
                } else if (aleatorio > numero) {
                    System.out.println("El numero es mayor");
                } else if (aleatorio == numero) {
                    System.out.println("Numero correcto");
                }
            }
        }


    }

