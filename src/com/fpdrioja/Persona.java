package com.fpdrioja;

/**
 * @Author: Iratxe
 */


/**
 * Clase que representa a una persona con peso y altura.
 */
class Persona {
    private double peso;
    private double altura;

    /**
     * Constructor de la clase Persona.
     * @param peso Peso en kilogramos.
     * @param altura Altura en metros.
     */
    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC).
     * @return El IMC calculado.
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * Muestra el resultado del IMC con un mensaje personalizado.
     */
    public void mostrarResultadoIMC() {
        double imc = calcularIMC();
        System.out.printf("Tu IMC es %.1f. ", imc);
        
        if (imc < 18.5) {
            System.out.println("Estás por debajo del peso normal. ¡Consulta con un médico!");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tienes un peso saludable. ¡Buen trabajo!");
        } else {
            System.out.println("Tienes sobrepeso. ¡Cuida tu salud!");
        }
    }
}

