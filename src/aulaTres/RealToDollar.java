package aulaTres;

import java.util.Date;

public class RealToDollar {
    public static void main(String[] args) {
        final double quote = 5.17; //Cotacao em 21-09-2022
        double valueReal = 10.00;
        double valueDollar = valueReal/quote;
        System.out.println("------------------ Conversão de moedas ------------------");
        System.out.printf("Cotação do dólar em 21-09-2022: US$1.00 -> R$ %.2f %n",quote);
        System.out.printf("Valor em real a ser convertido: R$ %.2f %n",valueReal);
        System.out.printf("Valor convertido em dólar: US$ %.2f %n",valueDollar);
    }
}
