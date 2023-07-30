package edu.ejercicios;

import edu.ejercicioclase.clsEjercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        clsEjercicios calculos = new clsEjercicios();

        double radio = obtenerNumero(lector, "Por favor ingrese el radio del círculo: ");
        calculos.calcularAreaYCircunferenciaCirculo(radio);

        double ladoCubo = obtenerNumero(lector, "Por favor ingrese la longitud de cada lado del cubo: ");
        calculos.calcularVolumenCubo(ladoCubo);

        double baseRectangulo = obtenerNumero(lector, "Por favor ingrese la base del rectángulo: ");
        double alturaRectangulo = obtenerNumero(lector, "Por favor ingrese la altura del rectángulo: ");
        calculos.calcularAreaPiramide(baseRectangulo, alturaRectangulo);

        double areaBasePrisma = obtenerNumero(lector, "Por favor ingrese el área de la base del prisma: ");
        double alturaPrisma = obtenerNumero(lector, "Por favor ingrese la altura del prisma: ");
        calculos.calcularVolumenPrisma(areaBasePrisma, alturaPrisma);

        double radioCilindro = obtenerNumero(lector, "Por favor ingrese el radio del cilindro: ");
        double alturaCilindro = obtenerNumero(lector, "Por favor ingrese la altura del cilindro: ");
        calculos.calcularVolumenCilindro(radioCilindro, alturaCilindro);

        double radioEsfera = obtenerNumero(lector, "Por favor ingrese el radio de la esfera: ");
        calculos.calcularAreaEsfera(radioEsfera);

        try {
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el lector.");
        }
    }

    private static double obtenerNumero(BufferedReader lector, String mensaje) {
        double numero = 0.0;
        try {
            System.out.println(mensaje);
            numero = Double.parseDouble(lector.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (IOException e) {
            System.out.println("Error al leer la entrada.");
        }
        return numero;
    }
}


