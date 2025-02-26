package com.fpdrioja;

import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    /**
     * Método principal que solicita el peso y la altura del usuario, 
     * calcula el IMC e imprime el resultado.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        Persona persona = new Persona(peso, altura);
        persona.mostrarResultadoIMC();
        
        scanner.close();
    }
}

