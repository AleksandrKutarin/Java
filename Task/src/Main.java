import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().getHour());
        clock Myclock = new clock();
        Myclock.PrintDisplay();
        System.out.println("//////////////////////");
        clock SeconClock = new clock("Gshock", 5000);
        SeconClock.PrintDisplay();
        System.out.println("//////////////////////");
        clock thedClock = new clock("Casio", 50000, 10 , 37);
        thedClock.PrintDisplay();
        System.out.println("//////////////////////");
        thedClock.pluseTime(5, 12);
        thedClock.PrintDisplay();
        //System.out.println(thedClock);
        System.out.println("//////////////////////");
    }
}
