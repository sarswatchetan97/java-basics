import java.util.*;

public class CollectionFramework1 {
    public static void main(String[] args) {
        //List or collection -> interface
        //Below all 3 can be used to declare array list.
        ArrayList<Integer> arrayList = new ArrayList<>();

//        List<String> list = new ArrayList<>();
//        Collection<String> collection = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);
        arrayList.add(40);
        System.out.println(arrayList);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(101);
        arrayList2.add(102);
        System.out.println(arrayList2);
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);

        arrayList2.removeAll(arrayList);
        System.out.println(arrayList2);

        System.out.println(arrayList2.size());
        arrayList2.clear();
        System.out.println(arrayList2.size());

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println("List - " + list);
        System.out.println("Element at index 1 is " + list.get(1));
        list.set(1, 25);
        System.out.println("After set - " + list);
        System.out.println(list.contains(11));

        //toArray
        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        list.add(35);
        list.add(2);
        list.add(50);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> newArrayList = (ArrayList<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println(newArrayList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        System.out.println(list.indexOf(35));

        list.add(25);
        list.add(35);
        list.add(30);
        list.add(50);

        System.out.println(list);
        System.out.println(list.lastIndexOf(30));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addFirst(2);
        ll.addLast(3);
        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());

        ll.offer(5);
        ll.offer(6);
        ll.offer(7);

        System.out.println(ll);

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(31);
        integerStack.push(42);
        integerStack.push(53);
        integerStack.push(64);

        System.out.println(integerStack);

        System.out.println(integerStack.pop());

        System.out.println(integerStack);

        System.out.println(integerStack.peek());

        System.out.println(integerStack.search(42));

        System.out.println(integerStack.empty());
    }
}
