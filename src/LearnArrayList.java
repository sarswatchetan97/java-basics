import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(5);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(110);

        list.addAll(newList);
        System.out.println(list);

        System.out.println("First element from list " + list.get(0));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);

        System.out.println(integerList);

        for (int i=0; i<integerList.size(); i++) {
            System.out.println("the element is: " + integerList.get(i));
        }

        for (Integer ele: integerList) {
            System.out.println("foreach element is " + ele);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }

        integerList.set(2, 1000);
        System.out.println(integerList);

        System.out.println(integerList.contains(500));

        integerList.remove(1);
        System.out.println(integerList);

        integerList.remove(Integer.valueOf(50));
        System.out.println(integerList);

        integerList.clear();
        System.out.println(integerList);
    }
}
