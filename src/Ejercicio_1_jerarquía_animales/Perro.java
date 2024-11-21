package Ejercicio_1_jerarquía_animales;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "El perro ladra: ¡Guau, guau!";
    }
}