package edu.ejercicioclase;
import edu.ejercicioclase.clsEjercicios;

public class clsEjercicios {
    public clsEjercicios() {
    }

    public void CalculosCirculo(double radio) {
        System.out.println("El area es de " + Math.PI * radio * radio);
        System.out.println("La circunferencia es de " + 6.283185307179586 * radio);
    }

    public void CalculosCubo(double s) {
        System.out.println("El volumen del cubo es de " + s * s * s);
    }

    public void CalculosVarios(double base, double altura) {
        System.out.println("El area de esa piramide es de " + base * altura / 2.0);
        System.out.println("El volumen de esa piramide es de " + base * altura / 3.0);
        System.out.println("El area de ese triangulo es de " + base * altura / 2.0);
        System.out.println("El area de ese parelogramo es de " + base * altura / 2.0);
    }

    public void CalculosPrisma(double area_base, double altura) {
        System.out.println("El volumen del prisma es de " + area_base * altura);
    }

    public void CalculosCilindro(double r, double h) {
        System.out.println("El volumen del cilindro es de " + Math.PI * r * r * h);
    }

    public void CalculosEsfera(double r) {
        System.out.println("El area de la esfera es de " + Math.PI * r * 4.0);
    }
}