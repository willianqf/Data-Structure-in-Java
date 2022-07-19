package aulajava;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
        ArrayList<Integer> listaJava = new ArrayList<Integer>();


        ArrayList<Long> media = new ArrayList<Long>();
        //
        int limite = 100000;
        ////////////////// SALVANDO VALORES //////////////////////////////////////////
        long TempoInicial = System.currentTimeMillis();
        for(int x = 0; x < limite; x++)
        {
            //listaJava.add(x);
            lista.Add(x);
        }
        long TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para Salvar ListaOrdenada: "+(TempoFinal - TempoInicial)+"\n\n");
        /////////////////
        TempoInicial = System.currentTimeMillis();
        for(int x = 0; x < limite; x++)
        {
            //listaJava.add(x);
            listaJava.add(x);
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para Salvar ListaJava: "+(TempoFinal - TempoInicial)+"\n\n");

        ///////////////////////////////Pegando valor /////////////////////////////////////////
        TempoInicial = System.currentTimeMillis();
        /*
        for(int x = 0; x < lista.getTamanho(); x++)
        {
            //listaJava.add(x);
            lista.Pegar(x);
        }
        */
        Interacoes<Integer> interaco = new Interacoes<Integer>(lista.getPrimeiro());
        while(interaco.TemProximo())
        {
            interaco.PegarElemento().getValor();
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para pegar os valores ListaOrdenada: "+(TempoFinal - TempoInicial)+"\n\n");

        /////////

        TempoInicial = System.currentTimeMillis();
        for(int x = 0; x < listaJava.size(); x++)
        {
            listaJava.get(x);
            //lista.getPrimeiro().getValor();
        }
        TempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para pegar os valores ListaJava: "+(TempoFinal - TempoInicial)+"\n\n");
        System.out.println("ListaJava.Size: "+listaJava.size()+"\nListaOrdenada.getTamanho: "+lista.getTamanho());


    }
}
