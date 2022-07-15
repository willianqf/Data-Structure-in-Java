import java.util.Scanner; ////BIBLIOTECA DE LEITURA DAS VARIÁVEIS
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random; ///BIBLIOTECA DE NÚMEROS ALEATORIO
import java.util.List;
import newpaths.*;

public class AulaJava{

    private final Boolean constante = false;  //Define uma constante 'FINAL'
    public static void JavaAula1(){
        /////////////////AULA 1/////////////////////////////
        int fogo;
        fogo = 5*(2+3);
        System.out.printf("Valor bem louco: %d", fogo);
        ///PRINTAR TELA////////////////////////////////////
        ///System.out.println("Olá Mundo: ");
        ///System.out.print("Olá moises");
        ///System.out.printf("Olá gigabyte");
        ///////////////////////////////////////////////////
    }
    public static void JavaAula2(){
        //////////// USANDO CONDIÇÕES IF, ELSE, SWITCH ///////////////////
        float altura = 1.85f;
        int idade = 16;
        String nome = "Carlos";
        if(idade < 18){
            System.out.print("Carlos é de menor: \nIdade:"+idade);
        }else{
            System.out.println("Carlos é de maior: \nIdade:"+idade);
        }
        
        //(Condição ? retorno verdadeiro : retorno falso)
        idade = (nome != "Carlos" ? 15 : 17);
        System.out.print("\n"+idade);
        
        ////////////////SWITCH CASE////////////////////////
        switch(idade){
            case 15:
                System.out.printf("Quinze");
                break;
            case 17:
                System.out.printf("Dezessete");
                break;
            default:
                System.out.printf("Valor desconhecido");
                break;
        }

    }
    public static void JavaAula3(){
        /////////////FAZER LEITURA NO TECLADO/////////////////
        //////USAR BIBLIOTECA (JAVA.UTIL.SCANNER)///////////////
        final int t = 41; // FINAL DEFINE A CONSTANTE / FINAL = CONSTANTE
        int x = 0;
        String b;
        Scanner leitura = new Scanner(System.in);
        //OBS: Quando você faz leitura de string por ultimo, as outras não lêem!//
        System.out.print("VALOR STRING: ");
        b = leitura.nextLine();
        System.out.print("VALOR NUMERICO: ");
        x = leitura.nextInt();
        System.out.printf("\nValor digitado: "+b+"\nValor: "+x);
        /*
            definir classe e usar métodos
            nextInt - Leitura de inteiros
            nextLine - Leitura de Strings

        */
        leitura.close();
    
    }
    public static void JavaAula4(){
        /// USANDO LOOPS ; FOR, WHILE, DO WHILE ///
        ///FOR
        int x = 500;
        for(int b = 501; b <= x; b++){
            System.out.printf("\nRepetiu: "+b);
        }
        ///WHILE
        int b = 0;
        while(b > 500){
            System.out.printf("\nRepetiu: "+b);
            b++;
        }
        b = 0;
        ///DO WHILE
        do{
            System.out.printf("\nRepetiu: "+b);
        }while(b < 100000);
    }
    public static void JavaAula5(){
        /////// CRIANDO ARRAY/VETOR EM JAVA ///////////
        Scanner leitura = new Scanner(System.in);
        final int constante = 5; //FINAL DEFINE CONSTANTE
        char[] letras = {'a', 'b', 'c', 'e'};
        int[] test = new int[5];
        float[] test2 = new float[3];
        double[] test3 = {5, 2, 4, 6.1, 12.26, 25.2};
        test[0] = 5;
        test[3] = 12;
        test2[1] = 2.5f;
        System.out.printf("Test[0] = %d\nTest[3] = %d\nTest2[1] = %.2f\nTest3[5] = %.2f", test[0], test[3], test2[1], test3[5]);
        for(double te : test3){ //// EQUIVALE AO FOREACH DO C# /////
            System.out.printf("\nValor = %.2f", te);
        }
        System.out.print("\n");
        letras[3] = leitura.nextLine().charAt(0); //charAt = Faz a leitura de posi de um char
        for(char te : letras){
            System.out.printf("\nValor = %s", te);
        }
        leitura.close();

    }
    public static void JavaAula6(){
        ////////// ARRAYS : MÉTODOS ////////////
        int[] valores = {0, 12, 5, 7, 1, 2, 12};
        int[] valores2 = new int[7];
        Arrays.sort(valores); // Método de ordenação de uma Array (sort)
        Arrays.fill(valores, 5); // Preenche valores de uma Array <Array, "numero">
        /////System.arraycopy(<Array Origem>, <Posi inicio da copia>, <Array Destino>, <Posi destino>, <Quantidade Copias>);
        System.arraycopy(valores, 0, valores2, 0, valores.length);
        ///PESQUISAR SE EXISTE O ELEMENTO NO VETOR
        ///Arrays.binarySearch(<vetor>, <elemento a pesquisar>) - Retorna a posição do número na Array (Se não tiver retorna nulo)
        Boolean test = Arrays.equals(valores, valores2);
        for(int val : valores2){ // FOR PARA LER ELEMENTOS DE UM ARRAY
            System.out.printf("\nVal = "+val);
        }
        System.out.printf("\n"+test);

    }

    public static void JavaAula7(){
        /////// USANDO MATRIZES EM JAVA ///////
        final int coluna = 3;
        final int linha = 3;
        int[][] matriz = new int[linha][coluna];
        int[][] matriz2={{5,7,1,2},{6,8,1,2},{4,5,6,7},{241,3412,34,2}};
        ///for (int[] is : matriz) {
        ///    System.out.print(is+"\n");
        ///}
        for(int x = 0; x <  linha; x++){
            for(int y = 0; y < coluna; y++){
                matriz[x][y] = new SecureRandom().nextInt(250);
            }
        }
        for(int x = 0; x <  linha; x++){
            System.out.print("\n");
            for(int y = 0; y < coluna; y++){
                System.out.print(matriz[x][y]+" ");
            }
        }

        for (int[] is : matriz2) {
            System.out.print("\n");
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
        }
    }

    public static int JavaAula8(int... listarray){ /// CRIA QUANTIDADES DE PARÂMETROS INDERTERMINADOS 
        int soma = 0;                              /// PARA DETERMINADO TIPO
        for (int i : listarray) {
            soma+=i;
        }
        return soma;
    }

    public static void JavaAula9(){
        //// TRABALHANDO COM CLASSES EM JAVA ///
        int valor = 0;
        /*
        Teste ob1 = new Teste("Seu feio");
        Teste ob2 = new Teste("Seu horroso");
        Teste ob3 = new Teste("Apenas testes", valor++); ///Adiciona o valor e incrementa
        Teste ob4 = new Teste("Apenas testes", valor++);
        Teste ob5 = new Teste("Apenas testes", ++valor); ///Incrementa e adiciona o valor
        Teste ob6 = new Teste("Apenas testes", ++valor);
        */
        //ob2.setvalor("Mudou valor");
        //System.out.print(ob2.getvalor());
    }

    public static void JavaAula10(){ 
        ///TRABALHANDO COM HERANÇA EM JAVA//////
        ////////////////////////////////
        heranca valor = new heranca("Teste fora do path", "Josefa", "22536487-22");
        //Teste valor2 = new Teste("Teste2");
        //System.out.print(valor.getvalor());
        //System.out.print(valor.PegarValor()+"\n");
        //System.out.print(valor2.PegarValor());
        //valor.valores;
    }

    public static void JavaAula11(){
        /// INTERFACE EM CLASSES COM JAVA ////
        //////////////////////////////////////
        interfaces2 nova = new interfaces2();
        nova.DizerOi();
        //nova.SetarValores();
    }

    public static void JavaAula12(){
        /// USANDO CLASSES ABSTRATAS ////
        //////////////////////////////////////
        ///classesabstratas nova = new classesabstratas(); Classes abstratas não podem ser instânciadas
        overrid test = new overrid("Fogo", "Idade", "16");
        test.info();
    }

    public static void JavaAula13(){
        ///////// USANDO SWITCH CASE ////////////////
        int valor = 2;
        switch(valor){
            case 1:
                System.out.print("valor 1");
                break;
            case 2:
                System.out.print("valor 2");
                break;
            default:
                System.out.print("valor fora do Switch");
                break;
        }
        ///////// USANDO O CONTINUE //////////////////////////////////////////////
        //////// O CONTINUE NÃO INTERROMPE O LAÇO, PORÉM INTERROMPE O MOMENTO /////////
        for(int x = 0; x < 15; x++){
            if(x > 5 && x < 10){
                continue;
            }
            System.out.print("Valor x = "+x);
        }
    }

    public static void JavaAula14(){
        /////////// CRIANDO ARRAYS //////////////////////
        int[] num1 = new int[15];
        String[] num2 = new String[5];
        int[] num3 = new int[15];
        Random Gerar = new Random(); /// Objeto de números aleatórios /////
        for(int x = 0;x < num1.length;x++){
            num1[x] = Gerar.nextInt(1000);
        }
        for (int i : num1) {
            System.out.print(i+" - ");
        }
        Boolean resu = num1.equals(num3);
        //Boolean resu = num1.getClass().getSimpleName() == num2.getClass().getSimpleName() ? true:false;
        //System.out.print(resu);
        /*
        testx[] novo = new testx[5];
        for (int x = 0; x < novo.length; x++) {
            novo[x] = new testx();
        }
        for (testx teste : novo) {
            teste.ini();
        }
        */

    }
    public static void JavaAula15(){
        System.out.print("Olá, vamos fazer umas breves perguntas para você!\nAperte Enter para começarmos! ");
        Scanner leitura = new Scanner(System.in);
        //String pausa = input.next();
        new java.util.Scanner(System.in).nextLine();
        String[] Perguntas = {"Qual é o nome do meio do seu irmão? \n", 
                              "Qual é o nome do seu cachorro? \n", 
                              "Qual o nome da sua mãe? \n"};

        String[] Respostas = {"A) Rodriguês  | B) Fernandes | C) Matos ",
                              "A) Nany | B) Bob | C) Rodriguilson ",
                              "A) Lorraine | B) Rodramelda | C) Lilian "};

        String[] RespostaAluno = new String[3];
        String[] RespostaGabarito = {"b", "a", "c"};
        int NotaAluno = 0;
        byte contador = 0;
        for (String per : Perguntas) {
            System.out.print(per+Respostas[contador]);
            while(true){
                String valor = leitura.nextLine();
                if (valor.toLowerCase().equals("a") || valor.toLowerCase().equals("b") || valor.toLowerCase().equals("c")){
                    RespostaAluno[contador] = valor;
                    contador++;
                    System.out.print("\n");
                    break;
                }else{
                    System.out.print("Valor incorreto!\n");
                }
            }
        }
        contador = 0;
        for (String resul : RespostaGabarito) {
            if(resul.toLowerCase().equals(RespostaAluno[contador])){
                NotaAluno += 5;
            }
            contador++;
        }
        System.out.print("\nOlá, sua nota final foi de: "+NotaAluno);
    }

    public static void JavaAula16(){
        /// REFERÊNCIA E VALOR  ///
        int[] num = {451,134,25,34};
        int par = 0;
        int impar = 0;
        JavaAula16x(num, par, impar); /// PASSAGEM POR REFERÊNCIA EM JAVA NÃO EXISTE
        /// USO EM C++ ///
        /// JavaAula16x(num[], par*, impar*);
        /// public static void JavaAula16x(int[] num, int &par, int &impar)
        System.out.print(par+"\n"+impar);
    }
    public static void JavaAula16x(int[] valor, int par, int impar){
        for (int i = 0; i < valor.length;i++) {
            if(valor[i]%2 == 0){
                System.out.print("Par\n");
                par+=1;
            }else{
                System.out.print("Impar\n");
                impar+=1;
            }
        }
    }

    public static void main(String[] args){
        JavaAula16();
    }

}

