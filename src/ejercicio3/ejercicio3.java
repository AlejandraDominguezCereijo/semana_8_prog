package ejercicio3;

import java.util.Random;

public class ejercicio3 {



        public void random () {
            int[] arreglo = new int[5];
            for (int i = 0; i < 5; i++) {
                arreglo[i] = (int) (Math.random() * 20 + 1);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("En Posicion " + (i + 1));
                System.out.println(arreglo[i] + " ");
            }
        }
}
