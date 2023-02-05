import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList arrayList = new ArrayList();

        list.add(2);
        list.add(4);
        list.add(10);
        list.add(14);
        list.add(28);
        list.add(8);
        list.add(64);
        list.add(3);

        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.remove(1);
        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.add(5, 2000);
        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.add(8, 2000);
        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.add(0, 2000);
        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.add(10, 2000);
        System.out.println(list.toPrint());
        System.out.println(list.size());

        list.add(12, 2000);
        System.out.println(list.toPrint());
        System.out.println(list.size());




    }
}