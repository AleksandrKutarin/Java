import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println(java.time.LocalDateTime.now().getHour());
        Clock myclock = new Clock();
        myclock.PrintDisplay();
        System.out.println("---------------------------------");
        Clock twoclock = new Clock("Часики", 1300);
        myclock.PrintDisplay();
        System.out.println("---------------------------------");
        Clock freeclock = new Clock("Другие часы", 100000, 10, 25);
        freeclock.PrintDisplay();
        System.out.println("---------------------------------");
        freeclock.plusTime(10, 10);
        freeclock.PrintDisplay();
        System.out.println(freeclock);
        System.out.println("---------------------------------");
        freeclock.plusTime(5, 0);
        System.out.println(freeclock);
        System.out.println("---------------------------------");
        ClockS myclocks = new ClockS();
        System.out.println(myclocks);
        myclocks.plusTime(10,10, 5);
        System.out.println(myclocks);
        System.out.println("---------------------------------");
        ClockS twoclocks = new ClockS("New clock", 2500);
        twoclocks.plusTime(10, 1000, 100);
        System.out.println(twoclocks);
        System.out.println("---------------------------------");
        ClockS threeclocks = new ClockS("Chasi", 100, 10,5, 21);
        System.out.println(threeclocks);
        System.out.println("---------------------------------");
        threeclocks.settime(Clock_in.types_arrow.H, 10);
        System.out.println(threeclocks);
        System.out.println("---------------------------------");
    }
}
