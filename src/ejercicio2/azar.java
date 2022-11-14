package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class azar {
    public void parametro(int max, int mini){


        Random al = new Random();
        int aleatorio = al.nextInt(10);
        System.out.println("El numero es: "+aleatorio);

    }

}
