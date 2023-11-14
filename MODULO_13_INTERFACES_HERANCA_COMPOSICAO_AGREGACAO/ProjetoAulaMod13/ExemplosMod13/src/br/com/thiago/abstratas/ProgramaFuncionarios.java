package br.com.thiago.abstratas;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        System.out.println("***Assalariado***");
        Assalariado empregado = new Assalariado();
        empregado.setNome("Thiago");
        empregado.setSobrenome("Santos");
        empregado.setCpf("344.245.333-33");
        empregado.setSalario(12000.00);
        empregado(empregado);

        System.out.println("\n***Comissionado***");
        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Carlos");
        comissionado.setSobrenome("Santos");
        comissionado.setCpf("344.245.333-33");
        comissionado.setTotalVenda(500.00);
        comissionado.setTotalComissao(0.5d);
        empregado(comissionado);

        System.out.println("\n***Horista***");
        Horista horista = new Horista();
        horista.setNome("Roberto");
        horista.setSobrenome("Santos");
        horista.setCpf("344.245.333-33");
        horista.setHoraTrabalhada(200d);
        horista.setPrecoHora(30d);
       //impressão utilizando o método empregado
        empregado(horista);
    }

    //função para facilitar a impressão dos funcionários
    public static void empregado(Empregado empregado){
        //exemplo de casting da classse pai para a classe filha
        if (empregado instanceof Horista hor){
            System.out.println(hor.getPrecoHora());
        }
        empregado.sobreNome(); // utilizando o método sobreNome criando na classe pai Empregado
        empregado.imprimirValores();// utilizando o método imprimirValores criando na classe pai Empregado
        System.out.println(empregado.getNome() + " tem de salário: " + empregado.vencimento());
    }

}
