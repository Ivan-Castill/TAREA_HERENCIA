package Ejercicio_1_jerarquía_animales;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Theo", 5);
        Gato gato = new Gato("Zatanas", 3);
        System.out.println("\n Bienvenido al programa \n  Jerarquia de animales \n ");
        System.out.println(" Los animales a presentar son los siguientes: \n ANIMAL 1 ");
        System.out.println(" Nombre: " + perro.getNombre() + "\n Edad: " + perro.getEdad() + "\n Sonido: " + perro.hacerSonido());
        System.out.println("\n ANIMAL 2 ");
        System.out.println(" Nombre: " + gato.getNombre() + "\n Edad: " + gato.getEdad() + "\n Sonido: " + gato.hacerSonido());
    }
}
