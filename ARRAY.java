import java.util.ArrayList;

public class ARRAY {
    public static void main(String[] args) {
        int x;
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        ArrayList<Integer> numbers1= new ArrayList<Integer>();

        numbers.add(40);
        numbers.add(77);
        numbers.add(55);
        System.out.println(numbers);
        for (int i=0;i<3;i++)
        {
         x=numbers.get(i)*3;
         numbers1.add(x);
        }
        System.out.println(numbers1);
    }
}



