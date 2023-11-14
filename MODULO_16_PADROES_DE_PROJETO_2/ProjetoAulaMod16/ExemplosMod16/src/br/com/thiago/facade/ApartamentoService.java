package br.com.thiago.facade;
// A partir do método chamado na interface, implementamos em outra classe a regra de negócio, toda a complexidade do código.
//implementando a interface dentro desta classe.
public class ApartamentoService implements IApartamentoService {
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        }

        return null;
    }
    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        //ir no banco e verificar se está cadastrado
        return false;
    }
    private Boolean isCamposValidos(Apartamento apartamento){
        return true;
    }
}
