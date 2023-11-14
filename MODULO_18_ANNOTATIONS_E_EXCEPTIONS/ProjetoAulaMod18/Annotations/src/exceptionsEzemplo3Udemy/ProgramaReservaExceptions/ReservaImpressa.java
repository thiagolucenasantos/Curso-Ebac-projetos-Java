package exceptionsEzemplo3Udemy.ProgramaReservaExceptions;

import exceptionsEzemplo3Udemy.ProgramaReservaExceptions.ExceptionPersonalizada.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservaImpressa {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Número do quarto: ");
            int numeroQuarto = scanner.nextInt();
            System.out.println("Data Check-in: (dd/MM/yyyy): ");
            Date checkIn = dataFormatada.parse(scanner.next());
            System.out.println("Data Check-out: (dd/MM/yyyy): ");
            Date checkOut = dataFormatada.parse(scanner.next());

            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a atualização da data de entrada:");
            System.out.println("Check-in: (dd/MM/yyy)");
            checkIn = dataFormatada.parse(scanner.next());

            System.out.println("Entre com a atualização da data de saída:");
            System.out.println("Check-out: (dd/MM/yyy)");
            checkOut = dataFormatada.parse(scanner.next());

            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }catch (ParseException e){
            System.out.println("Formato de data inválido");
        }catch (DomainException i){
            System.out.println("Erro na reserva: " + i.getMessage());
        }catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }
            scanner.close();
        }

    }
