package br.com.thiago.Hamburgueria;

public class Hamburguer {

    private String bun = "Bun";
    private String carne = "Carne";
    private String salada = "Salada";
    private String queijo = "Queijo";
    private String sauca = "Sauça";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setSauca(String sauca) {
        this.sauca = sauca;
    }
    public void print() {
        System.out.println(
                "Hamburguer Feito!! "+
                "bun='" + bun + '\'' +
                ", carne='" + carne + '\'' +
                ", salada='" + salada + '\'' +
                ", queijo='" + queijo + '\'' +
                ", sauca='" + sauca);

    }
}
