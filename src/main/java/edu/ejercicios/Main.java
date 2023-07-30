package edu.ejercicios;

import edo.ejercicios.ejercicios.clsEjercicio;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        clsEjercicio calculos = new clsEjercicio();
        double radio = 0.0;

        try {
            System.out.println("Por favor ingrese el radio del circulo: ");
            radio = Double.parseDouble(lector.readLine());
        } catch (Exception var27) {
            System.out.println("Error: " + var27.getMessage());
        }

        calculos.CalculosCirculo(radio);
        double s = 0.0;

        try {
            System.out.println("Por favor ingrese la longitud de cada lado: ");
            s = Double.parseDouble(lector.readLine());
        } catch (Exception var26) {
            System.out.println("Error: " + var26.getMessage());
        }

        calculos.CalculosCubo(s);
        double base = 0.0;
        double altura = 0.0;

        try {
            System.out.println("Por favor ingrese una base");
            base = Double.parseDouble(lector.readLine());
            System.out.println("Por favor ingrese una altura");
            altura = Double.parseDouble(lector.readLine());
        } catch (Exception var25) {
            System.out.println("Error: " + var25.getMessage());
        }

        calculos.CalculosVarios(base, altura);
        double area_base = 0.0;
        double altura_prisma = 0.0;

        try {
            System.out.println("Por favor ingrese la area_base del prisma");
            area_base = Double.parseDouble(lector.readLine());
            System.out.println("Por favor ingrese la altura del prisma");
            altura_prisma = Double.parseDouble(lector.readLine());
        } catch (Exception var24) {
            System.out.println("Error: " + var24.getMessage());
        }

        calculos.CalculosPrisma(area_base, altura_prisma);
        double radio_cilin = 0.0;
        double altura_cilin = 0.0;

        try {
            System.out.println("Por favor ingrese el radio del cilindro");
            radio_cilin = Double.parseDouble(lector.readLine());
            System.out.println("Por favor ingrese la altura del cilindro");
            altura_cilin = Double.parseDouble(lector.readLine());
        } catch (Exception var23) {
            System.out.println("Error: " + var23.getMessage());
        }

        calculos.CalculosCilindro(radio_cilin, altura_cilin);
        double radio_esfera = 0.0;

        try {
            System.out.println("Por favor ingrese el radio del circulo: ");
            radio_esfera = Double.parseDouble(lector.readLine());
        } catch (Exception var22) {
            System.out.println("Error: " + var22.getMessage());
        }

        calculos.CalculosEsfera(radio_esfera);
    }
}


