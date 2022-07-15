public class overrid extends heranca {
    public overrid(String valor1, String valor2, String valor3){
        super(valor1, valor2, valor3);
    }
    // Override garante que um método não será modificado após ser sobrescrito
    @Override
    /*
    public void infoe(){
        
    }
    */
    public void info(){
        System.out.print("Sobrescrito!");
    }

}
