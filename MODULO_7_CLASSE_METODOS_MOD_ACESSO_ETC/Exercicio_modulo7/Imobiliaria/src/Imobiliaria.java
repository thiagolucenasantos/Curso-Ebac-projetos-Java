public class Imobiliaria{

    private String nome;
    private int codigo;
    private String endereco;

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String nomePropetario(){
        return "João";
    }

    public double setrepasseAluguel(){
      return 1500.00;

    }
    public void setendProprietario(String endereco){
        this.endereco = endereco;
    }
}
