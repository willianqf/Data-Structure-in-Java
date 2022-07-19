package aulajava;

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        for(int x = 0; x < vetor.length; x++)
        {
            Random rand = new Random();
            vetor[x] = rand.nextInt(100);
        }

        for(int x = 0; x < vetor.length; x++)
        {
            for(int y = 0; y < vetor.length; y++)
            {
                if(y != vetor.length - 1)
                {
                    if(vetor[y] > vetor[y + 1])
                    {
                        int salvar = vetor[y + 1];
                        vetor[y + 1] = vetor[y];
                        vetor[y] = salvar;
                    }
                }
            }
        }

        for(int x = 0; x < vetor.length; x++)
        {
            System.out.println("Valor = "+vetor[x]);
        }
        System.out.println("");
    }
}
