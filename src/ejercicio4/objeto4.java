package ejercicio4;
import java.util.Scanner;
public class objeto4 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        E_S cad = new E_S();

        System.out.println("Ciudad favorita");
        String ciudad = cubrir.nextLine();
        cad.visitar(ciudad);



        System.out.println("Mi nombre es: ");
        String nombre = cubrir.nextLine();
        cad.cifra(nombre);



        String comida = "lasaña";
        System.out.println("Mi comida favorita es la " + comida);
        String las = cubrir.nextLine();
        cad.favorita(las);
    }
}
