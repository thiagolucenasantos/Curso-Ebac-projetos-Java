package br.com.thiago;

public class Exemplos {
    //VARIÁVEIS DE ESCOPO DE CLASSE,TEMOS ACESSO DENTRO DO MÉTODO
    private int codigo;
    private long codigoMaior;
    private double valorDecimal1;
    private String Texto;
    private boolean status;

    private float valorDecimal;
    private short shor;
    private byte bi;

    //INSTANCIANDO CONTRUTOR, PODEMOS TER MAIS DE UM CONSTRUTOR
    public Exemplos(){ //CONSTRUTOR PADRÃO (DEFAULT)

    }
    public Exemplos(int val){ //CONSTRUTOR COM PARÃMETRO INTEIRO CHAMANDO A VARIÁVEL CÓDIGO E ALOCANDO NO VAL
        this.codigo = val;
    }

    public int retornarCodigo(){
        this.codigo = 0; //ESCOPO DE MÉTODO, TENDO ACESSO A VARIÁVEL codigo
        return 10;
    }
    public String retornaTexto(){
        return "Thiago";
    }
    public int retorneInteiro(){
        int valor1 = 10; //VARIÁVEL DE ESCOPO DE MÉTODO, SÓ CONSIGO UTILIZAR DENTRE DESSE MÉTODO
        return valor1;  //NÃO ACESSÍVEL EM OUTROS LOCAIS
    }
}
