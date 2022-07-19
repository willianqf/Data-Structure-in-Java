package aulajava;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] x = new int[10];
        for(int i = 0; i < x.length; i++)
        {
            x[i] = i * 2;
        }

        int meio = 0;
        int contador = 0;
        int inicio = 0;
        int fim = x.length - 1;
        int numBuscado = 8;
        boolean achou = false;
        while(inicio <= fim)
        {
            contador++;
            meio = (int) (inicio + fim)/2;
            if(x[meio] == numBuscado)
            {
                achou = true;
                break;
            }else if(x[meio] < numBuscado)
            {
                inicio = meio + 1;
            }else
            {
                fim = meio - 1;
            }
        }
        System.out.println("Total contagem: "+contador+"\n"+(achou?"achou":"não achou"));
    }
}
