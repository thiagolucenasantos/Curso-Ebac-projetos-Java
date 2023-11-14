import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("Digite suas notas");

        System.out.print("Nota 1: ");
        int nota1 = notas.nextInt();
        System.out.print("Nota 2: ");
        int nota2 = notas.nextInt();
        System.out.print("Nota 3: ");
        int nota3 = notas.nextInt();
        System.out.print("Nota 4: ");
        int nota4 = notas.nextInt();

        int soma = nota1 + nota2+ nota3+ nota4;
        System.out.println("A soma de suas notas foi: " + soma);
        int media = soma / 4;
        System.out.println("Sua média é " + media);

        if (media >= 7){
            System.out.println("Parabens, você está aprovado!!");
        } else if (media >= 5) {
            System.out.println("Está de recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
