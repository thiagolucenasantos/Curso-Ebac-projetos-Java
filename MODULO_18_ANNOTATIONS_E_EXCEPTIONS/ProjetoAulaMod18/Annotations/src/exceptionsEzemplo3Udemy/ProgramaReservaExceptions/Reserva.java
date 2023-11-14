package exceptionsEzemplo3Udemy.ProgramaReservaExceptions;

import exceptionsEzemplo3Udemy.ProgramaReservaExceptions.ExceptionPersonalizada.DomainException;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reserva {
    private Integer quartoNumero;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    //reparar que no método utilizamos o throws para propagar o DomainException, assim fazendo o efeito desejado
    public Reserva(Integer quartoNumero, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)){
            throw new DomainException("Data do check-out precisa ser depois de check-in");
        }
        this.quartoNumero = quartoNumero;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getQuartoNumero() {
        return quartoNumero;
    }

    public void setQuartoNumero(Integer quartoNumero) {
        this.quartoNumero = quartoNumero;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    public long duracao(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if (checkIn.after(now) || checkOut.after(now)){
            throw new DomainException("Data da reserva precisa ser futura");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out precise ser depois da data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Reserva: " +
                "quartoNumero: " + quartoNumero +
                ", check-in: " +
                dataFormatada.format(checkIn)+
                ", check-out: " +
                dataFormatada.format(checkOut)+
                "," +
                +duracao() +
                " noites";

    }
}
