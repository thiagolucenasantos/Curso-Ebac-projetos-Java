public class RepasseAluguel {

    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();
        // Dados Inquilino
        imobiliaria.setNome("Thiago");
        imobiliaria.setCodigo(1);
        imobiliaria.setEndereco("Rua palmas, 10");


        System.out.println(imobiliaria.getNome());
        System.out.println(imobiliaria.getCodigo());
        System.out.println(imobiliaria.getEndereco());

        //Dados Proprietários
        imobiliaria.nomePropetario();
        System.out.println(imobiliaria.nomePropetario());

        System.out.println(imobiliaria.setrepasseAluguel());

        imobiliaria.setendProprietario("Rua javu, 2");
        System.out.println(imobiliaria.getEndereco());



    }
}

