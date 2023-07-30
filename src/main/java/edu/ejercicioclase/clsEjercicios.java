package edu.ejercicioclase;

public class clsEjercicios {

    // Calcula el área y circunferencia de un círculo dado su radio
    public void calcularAreaYCircunferenciaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    // Calcula el volumen de un cubo dado uno de sus lados
    public void calcularVolumenCubo(double lado) {
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

    // Calcula el área de una pirámide dados su base y altura
    public void calcularAreaPiramide(double base, double altura) {
        double area = base * altura / 2.0;
        System.out.println("El área de la pirámide es: " + area);
    }

    // Calcula el volumen de una pirámide dados su base y altura
    public void calcularVolumenPiramide(double base, double altura) {
        double volumen = base * altura / 3.0;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }

    // Calcula el volumen de un prisma dados el área de su base y altura
    public void calcularVolumenPrisma(double areaBase, double altura) {
        double volumen = areaBase * altura;
        System.out.println("El volumen del prisma es: " + volumen);
    }

    // Calcula el volumen de un cilindro dados su radio y altura
    public void calcularVolumenCilindro(double radio, double altura) {
        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    // Calcula el área de una esfera dado su radio
    public void calcularAreaEsfera(double radio) {
        double area = 4 * Math.PI * radio * radio;
        System.out.println("El área de la esfera es: " + area);
    }
}