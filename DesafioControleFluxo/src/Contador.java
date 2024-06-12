import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        try {
            Scanner terminal = new Scanner(System.in);

            System.out.print("\nDigite o primeiro parametro: ");
            int parametroUm = terminal.nextInt();

            System.out.print("\nDigite o segundo parametro: ");
            int parametroDois = terminal.nextInt();

            terminal.close();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.err.println("\nAtencao, o primeiro parametro deve ser menor que o segundo!\n");
            }

        } catch (InputMismatchException e) {
            System.err.println("\nAtencao, os parametros devem numeros inteiros!\n");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        if(parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        System.out.println("\nContagem:\n");

        for(int i = 0; i < contagem; i++)
        {
            System.out.println("Imprimindo o numero " + (i + 1));
        }
    }
}
