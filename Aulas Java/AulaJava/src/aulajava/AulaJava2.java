package aulajava;

public class AulaJava2 {
    public static void main(String[] args)
    {
        ListaOrdenada<Cliente> clientes = new ListaOrdenada<Cliente>();
        clientes.Add(new Cliente("JáSilda Meireles Ribeiro", 31));
        clientes.Add(new Cliente("Bolsonaro Jair Messias", 71));
        for(int x = 0; x < clientes.getTamanho(); x++)
        {
            System.out.println("\n\nRegistro "+x+": ");
            System.out.println("Nome: "+clientes.Pegar(x).getValor().getCpf()+"\nIdade: "+clientes.Pegar(x).getValor().getIdade());
            
        }
    }
}
