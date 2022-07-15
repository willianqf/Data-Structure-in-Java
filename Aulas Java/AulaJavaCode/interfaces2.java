public class interfaces2 implements interfaces {
    public interfaces2(){
    }
    public void PrintarInterfaces(){
        System.out.print("Interface implementada\n");
    }
    public void SetarValores(){
        System.out.print("Valor salvo: "+this.valor);
    }
    public void DizerOi(){
        System.out.print("Oiiiiieeeee\n");
        System.out.print("Nome: "+this.getClass().toGenericString());

    }
}
