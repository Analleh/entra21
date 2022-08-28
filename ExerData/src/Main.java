import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exer1();

    }
    Scanner in = new Scanner(System.in);
    public static void exer1(){
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.getYear());
//        System.out.println(dateTime.getMonth()); // getMonthValue - retorna o número do mês
//        System.out.println(dateTime.getDayOfMonth());
//        System.out.println(dateTime.getHour());
//        System.out.println(dateTime.getMinute());
//        System.out.println(dateTime.getSecond());
//        System.out.println(dateTime.getNano());
//        System.out.println(dateTime.getDayOfYear());
//        System.out.println(dateTime.toLocalDate().isLeapYear());
//        System.out.println(dateTime);


//
        LocalDateTime inicio = LocalDateTime.of(2022, 7, 7, 8, 3,21);
        LocalDateTime fim = LocalDateTime.of(2022,7,7,18 ,25,32);
        Duration bet = Duration.between(inicio, fim).minusHours(1).minusMinutes(30);
        System.out.println(bet);
        System.out.printf("%d:%d:%d\n",bet.toHoursPart(),bet.toMinutesPart(), bet.toSeconds());


//        System.out.println(inicio);
//        System.out.println(fim);
//        LocalDateTime tempDateTime = LocalDateTime.from(inicio);
//        int hours = (int)tempDateTime.until(fim, ChronoUnit.HOURS);
//        tempDateTime = tempDateTime.plusHours(hours);
//        int minutes = (int)tempDateTime.until(fim, ChronoUnit.MINUTES);
//        tempDateTime = tempDateTime.plusMinutes(minutes);
//        int seconds = (int)tempDateTime.until(fim, ChronoUnit.SECONDS);
//
//        System.out.println(LocalTime.of(hours, minutes, seconds).minusHours(1).minusMinutes(30));


        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH 'horas', mm 'minutos e' ss 'segundos'")));

//        period - data
//        duration - hora
//        RuntimeException
    }
    public static void exer2(){
        Scanner in = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Informe um número");
                System.out.println(in.nextInt());
            }catch (InputMismatchException e){
                in.nextLine();
                //throw  new RuntimeException("Não é um número");
                System.err.println("Não é um número");
            }
        }

    }
    // da para encadear vários catch dentro do try e depois colocar finally, ou seja , se não cair em nenhum dos catch, vai cair no finally
}

