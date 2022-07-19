package aulajava;

public class Interacoes<TIPO> {
    private Elemento<TIPO> primeiro;
    private boolean cont = true;
    public Interacoes(Elemento<TIPO> newElement){
        this.primeiro = newElement;
    }
    
    public boolean TemProximo()
    {
        if(!(primeiro.getProximo() == null))
        {
            return true;
        }else
        {
            return false;
        }
    }

    public Elemento<TIPO> PegarElemento()
    {
        if(cont)
        {
            cont = false;
            return this.primeiro;
        }
        else
        {
            this.primeiro = this.primeiro.getProximo();
        }
        return this.primeiro;
    }
}
