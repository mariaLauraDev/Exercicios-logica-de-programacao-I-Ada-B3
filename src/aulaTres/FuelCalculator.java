package aulaTres;

public class FuelCalculator {
    public static void main(String[] args) {
        double distancePerliters = 12.0; // unidade em km
        double timeSpent = 2; // unidade em horas
        double averageSpeed = 80.0; // unidade em km/h
        double tripDistance = timeSpent*averageSpeed;
        double litersUsed = tripDistance/distancePerliters;
        System.out.println("------------------ Calculadora de Combustível ------------------");
        System.out.println("Valores de análise: ");
        System.out.printf("Distância por 1 litro: %.2f km%n",distancePerliters);
        System.out.printf("Tempo gasto na viagem: %.2f h%n",timeSpent);
        System.out.printf("Velocidade média: %.2f km/h%n",averageSpeed);
        System.out.println("-------------------------RESULTADOS-----------------------------");
        System.out.printf("Distância de viagem: %.2f km%n",tripDistance);
        System.out.printf("Quantidade de combustível gasto : %.2f L%n",litersUsed);
    }
}
