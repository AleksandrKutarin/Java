import java.time.LocalDateTime;
public class clock {
    protected String name;
    protected int hours;
    protected int minuts;
    protected int count;

    public clock() {
        this.name = "";
        this.hours = LocalDateTime.now().getHour();
        this.minuts = LocalDateTime.now().getMinute();
        this.count = 0;
    }
    public clock(String _name, int _count){
        this.name = _name;
        this.count = _count;
        this.hours = LocalDateTime.now().getHour();
        this.minuts = LocalDateTime.now().getMinute();
    }
    public clock(String _name, int _count, int Hour, int Min){
        this.name = _name;
        this.count = _count;
        this.hours = Hour;
        this.minuts = Min;
    }
    public int Get_count(){
        return this.count;
    }
    public String Get_name(){

        return this.name;
    }
     public int Get_Hours(){
        return this.hours;
    }
     public int Get_Minut(){
        return this.minuts;
    }

    public void pluseTime(int Hour, int Min){
        this.hours += Hour;
        if(this.hours > 12){
            this.hours %= 12;
        }
        this.minuts += Min;
        if(this.minuts > 12){
            this.minuts %= 12;
        }
    }
    public void PrintDisplay(){
        System.out.println("Имя: " + this.name);
        System.out.println("Стоимость: " + this.count);
        System.out.println("Часы: " + this.hours);
        System.out.println("Минуты: " + this.minuts);
    }

}


