import java.util.*;

public class ExercicioModulo12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomesHomens = new ArrayList<>();
        List<String> nomesMulheres = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome ou digite 'SAIR' para encerrar");
            String entrada = scanner.nextLine();
            String[] nomesVir = entrada.split(",");

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Digite o sexo M para masculino ou F para Feminino: ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                nomesHomens.add(Arrays.toString(nomesVir));

                Collections.sort(nomesHomens);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesMulheres.add(Arrays.toString(nomesVir));

                Collections.sort(nomesMulheres);
            } else {
                System.out.println("Sexo inválido. M para masculino ou F para feminino.");
            }
        }
        System.out.println("Homens: " + nomesHomens);
        System.out.println("Mulheres: " + nomesMulheres);

    }
}
