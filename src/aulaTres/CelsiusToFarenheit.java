package aulaTres;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        double tempCelsius = 30.0;
        double tempFarenheit = (9.0/5.0)*tempCelsius+32.0;
        System.out.println("--------- Conversor de Temperatura ---------\n");
        System.out.printf("Temperatura a ser convertida: %.2f ºC%n",tempCelsius);
        System.out.printf("Temperatura convertida: %.2f ºF%n",tempFarenheit);
    }
}
