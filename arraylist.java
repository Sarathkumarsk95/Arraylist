import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> Bikes = new ArrayList<String>();
        Bikes.add("bmw");
        Bikes.add("NINJA");
        Bikes.add("YAMAHA");

        Bikes.set(2,"HORNETT");

        System.out.println("bikes are"+Bikes);
        System.out.println(Bikes.contains("bmw"));
        System.out.println(Bikes.get(2));
        System.out.println(Bikes.get(1).toLowerCase());
    }
}
