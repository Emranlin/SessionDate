import data.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(1, 2, 2014);
        System.out.println(date);


        date.setMouth(12);
        date.setDay(9);
        date.setYear(2099);
        System.out.println(date);
        System.out.println("Month: " + date.getMouth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());



        System.out.println(date);
    }
}