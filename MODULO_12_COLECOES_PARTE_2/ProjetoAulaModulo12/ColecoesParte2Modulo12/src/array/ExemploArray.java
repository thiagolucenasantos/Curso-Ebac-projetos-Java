package array;

public class ExemploArray {
    public static void main(String[] args) {
        declaracaoDeArray();
        tamanhoDoArray();
        percorrendoArray();
        percorrendoArrayExemplo2();
        arrayBidimensional();
       
    }

    private static void declaracaoDeArray() {
        System.out.println("****declaracaoDeArray****");
        // adicionamos [] para iniciar a declaração de um array
        //tipo da variável + [] + nome variável = intanciar o array ex: new int[] -> obrigatório informar o número de posições do array
        int[] a = new int[4];
        //outra maneira de declarar um array
        int[] b;
        b = new int[10];

        //declarando vários arrays na mesma linha, não muito comum
        int[] r = new int[33], k = new int[65];

        //{} -> inicializando valores em um array diretamente
        int[] iniciaValores = {23,4,56,7,8};

        //declara um array de inteiros, utilizando o segundo exemplo
        int[] meuArray;

        //alocando memória para 10 inteiros
        meuArray = new int[10];

        //inicializando o primeiro elemento
        //nosso array tem 10 posições então ele vai de 0 a 9
        meuArray[0] = 100;
        meuArray[1] = 22;
        meuArray[2] = 37;
        meuArray[3] = 94;
        meuArray[4] = 44;
        meuArray[5] = 84;
        meuArray[6] = 389;
        meuArray[7] = 44;
        meuArray[8] = 22;
        meuArray[9] = 11;
        //imprimindo posição desejada
        System.out.println(meuArray[6]);
        System.out.println(meuArray[4]);
    }
    private static void tamanhoDoArray() {
        System.out.println("****tamanhoDoArray****");
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7};

        if (array1.length > 9){ //.length podemos verificar o tamanho do array
            System.out.println("Esse array é maior ou igual 9 posições");
        }else{
            System.out.println("Menor que 9 posições");
        }
        System.out.println("Tamanho do array1 é: " + array1.length);
        System.out.println("Tamanho do array2 é: " + array2.length);
    }

    private static void percorrendoArray() {
        System.out.println("****percorrendoArray****");

        int[] arrayNum = {20,30,40,20};
        int total = 0;

        for (int i : arrayNum){
            total += i;
        }
        System.out.println("Soma total do array" + total);
    }
    public static void percorrendoArrayExemplo2(){
        System.out.println("****percorrendoArrayExemplo2****");
        int[] arrayNum = {20,34,56};
        for (int i = 0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]);
        }
    }
    public static void arrayBidimensional(){
        System.out.println("****arrayBidimensional****");
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2,3}, {4}, {5,6,7}};

        System.out.println("Valores array1");
        saidaArray(array1);//chamando o método para percorrer o array
        System.out.println("Valores array2");
        saidaArray(array2);//chamando o método para percorrer o array
    }
    //método para percorrer o array Bidimensional
    public static void saidaArray(int[][] array){ //passando paramentros dentro do método para ser utilizado no for
        //fazendo loop pelas linhas
        for (int linha = 0; linha < array.length; linha++){
        // fazendo loops pelas cplunas
        for (int colunas = 0; colunas < array[linha].length; colunas++) {
            System.out.printf("%d", array[linha][colunas]);
            System.out.println();
           }
        }
    }
}
