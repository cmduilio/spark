import core.CountNonUnique;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static CountNonUnique countNonUnique = new CountNonUnique();

    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1(){
        List<Integer> list = Arrays.asList(1,2,3,4,2,3,4,5,2,3,5); //2,3,4,5 are non unique
        Integer count = countNonUnique.run(list);
        System.out.println("Your Count is: " + count);
    }

    public static void example2(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9); //0 are non unique
        Integer count = countNonUnique.run(list);
        System.out.println("Your Count is: " + count);
    }


}
