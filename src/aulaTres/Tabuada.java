package aulaTres;
//Escreva um programa que informa a tabuada de multiplicação, de um número informado (entre 1-10).

public class Tabuada {
    public static void main(String[] args) {
        int numeroInformado = 5;

        System.out.print("----------- Tabubada do "+numeroInformado+" -----------\n");
        System.out.printf("%d x 1: %d\n",numeroInformado,numeroInformado*1);
        System.out.printf("%d x 2: %d\n",numeroInformado,numeroInformado*2);
        System.out.printf("%d x 3: %d\n",numeroInformado,numeroInformado*3);
        System.out.printf("%d x 4: %d\n",numeroInformado,numeroInformado*4);
        System.out.printf("%d x 5: %d\n",numeroInformado,numeroInformado*5);
        System.out.printf("%d x 6: %d\n",numeroInformado,numeroInformado*6);
        System.out.printf("%d x 7: %d\n",numeroInformado,numeroInformado*7);
        System.out.printf("%d x 8: %d\n",numeroInformado,numeroInformado*8);
        System.out.printf("%d x 9: %d\n",numeroInformado,numeroInformado*9);
        System.out.printf("%d x 10: %d\n",numeroInformado,numeroInformado*10);
    }
}
