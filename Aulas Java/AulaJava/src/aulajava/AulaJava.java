package aulajava;

import java.util.Random;

public class AulaJava {
    public static void main(String[] args) {
        ListaOrdenada<Integer> x = new ListaOrdenada<Integer>();
        x.Add(15);
        //x.Add(32);
        //x.Add(51);
        //x.Add(74);
        System.out.println("Tamanho da Lista: "+x.getTamanho());
        System.out.println("O primeiro elemento: "+x.getPrimeiro().getValor());
        System.out.println("O ultimo elemento: "+x.getUltimo().getValor());
        System.out.println("Pegar a terceira posição: "+x.Pegar(2).getValor());
        for(int y = 0; y < x.getTamanho(); y++)
        {
            System.out.println("Posi "+y+": "+x.Pegar(y).getValor());
        }
        x.Remover(0);
        //System.out.println("A nova terceira posição: "+x.Pegar(2).getValor());
        for(int y = 0; y < x.getTamanho(); y++)
        {
            System.out.println("Posi "+y+": "+x.Pegar(y).getValor());
        }
        //x.Add(104);
        System.out.println("Adicionou o 104");
        x.Add(61);
        x.Add(31);
        for(int y = 0; y < x.getTamanho(); y++)
        {
            System.out.println("Posi "+y+": "+x.Pegar(y).getValor());
        }

        System.out.println("");
    }   
}
