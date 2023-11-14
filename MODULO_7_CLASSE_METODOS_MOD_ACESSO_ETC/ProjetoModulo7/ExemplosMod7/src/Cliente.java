public class Cliente {
    //Gerando javadoc, clicar na lupa e escrever javadoc, irá aparecer
    //Para gerar a documentação clicar cm botão direito em generate
    /**
   * @author Thiago
   * @return public String getEndereco() descreva o retorno do método
    * @deprecated - está depreciado não será mais utilizado
     * @see public void setCodigo(int codigo) o método que tem que começar a olhar
     */

    //Criando 3 variáveis dentro de cliente privadas, modelo padrão correto,
    //para acessar as variáveis utilizar os getter e setters
    private int codigo;
    private String nome;
    private String endereco;

    //CRIANDO 7 MÉTODOS UTILIZANDO GETTER E SETTER, UTLIZANDO O BOTÃO DIREITO DO MOUSE + GENERATE + GETTER E SETTER
    //TECLA DE ATALHO PARA GENERATE ALT + INSERT

    //A FUNÇÃO DE GETTER E SETTER É SOMENTE ESSAS GETTER RETORNA VALOR E SETTER ADICIONAR VALOR
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {   //get quer dizer que eu vou pegar um valor desse método
        return endereco;
    }

    public void setEndereco(String endereco) { // set que vamos adicionar um valor a esse método
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco){
        this.endereco = endereco;

    }
    public void imprimirEndereco(){ //nesse caso não foi passado parametro, então ele não retorna nada, somente pega o endereço e imprime
        System.out.println(this.endereco);
    }

    public String enderecoDoThiago(){

        return "Endereço do Thiago";
    }
    public int getValorTotal(){
        return 20;
    }
}
