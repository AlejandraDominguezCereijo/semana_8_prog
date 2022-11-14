package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

    int numero, aleatorio = 0;
    int contador = 1;
    Scanner cubrir = new Scanner(System.in);

    public void adivina() {
        aleatorio =(int)(Math.random()*100);

        do

        {
            System.out.println("Intento " + contador + " de 5, el numero es:  ");
            contador++;
            numero = cubrir.nextInt();
            if (aleatorio == numero) {
                System.out.println("!Numero correcto, adivinaste el numero en " + contador + " intentos");
                return;
            }
            if (aleatorio > numero) {

                System.out.println("Escribe un numero mayor: ");
            }if (aleatorio < numero) {
                System.out.println("Escribe un numero menor: ");

            }


        } while(contador!=6);
        System.out.println("Has gastado tus 5 intentos");
    }
}



