import java.util.ArrayList;
public class Arrayno {
    public static void main(String[] args) {
        int x;
        ArrayList <Integer> numbers=new ArrayList<Integer>();
        ArrayList <Integer> numbers1=new ArrayList<Integer>();
        numbers.add(55);
        numbers.add(98);
        numbers.add(89);
        numbers.add(65);
        System.out.println("Actual numbers"+numbers);
        for (int i=0;i<4;i++)
        {
            x=numbers.get(i)*4;
            numbers1.add(x);
        }
        System.out.println("multiplied no are"+numbers1);
    }
}
