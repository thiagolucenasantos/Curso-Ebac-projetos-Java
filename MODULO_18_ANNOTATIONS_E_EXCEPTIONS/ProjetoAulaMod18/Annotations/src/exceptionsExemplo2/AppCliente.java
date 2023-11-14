package exceptionsExemplo2;

import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do cliente aqui");
        String codigo = scanner.next();

        //para chamar o método cliente foi preciso colocar static no método que está em ClienteService
        try {
            ClienteService.consultarCliente(codigo);
        } catch (ClienteNaoEncontratoException e) {
            System.out.println(e.getMessage());
        }

    }
}
