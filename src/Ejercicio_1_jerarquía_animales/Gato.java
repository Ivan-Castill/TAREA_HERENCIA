package Ejercicio_1_jerarquía_animales;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "El gato maúlla: ¡Miau!";
    }
}
